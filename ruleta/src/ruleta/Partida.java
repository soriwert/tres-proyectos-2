package ruleta;

public class Partida {
	private int numero,totalPorciento, conTercio,conVecinos,conHuerfanos,contador, probTercio,probVecinos,probHuerfanos;
	private float porTercio, porVecinos, porHuerfanos;
	private int []ruleta;
	private int []zonaTercio={33,16,24,5,10,23,8,30,11,36,13,27};
	private int []zonaVecinos={22,18,29,7,0,28,12,35,3,26,32,15,19,4,21,2,25};
	private int []zonaHuerfanos={17,34,6,9,31,14,20,1};
	private int []colorRojo={32,19,21,25,34,27,36,30,23,5,16,1,14,9,22,18,7,12,3};
	private int []colorNegro={15,4,2,17,6,13,11,8,10,24,33,20,31,22,29,28,35,26};
	private int []impar={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
	private int []par={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
	private int []estrategia11;

	public Partida(){
		conTercio=0; conVecinos=0; conHuerfanos=0;
		porTercio=0; porVecinos=0; porHuerfanos=0;
		numero=0;
		ruleta=new int [37];
		estrategia11=new int[11];
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setRuleta(){
		for (int i=0; i<ruleta.length; i++){
			ruleta[i]=i;
		}
	}
	public void setSector(){
		for (int i=0; i<ruleta.length; i++){
			try{

				if (numero==zonaTercio[i]){
					System.out.print("Tercio "+zonaTercio[i]+" ");
					conTercio++;
					
				}
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e){

			}	
			try{
				if(numero==zonaVecinos[i]){
					System.out.print("Vecino "+zonaVecinos[i]+" ");
					conVecinos++;
				}
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e){

			}
			try{
				if (numero==zonaHuerfanos[i]){
					System.out.print("Huerfano "+zonaHuerfanos[i]+" ");
					conHuerfanos++;
				}
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e){

			}



		}

	}
	public void setColor(){
		for (int i=0; i<ruleta.length; i++){
			try{
				if(numero==colorRojo[i]){
					System.out.print("Rojo ");
				}
				if (numero==colorNegro[i]){
					System.out.print("Negro ");
				}
				if (numero==0) {
					System.out.print("Verde ");
					break;
				}
			}
			catch(java.lang.ArrayIndexOutOfBoundsException e){

			}
		}
	}

	public void setParImpar(){
		for(int i=0; i<ruleta.length;i++){
			try{
				if(numero==par[i]){
					System.out.print(" par ");
				}
				if (numero==impar[i]){
					System.out.print(" impar ");
				}
			}
			catch(java.lang.ArrayIndexOutOfBoundsException e){

			}
		}
	}

	public void porcentajes(){
		contador++;
		porTercio=(float)((conTercio*100)/contador);
		porVecinos=(float)((conVecinos*100)/contador);
		porHuerfanos=(float)((conHuerfanos*100)/contador);

		System.out.print(" T% "+porTercio+" V% "+porVecinos+" H% "+porHuerfanos+" " + contador);
	}

	public void estrategia11(){
		try{
			if(numero<11){
				for(int i=contador-1; i<contador; i++){
					estrategia11[i]=numero;
				}
			}
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e){	
		}
		try{
			if (contador>11){
				for (int i=0; i<estrategia11.length;i++){
					if(numero==estrategia11[i]){
						System.out.print(" Estrategia 11: OK ");
						break;
					}
				}
			}
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e){	
		}
	}
	
	public void estrategiaProb(){
		
	}
}



