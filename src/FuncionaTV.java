public class FuncionaTV {
	
	public static void main(String[] args) {
		
		TV tv01 = new TV(12, "Sony", true, 20);
		
		System.out.println("Modelo: " + tv01.getModelo());
		System.out.println("Canal: " + tv01.getCanal());
		System.out.println("Volume: " + tv01.getVolume());
		
		tv01.aumentarCanal();
		System.out.println("Canal foi aumentado para: " + tv01.getCanal());
		tv01.diminuirCanal();
		System.out.println("Canal foi diminuindo para: " + tv01.getCanal());
		tv01.aumentarVolume();
		System.out.println("Volume foi aumentado para: " + tv01.getVolume());
		tv01.diminuirVolume();
		System.out.println("Volume foi aumentado para: " + tv01.getVolume());
		tv01.desligar();
		System.out.println("TV está ligada? " + tv01.isLigada());
		tv01.ligar();
		System.out.println("TV está ligada? " + tv01.isLigada());
		
		tv01.setModelo("Samsung");
		System.out.println("O novo modelo da TV é: " + tv01.getModelo());
	}
	
}
