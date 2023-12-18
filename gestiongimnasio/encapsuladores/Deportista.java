package gestiongimnasio.encapsuladores;

public class Deportista extends Persona{
	
	
	public Deportista() {
		
	}
	
	@Override
	public Persona instanciaTransferirObjetoEspecifico(Persona p) {
		Persona deportista = new Deportista();
		deportista.setDni(getDni());
		deportista.setPassword(getPassword());
		deportista.setNombre(getNombre());
		deportista.setResponsable(getResponsable());
		
		return deportista;
	}
}
