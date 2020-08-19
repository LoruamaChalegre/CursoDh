package exercicio_extra;

public class Pato implements Voador {
	
	private int energia;
	
	public Pato() {
		this.energia = 100;
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		if (this.energia>=5) {
			System.out.println("Estou voando como um pato");
			this.energia -= 5;
		} else {
			System.out.println("Não tenho energia suficiente para voar");
		}
		
	}
	
	
}
