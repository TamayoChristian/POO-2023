package poo;

public class ModuleApp {

	public static void main(String[] args) {
		// Implementaro objetos con la asociación entre curso y modulo
		//crear objeto de ripo course
		Course myCourse = new Course("Software test", 5, 2000);
		//crear 3 objetos de tipo modulo
		Module mod1 = new Module("unit testing", 10, "practicum");
		Module mod2 = new Module("Acceptance testing", 20, "course");
		Module mod3 = new Module("values algorithm", 10, "none");
			
		//agregar los modulos al curso
		myCourse.addModule(mod1);
		myCourse.addModule(mod2);
		myCourse.addModule(mod3);
		
		//mostar la información del detalle del curso
			
		System.out.println(myCourse.getName() + "contiene los siguientes modulos ");
		
		for(int i = 0; i<myCourse.getModuleCount(); i++) {
			System.out.println(
					myCourse.getModules()[i].getName() +
					myCourse.getModules()[i].getCreditPoints() +
					myCourse.getModules()[i].getAssessment()
					);
		}
		//end for
		System.out.print("Total credits " + myCourse.getTotalCredits());
	}

}
