package poo;

public class Course {
	
	private static int NumberOfCoursesCreated = 0;
	private String name;
	private int NumberOfDays;
	private double pricePerPerson;
	
	//array de modulos
	private Module[]modules = new Module[20];
	private int moduleCount = 0;
	
	/**
	 * Constructor con cero argumentos
	 */
	public Course() {
		this("cursos sinAsignación",3,1000.0);
	}

	public Course(String name, int numberOfDays, double pricePerPerson) {
		super();
		this.name = name;
		this.pricePerPerson = pricePerPerson;
		this.NumberOfDays = numberOfDays;
		NumberOfCoursesCreated++;
	}

	public static int getNumberOfCoursesCreated() {
		return NumberOfCoursesCreated;
	}

	public static void setNumberOfCoursesCreated(int numberOfCoursesCreated) {
		NumberOfCoursesCreated = numberOfCoursesCreated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfDays() {
		return NumberOfDays;
	}

	/**
	 * @param numberOfDays el número de dias de los cursos
	 */
	public void setNumberOfDays(int numberOfDays) {
		if(numberOfDays >=1 && numberOfDays<=10)
		{
			this.NumberOfDays = numberOfDays;
		} else {
			//no acepta parametros
		}
		
	}

	public double getPricePerPerson() {
		return pricePerPerson;
	}

	public void setPricePerPerson(double pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}

	public Module[] getModules() {
		return modules;
	}

	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	public int getModuleCount() {
		return moduleCount;
	}

	public void setModuleCount(int moduleCount) {
		this.moduleCount = moduleCount;
	}	
//dos metodos para agregar modulos
	//addmodule para agregar el parametro en el array
	
	public void addModule(Module newModule) {
		if(moduleCount <modules.length) {
			modules[moduleCount] = newModule;
			moduleCount++;
		} else {
			System.out.println("No se apacetan más modulos");
		}
	}
	//obtener el total de creditos.
	public int getTotalCredits() {
		int total = 0;
		for(int i=0;i < getModuleCount(); i++) {
			total += getModules()[i].getCreditPoints();
		}
		return total;
	}
}
