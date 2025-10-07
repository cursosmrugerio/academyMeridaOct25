package nthu.trans;

public class AdvancedTransSocket extends TransSocket {
	
//	long connect(String ipAddr) throws ChannelException{
//		throw new ChannelException();
//	}
	
	@Override
//	long connect(String ipAddr) throws FrameCollisionException{
//		throw new FrameCollisionException();
//	}

	long connect(String str) {
		return 1L; // 1l 1L 1 
	}
	
	//FALLA PORQUE NO SE PUEDE DEFINIR UNA SUPER CLASE DE LA EXCEPTION
//	long connect(String ipAddr) throws Exception{
//		throw new Exception();
//	}
	
	
	
	//SE ELIMINAN POR REGRESAR int
	//int connect(String ipAddr) throws DataFloodingException
	//int connect(String ipAddr) throws ChannelException

}
