package poo;

public class HUMAN {
	//Constante
	static final int LIFESPAN = 100;
	
	public String name;
	int age;
	float height;

	//constructor
	//Inicializa las varaibles.
	public HUMAN() {
		name="Juan";
		age=20;
		height = 130;
	}
	
	public HUMAN(String name, int age, float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	
	}
	//metodos o encapstulación
	//Para que no cualquiera acceda al valor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	//metodos codigo que retorna algun resultado de una operación
	
	/**
	 * coputa e imprime el tiempo de vida.
	 */
	public void computeAndPrintTime() {
		int ttl = LIFESPAN - this.age;
		System.out.print("Time to live: " + ttl);
	}
	
	//metodo de retorno de valores
	/**
	 * @return tiempo de vida
	 * 
	 */
	public int getTimeToLive() {
		int ttl = LIFESPAN - this.age;
		return ttl;
	}
}
