import React, { useState, useEffect } from 'react';
import { Play, Pause, RotateCcw } from 'lucide-react';

const JavaThreadsVisualization = () => {
  const [step, setStep] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);
  const [thread1State, setThread1State] = useState('ready');
  const [thread2State, setThread2State] = useState('ready');
  const [thread3State, setThread3State] = useState('ready');
  const [mainState, setMainState] = useState('active');
  const [lockOwner, setLockOwner] = useState(null);
  const [logs, setLogs] = useState([]);

  const steps = [
    {
      description: "Inicio: Main crea el objeto compartido 'obj' y 3 hilos",
      action: () => {
        setMainState('active');
        setThread1State('ready');
        setThread2State('ready');
        setThread3State('ready');
        setLockOwner(null);
        setLogs(['Begin main V9']);
      }
    },
    {
      description: "Los 3 hilos se inician con t1.start(), t2.start(), t3.start()",
      action: () => {
        setThread1State('running');
        setThread2State('running');
        setThread3State('running');
        setLogs(prev => [...prev, 'Hilos iniciados...']);
      }
    },
    {
      description: "Hilo1 obtiene el lock de 'obj' y entra a synchronized",
      action: () => {
        setLockOwner('thread1');
        setThread1State('has-lock');
        setLogs(prev => [...prev, 'Pato espera 100 segundos. Thread: Hilo1']);
      }
    },
    {
      description: "Hilo1 llama a obj.wait() - LIBERA el lock y se suspende",
      action: () => {
        setThread1State('waiting');
        setLockOwner(null);
        setLogs(prev => [...prev, 'Hilo1 → WAITING (liberó el lock)']);
      }
    },
    {
      description: "Hilo2 obtiene el lock, imprime y llama a wait()",
      action: () => {
        setLockOwner('thread2');
        setThread2State('has-lock');
        setLogs(prev => [...prev, 'Pato espera 100 segundos. Thread: Hilo2']);
        setTimeout(() => {
          setThread2State('waiting');
          setLockOwner(null);
          setLogs(prev => [...prev, 'Hilo2 → WAITING (liberó el lock)']);
        }, 800);
      }
    },
    {
      description: "Hilo3 obtiene el lock, imprime y llama a wait()",
      action: () => {
        setLockOwner('thread3');
        setThread3State('has-lock');
        setLogs(prev => [...prev, 'Pato espera 100 segundos. Thread: Hilo3']);
        setTimeout(() => {
          setThread3State('waiting');
          setLockOwner(null);
          setLogs(prev => [...prev, 'Hilo3 → WAITING (liberó el lock)']);
        }, 800);
      }
    },
    {
      description: "Main duerme 5 segundos - Los 3 hilos están esperando",
      action: () => {
        setMainState('sleeping');
        setLogs(prev => [...prev, 'Main duerme 5 segundos...']);
      }
    },
    {
      description: "Main despierta y obtiene el lock para llamar notifyAll()",
      action: () => {
        setMainState('active');
        setLockOwner('main');
        setLogs(prev => [...prev, 'Main llama obj.notifyAll()']);
      }
    },
    {
      description: "¡notifyAll() despierta a TODOS los hilos! Pero deben esperar el lock",
      action: () => {
        setThread1State('notified');
        setThread2State('notified');
        setThread3State('notified');
        setLockOwner(null);
        setLogs(prev => [...prev, '🔔 Todos los hilos despertados!', 'Compiten por el lock...']);
      }
    },
    {
      description: "Hilo1 obtiene el lock, sale de wait() y termina",
      action: () => {
        setLockOwner('thread1');
        setThread1State('has-lock');
        setLogs(prev => [...prev, 'Termina wait Thread: Hilo1']);
        setTimeout(() => {
          setThread1State('finished');
          setLockOwner(null);
        }, 800);
      }
    },
    {
      description: "Hilo2 obtiene el lock, sale de wait() y termina",
      action: () => {
        setLockOwner('thread2');
        setThread2State('has-lock');
        setLogs(prev => [...prev, 'Termina wait Thread: Hilo2']);
        setTimeout(() => {
          setThread2State('finished');
          setLockOwner(null);
        }, 800);
      }
    },
    {
      description: "Hilo3 obtiene el lock, sale de wait() y termina",
      action: () => {
        setLockOwner('thread3');
        setThread3State('has-lock');
        setLogs(prev => [...prev, 'Termina wait Thread: Hilo3']);
        setTimeout(() => {
          setThread3State('finished');
          setLockOwner(null);
          setLogs(prev => [...prev, 'End main', '✅ Programa terminado']);
        }, 800);
      }
    }
  ];

  useEffect(() => {
    if (isPlaying && step < steps.length) {
      const timer = setTimeout(() => {
        steps[step].action();
        setStep(step + 1);
      }, 2000);
      return () => clearTimeout(timer);
    } else if (step >= steps.length) {
      setIsPlaying(false);
    }
  }, [isPlaying, step]);

  const reset = () => {
    setStep(0);
    setIsPlaying(false);
    setThread1State('ready');
    setThread2State('ready');
    setThread3State('ready');
    setMainState('active');
    setLockOwner(null);
    setLogs([]);
  };

  const getThreadColor = (state) => {
    switch(state) {
      case 'ready': return 'bg-gray-300';
      case 'running': return 'bg-blue-400';
      case 'has-lock': return 'bg-green-500';
      case 'waiting': return 'bg-yellow-400';
      case 'notified': return 'bg-orange-400';
      case 'finished': return 'bg-purple-500';
      default: return 'bg-gray-300';
    }
  };

  const getStateLabel = (state) => {
    switch(state) {
      case 'ready': return 'Listo';
      case 'running': return 'Corriendo';
      case 'has-lock': return 'Con Lock';
      case 'waiting': return 'WAITING';
      case 'notified': return 'Despertado';
      case 'finished': return 'Terminado';
      default: return '';
    }
  };

  return (
    <div className="w-full max-w-6xl mx-auto p-6 bg-gradient-to-br from-slate-50 to-slate-100 rounded-lg shadow-lg">
      <h2 className="text-3xl font-bold text-center mb-4 text-slate-800">
        wait() y notifyAll() en Java
      </h2>
      
      <div className="bg-white rounded-lg p-6 mb-6 shadow">
        <div className="grid grid-cols-2 gap-8">
          {/* Hilos */}
          <div>
            <h3 className="text-xl font-bold mb-4 text-slate-700">Hilos</h3>
            
            {/* Main Thread */}
            <div className="mb-6 p-4 bg-slate-100 rounded-lg">
              <div className="flex items-center justify-between mb-2">
                <span className="font-bold text-lg">Main Thread</span>
                <span className={`px-3 py-1 rounded text-sm font-semibold ${
                  mainState === 'sleeping' ? 'bg-purple-300' : 'bg-blue-300'
                }`}>
                  {mainState === 'sleeping' ? '😴 Durmiendo' : '▶️ Activo'}
                </span>
              </div>
            </div>

            {/* Thread 1 */}
            <div className="mb-4 relative">
              <div className={`p-4 rounded-lg transition-all duration-500 ${getThreadColor(thread1State)}`}>
                <div className="flex items-center justify-between">
                  <span className="font-bold text-white">Hilo1</span>
                  <span className="text-sm font-semibold text-white">{getStateLabel(thread1State)}</span>
                </div>
                {lockOwner === 'thread1' && (
                  <div className="mt-2 text-white font-bold animate-pulse">🔒 Tiene el Lock</div>
                )}
              </div>
              {thread1State === 'waiting' && (
                <div className="absolute -right-2 top-1/2 transform -translate-y-1/2 animate-bounce">
                  ⏳
                </div>
              )}
            </div>

            {/* Thread 2 */}
            <div className="mb-4 relative">
              <div className={`p-4 rounded-lg transition-all duration-500 ${getThreadColor(thread2State)}`}>
                <div className="flex items-center justify-between">
                  <span className="font-bold text-white">Hilo2</span>
                  <span className="text-sm font-semibold text-white">{getStateLabel(thread2State)}</span>
                </div>
                {lockOwner === 'thread2' && (
                  <div className="mt-2 text-white font-bold animate-pulse">🔒 Tiene el Lock</div>
                )}
              </div>
              {thread2State === 'waiting' && (
                <div className="absolute -right-2 top-1/2 transform -translate-y-1/2 animate-bounce">
                  ⏳
                </div>
              )}
            </div>

            {/* Thread 3 */}
            <div className="mb-4 relative">
              <div className={`p-4 rounded-lg transition-all duration-500 ${getThreadColor(thread3State)}`}>
                <div className="flex items-center justify-between">
                  <span className="font-bold text-white">Hilo3</span>
                  <span className="text-sm font-semibold text-white">{getStateLabel(thread3State)}</span>
                </div>
                {lockOwner === 'thread3' && (
                  <div className="mt-2 text-white font-bold animate-pulse">🔒 Tiene el Lock</div>
                )}
              </div>
              {thread3State === 'waiting' && (
                <div className="absolute -right-2 top-1/2 transform -translate-y-1/2 animate-bounce">
                  ⏳
                </div>
              )}
            </div>
          </div>

          {/* Lock Visual */}
          <div>
            <h3 className="text-xl font-bold mb-4 text-slate-700">Objeto Compartido "obj"</h3>
            <div className="bg-gradient-to-br from-amber-100 to-amber-200 p-8 rounded-lg text-center border-4 border-amber-400">
              <div className="text-6xl mb-4">
                {lockOwner ? '🔒' : '🔓'}
              </div>
              <div className="text-xl font-bold text-amber-900">
                {lockOwner === 'main' && 'Lock: Main Thread'}
                {lockOwner === 'thread1' && 'Lock: Hilo1'}
                {lockOwner === 'thread2' && 'Lock: Hilo2'}
                {lockOwner === 'thread3' && 'Lock: Hilo3'}
                {!lockOwner && 'Lock Disponible'}
              </div>
            </div>

            <div className="mt-6 p-4 bg-blue-50 rounded-lg border-2 border-blue-300">
              <h4 className="font-bold text-blue-900 mb-2">💡 Concepto Clave:</h4>
              <p className="text-sm text-blue-800">
                <strong>wait()</strong> libera el lock y suspende el hilo.<br/>
                <strong>notifyAll()</strong> despierta a TODOS los hilos en espera.<br/>
                Solo un hilo puede tener el lock a la vez.
              </p>
            </div>
          </div>
        </div>
      </div>

      {/* Descripción del paso actual */}
      <div className="bg-indigo-100 border-l-4 border-indigo-600 p-4 mb-6 rounded">
        <p className="text-lg font-semibold text-indigo-900">
          Paso {step + 1}: {step < steps.length ? steps[step].description : 'Completado'}
        </p>
      </div>

      {/* Controles */}
      <div className="flex justify-center gap-4 mb-6">
        <button
          onClick={() => setIsPlaying(!isPlaying)}
          className="flex items-center gap-2 px-6 py-3 bg-blue-600 text-white rounded-lg hover:bg-blue-700 transition-colors font-semibold"
        >
          {isPlaying ? <Pause size={20} /> : <Play size={20} />}
          {isPlaying ? 'Pausar' : 'Reproducir'}
        </button>
        <button
          onClick={reset}
          className="flex items-center gap-2 px-6 py-3 bg-gray-600 text-white rounded-lg hover:bg-gray-700 transition-colors font-semibold"
        >
          <RotateCcw size={20} />
          Reiniciar
        </button>
      </div>

      {/* Logs */}
      <div className="bg-black text-green-400 p-4 rounded-lg font-mono text-sm h-64 overflow-y-auto">
        <div className="font-bold mb-2">📋 Console Output:</div>
        {logs.map((log, idx) => (
          <div key={idx} className="mb-1 animate-fadeIn">
            {log}
          </div>
        ))}
      </div>

      {/* Leyenda */}
      <div className="mt-6 grid grid-cols-3 gap-4 text-sm">
        <div className="flex items-center gap-2">
          <div className="w-6 h-6 bg-blue-400 rounded"></div>
          <span>Corriendo</span>
        </div>
        <div className="flex items-center gap-2">
          <div className="w-6 h-6 bg-green-500 rounded"></div>
          <span>Tiene el Lock</span>
        </div>
        <div className="flex items-center gap-2">
          <div className="w-6 h-6 bg-yellow-400 rounded"></div>
          <span>WAITING (wait())</span>
        </div>
        <div className="flex items-center gap-2">
          <div className="w-6 h-6 bg-orange-400 rounded"></div>
          <span>Despertado (notifyAll)</span>
        </div>
        <div className="flex items-center gap-2">
          <div className="w-6 h-6 bg-purple-500 rounded"></div>
          <span>Terminado</span>
        </div>
      </div>
    </div>
  );
};

export default JavaThreadsVisualization;