import React, { useState, useEffect } from 'react';
import { Play, Pause, RotateCcw } from 'lucide-react';

const PatitosAnimation = () => {
  const [step, setStep] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);
  const [pato1State, setPato1State] = useState('esperando');
  const [pato2State, setPato2State] = useState('esperando');
  const [pato3State, setPato3State] = useState('esperando');
  const [mamaState, setMamaState] = useState('despierta');
  const [quienTieneTelefono, setQuienTieneTelefono] = useState(null);
  const [mensajes, setMensajes] = useState([]);

  const pasos = [
    {
      descripcion: "Mamá Pata tiene un teléfono mágico 📞 y tres patitos quieren usarlo",
      accion: () => {
        setMamaState('despierta');
        setPato1State('esperando');
        setPato2State('esperando');
        setPato3State('esperando');
        setQuienTieneTelefono(null);
        setMensajes(['🏠 Mamá Pata: "Niños, aquí está el teléfono"']);
      }
    },
    {
      descripcion: "¡Los tres patitos corren hacia el teléfono al mismo tiempo!",
      accion: () => {
        setPato1State('corriendo');
        setPato2State('corriendo');
        setPato3State('corriendo');
        setMensajes(prev => [...prev, '🏃 Patito 1, 2 y 3 corren hacia el teléfono']);
      }
    },
    {
      descripcion: "Patito 1 llega primero y toma el teléfono 📞",
      accion: () => {
        setQuienTieneTelefono('pato1');
        setPato1State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 1: "¡Lo tengo! Voy a llamar..."']);
      }
    },
    {
      descripcion: "Patito 1 hace su llamada y se queda dormido esperando 😴",
      accion: () => {
        setPato1State('dormido');
        setQuienTieneTelefono(null);
        setMensajes(prev => [...prev, '😴 Patito 1 deja el teléfono y se duerme']);
      }
    },
    {
      descripcion: "Patito 2 toma el teléfono porque está libre",
      accion: () => {
        setQuienTieneTelefono('pato2');
        setPato2State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 2: "¡Ahora yo! Voy a llamar..."']);
        setTimeout(() => {
          setPato2State('dormido');
          setQuienTieneTelefono(null);
          setMensajes(prev => [...prev, '😴 Patito 2 deja el teléfono y se duerme']);
        }, 800);
      }
    },
    {
      descripcion: "Patito 3 toma el teléfono",
      accion: () => {
        setQuienTieneTelefono('pato3');
        setPato3State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 3: "¡Mi turno! Voy a llamar..."']);
        setTimeout(() => {
          setPato3State('dormido');
          setQuienTieneTelefono(null);
          setMensajes(prev => [...prev, '😴 Patito 3 deja el teléfono y se duerme']);
        }, 800);
      }
    },
    {
      descripcion: "Los 3 patitos están dormidos 😴😴😴. Mamá Pata descansa un rato",
      accion: () => {
        setMamaState('descansando');
        setMensajes(prev => [...prev, '🛋️ Mamá Pata: "Todos duermen, voy a descansar..."']);
      }
    },
    {
      descripcion: "¡Mamá Pata toma el teléfono para despertar a todos!",
      accion: () => {
        setMamaState('despierta');
        setQuienTieneTelefono('mama');
        setMensajes(prev => [...prev, '📞 Mamá Pata toma el teléfono']);
      }
    },
    {
      descripcion: "¡RING RING! 🔔 Mamá llama a TODOS los patitos para despertarlos",
      accion: () => {
        setPato1State('despertando');
        setPato2State('despertando');
        setPato3State('despertando');
        setQuienTieneTelefono(null);
        setMensajes(prev => [...prev, '🔔 Mamá: "¡DESPIERTEN TODOS!"', '😮 Los patitos se despiertan']);
      }
    },
    {
      descripcion: "Patito 1 toma el teléfono y termina su llamada",
      accion: () => {
        setQuienTieneTelefono('pato1');
        setPato1State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 1: "¡Termino mi llamada!"']);
        setTimeout(() => {
          setPato1State('feliz');
          setQuienTieneTelefono(null);
        }, 800);
      }
    },
    {
      descripcion: "Patito 2 toma el teléfono y termina su llamada",
      accion: () => {
        setQuienTieneTelefono('pato2');
        setPato2State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 2: "¡Ahora yo termino!"']);
        setTimeout(() => {
          setPato2State('feliz');
          setQuienTieneTelefono(null);
        }, 800);
      }
    },
    {
      descripcion: "Patito 3 toma el teléfono y termina su llamada. ¡Todos felices! 🎉",
      accion: () => {
        setQuienTieneTelefono('pato3');
        setPato3State('usando-telefono');
        setMensajes(prev => [...prev, '🦆 Patito 3: "¡Yo también!"']);
        setTimeout(() => {
          setPato3State('feliz');
          setQuienTieneTelefono(null);
          setMensajes(prev => [...prev, '🎉 ¡Todos terminaron!', '👏 Mamá: "¡Muy bien, patitos!"']);
        }, 800);
      }
    }
  ];

  useEffect(() => {
    if (isPlaying && step < pasos.length) {
      const timer = setTimeout(() => {
        pasos[step].accion();
        setStep(step + 1);
      }, 2500);
      return () => clearTimeout(timer);
    } else if (step >= pasos.length) {
      setIsPlaying(false);
    }
  }, [isPlaying, step]);

  const reiniciar = () => {
    setStep(0);
    setIsPlaying(false);
    setPato1State('esperando');
    setPato2State('esperando');
    setPato3State('esperando');
    setMamaState('despierta');
    setQuienTieneTelefono(null);
    setMensajes([]);
  };

  const getPatoEmoji = (estado) => {
    switch(estado) {
      case 'esperando': return '🦆';
      case 'corriendo': return '🏃‍♂️';
      case 'usando-telefono': return '📞';
      case 'dormido': return '😴';
      case 'despertando': return '😮';
      case 'feliz': return '😊';
      default: return '🦆';
    }
  };

  const getPatoColor = (estado) => {
    switch(estado) {
      case 'esperando': return 'bg-gray-300';
      case 'corriendo': return 'bg-blue-400';
      case 'usando-telefono': return 'bg-green-400 animate-pulse';
      case 'dormido': return 'bg-purple-400';
      case 'despertando': return 'bg-yellow-400 animate-bounce';
      case 'feliz': return 'bg-pink-400';
      default: return 'bg-gray-300';
    }
  };

  const getEstadoTexto = (estado) => {
    switch(estado) {
      case 'esperando': return 'Esperando';
      case 'corriendo': return '¡Corriendo!';
      case 'usando-telefono': return 'Llamando...';
      case 'dormido': return 'Durmiendo';
      case 'despertando': return '¡Despierto!';
      case 'feliz': return '¡Feliz!';
      default: return '';
    }
  };

  return (
    <div className="w-full max-w-6xl mx-auto p-6 bg-gradient-to-br from-blue-100 via-purple-100 to-pink-100 rounded-lg shadow-lg">
      <h1 className="text-4xl font-bold text-center mb-2 text-purple-800">
        🦆 Los Patitos y el Teléfono Mágico 📞
      </h1>
      <p className="text-center text-lg text-purple-600 mb-6">
        Una historia sobre esperar turnos y compartir
      </p>
      
      <div className="bg-white rounded-lg p-6 mb-6 shadow-xl">
        <div className="grid grid-cols-2 gap-8">
          {/* Patitos */}
          <div>
            <h3 className="text-2xl font-bold mb-4 text-purple-700 flex items-center gap-2">
              <span>🦆</span> Los Patitos
            </h3>
            
            {/* Mamá Pata */}
            <div className="mb-6 p-4 bg-pink-100 rounded-xl border-4 border-pink-300">
              <div className="flex items-center justify-between mb-2">
                <span className="font-bold text-2xl">🦆 Mamá Pata</span>
                <span className={`px-3 py-1 rounded-full text-sm font-bold ${
                  mamaState === 'descansando' ? 'bg-purple-300' : 'bg-green-300'
                }`}>
                  {mamaState === 'descansando' ? '😴 Descansando' : '👀 Despierta'}
                </span>
              </div>
            </div>

            {/* Patito 1 */}
            <div className="mb-4 relative">
              <div className={`p-6 rounded-xl transition-all duration-500 ${getPatoColor(pato1State)} border-4 border-blue-300`}>
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-3">
                    <span className="text-5xl">{getPatoEmoji(pato1State)}</span>
                    <span className="font-bold text-xl text-white">Patito 1</span>
                  </div>
                  <span className="text-lg font-bold text-white">{getEstadoTexto(pato1State)}</span>
                </div>
                {quienTieneTelefono === 'pato1' && (
                  <div className="mt-2 text-white font-bold text-xl animate-pulse">
                    📞 Tiene el teléfono
                  </div>
                )}
              </div>
            </div>

            {/* Patito 2 */}
            <div className="mb-4 relative">
              <div className={`p-6 rounded-xl transition-all duration-500 ${getPatoColor(pato2State)} border-4 border-green-300`}>
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-3">
                    <span className="text-5xl">{getPatoEmoji(pato2State)}</span>
                    <span className="font-bold text-xl text-white">Patito 2</span>
                  </div>
                  <span className="text-lg font-bold text-white">{getEstadoTexto(pato2State)}</span>
                </div>
                {quienTieneTelefono === 'pato2' && (
                  <div className="mt-2 text-white font-bold text-xl animate-pulse">
                    📞 Tiene el teléfono
                  </div>
                )}
              </div>
            </div>

            {/* Patito 3 */}
            <div className="mb-4 relative">
              <div className={`p-6 rounded-xl transition-all duration-500 ${getPatoColor(pato3State)} border-4 border-yellow-300`}>
                <div className="flex items-center justify-between">
                  <div className="flex items-center gap-3">
                    <span className="text-5xl">{getPatoEmoji(pato3State)}</span>
                    <span className="font-bold text-xl text-white">Patito 3</span>
                  </div>
                  <span className="text-lg font-bold text-white">{getEstadoTexto(pato3State)}</span>
                </div>
                {quienTieneTelefono === 'pato3' && (
                  <div className="mt-2 text-white font-bold text-xl animate-pulse">
                    📞 Tiene el teléfono
                  </div>
                )}
              </div>
            </div>
          </div>

          {/* Teléfono Mágico */}
          <div>
            <h3 className="text-2xl font-bold mb-4 text-purple-700 flex items-center gap-2">
              <span>📞</span> El Teléfono Mágico
            </h3>
            <div className="bg-gradient-to-br from-yellow-200 to-orange-200 p-10 rounded-xl text-center border-8 border-yellow-400 shadow-2xl">
              <div className="text-9xl mb-4 animate-bounce">
                {quienTieneTelefono ? '📞' : '📱'}
              </div>
              <div className="text-2xl font-bold text-orange-900">
                {quienTieneTelefono === 'mama' && '👩 Mamá lo tiene'}
                {quienTieneTelefono === 'pato1' && '🦆 Patito 1 lo usa'}
                {quienTieneTelefono === 'pato2' && '🦆 Patito 2 lo usa'}
                {quienTieneTelefono === 'pato3' && '🦆 Patito 3 lo usa'}
                {!quienTieneTelefono && '✨ ¡Está libre!'}
              </div>
            </div>

            <div className="mt-6 p-6 bg-blue-50 rounded-xl border-4 border-blue-300">
              <h4 className="font-bold text-blue-900 mb-3 text-xl">💡 ¿Qué aprendemos?</h4>
              <div className="text-base text-blue-800 space-y-2">
                <p><strong>📞 El teléfono</strong> solo puede usarlo una persona a la vez</p>
                <p><strong>😴 Dormir (wait)</strong> es cuando dejas el teléfono y esperas</p>
                <p><strong>🔔 Llamar a todos (notifyAll)</strong> despierta a todos los patitos</p>
                <p><strong>🎯</strong> Hay que esperar nuestro turno para usar cosas compartidas</p>
              </div>
            </div>
          </div>
        </div>
      </div>

      {/* Historia */}
      <div className="bg-gradient-to-r from-purple-200 to-pink-200 border-l-8 border-purple-600 p-6 mb-6 rounded-xl shadow-lg">
        <p className="text-xl font-bold text-purple-900">
          📖 {step < pasos.length ? pasos[step].descripcion : '¡Historia completada! 🎉'}
        </p>
      </div>

      {/* Controles */}
      <div className="flex justify-center gap-4 mb-6">
        <button
          onClick={() => setIsPlaying(!isPlaying)}
          className="flex items-center gap-3 px-8 py-4 bg-green-500 text-white rounded-xl hover:bg-green-600 transition-colors font-bold text-xl shadow-lg"
        >
          {isPlaying ? <Pause size={28} /> : <Play size={28} />}
          {isPlaying ? 'Pausar' : '▶️ Ver Historia'}
        </button>
        <button
          onClick={reiniciar}
          className="flex items-center gap-3 px-8 py-4 bg-orange-500 text-white rounded-xl hover:bg-orange-600 transition-colors font-bold text-xl shadow-lg"
        >
          <RotateCcw size={28} />
          🔄 Empezar de Nuevo
        </button>
      </div>

      {/* Mensajes */}
      <div className="bg-gradient-to-br from-green-100 to-blue-100 p-6 rounded-xl border-4 border-green-400 h-72 overflow-y-auto shadow-lg">
        <div className="font-bold mb-3 text-2xl text-green-800">💬 Lo que dicen:</div>
        {mensajes.map((mensaje, idx) => (
          <div key={idx} className="mb-3 text-lg bg-white p-3 rounded-lg shadow animate-fadeIn">
            {mensaje}
          </div>
        ))}
      </div>

      {/* Leyenda con emojis */}
      <div className="mt-6 grid grid-cols-3 gap-4 text-base">
        <div className="flex items-center gap-3 bg-white p-3 rounded-lg shadow">
          <span className="text-3xl">🏃‍♂️</span>
          <span className="font-bold">Corriendo</span>
        </div>
        <div className="flex items-center gap-3 bg-white p-3 rounded-lg shadow">
          <span className="text-3xl">📞</span>
          <span className="font-bold">Usando teléfono</span>
        </div>
        <div className="flex items-center gap-3 bg-white p-3 rounded-lg shadow">
          <span className="text-3xl">😴</span>
          <span className="font-bold">Durmiendo</span>
        </div>
        <div className="flex items-center gap-3 bg-white p-3 rounded-lg shadow">
          <span className="text-3xl">😮</span>
          <span className="font-bold">Despertando</span>
        </div>
        <div className="flex items-center gap-3 bg-white p-3 rounded-lg shadow">
          <span className="text-3xl">😊</span>
          <span className="font-bold">Feliz (terminó)</span>
        </div>
      </div>
    </div>
  );
};

export default PatitosAnimation;