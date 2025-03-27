package uy.ucu.paquete;

public class Iterativo {
	
	public void imprimirIterativos() {
		for(int i = 0; i <11; i ++) {
			System.out.print(i);
		}
	}
	
	public void imprimirIterativosWhile() {
		int i = 0;
		while(i < 11) {
			System.out.println(i);
			i++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterativo c = new Iterativo();
		
		c.imprimirIterativos();
		System.out.println(" ");
		c.imprimirIterativos();
	}

}
