public class Principal{
	public static void main(String[] args){
		Carro renault = new Carro();
		Moto yamaha = new Moto(150, 2, 'K', 250);
		renault.encender();
		yamaha.rodar();
                System.out.println(yamaha.getModelo());

	}

}