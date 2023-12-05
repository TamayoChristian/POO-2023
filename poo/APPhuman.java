package poo;

public class APPhuman {

	public static void main(String[] args) {
		
		//Crear objeto
		HUMAN human = new HUMAN();
		System.out.println(human.getName());
		
		human.setAge(76);
		
		System.out.println(human.getAge());
		
		human.computeAndPrintTime();
		System.out.println(human.getTimeToLive());
	}

}
