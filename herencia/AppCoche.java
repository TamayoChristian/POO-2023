package herencia;

public class AppCoche {

	public static void main(String[] args) {
		//crear objeto coche
		
		Coche coche1 = new Coche();
		
		Coche coche2 = new Coche(8,80,30);
		
		System.out.println("coche 1" + coche1.getRuedas());
		System.out.println("coche 2" + coche2.getRuedas());
	}

}
