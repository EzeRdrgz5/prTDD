package prTDD;

public class prTDD {
	
	private class Nodo{
		
		private String clave;
		private String valor;
		private Nodo sig;
	
		public Nodo(String clave,String valor,Nodo s){
			this.clave=clave;
			this.valor=valor;
			this.sig=s;
		}
		
	}
	
	private Nodo primero;
	
	public prTDD(){
		primero = null;
	}
	public prTDD(String[]claves, String[] valores){
		this();
		if(claves.length>0){
			primero = new Nodo(claves[0], valores[0],null);
			for (int i = 1; i< claves.length; i++){
				Nodo nuevo = new Nodo(claves[i], valores[i],primero);
				primero = nuevo;
			}
		}
	}
	
	public static int size(){
		return 0;
	}


}
