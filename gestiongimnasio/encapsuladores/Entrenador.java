package gestiongimnasio.encapsuladores;

public class Entrenador extends Persona{
	
	
	@Override
	public Persona instanciaTransferirObjetoEspecifico(Persona p) {
		Persona deportista = new Deportista();
		deportista.setDni(p.getDni());
		deportista.setPassword(p.getPassword());
		deportista.setNombre(p.getNombre());
		deportista.setResponsable(p.getResponsable());
		
		return deportista;
	}
}
