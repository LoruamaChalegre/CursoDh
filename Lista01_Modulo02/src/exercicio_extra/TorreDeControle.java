package exercicio_extra;

public class TorreDeControle {
	private Voador[] voadores;	
	
	public TorreDeControle (Voador[] voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos () {
		for (int i = 0; i < voadores.length; i++) {
			this.voadores[i].voar();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
