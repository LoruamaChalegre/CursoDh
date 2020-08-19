package exercicio_extra;

public class Super_homem implements Voador{
	
	private long experiencia;
	
	public Super_homem () {
		this.experiencia = 0;
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		this.experiencia += 3;
		System.out.println("Estou voando como um campeão: "+experiencia+"xp de experiência");
	}

}
