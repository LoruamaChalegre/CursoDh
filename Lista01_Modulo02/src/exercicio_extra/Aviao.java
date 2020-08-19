package exercicio_extra;

public class Aviao implements Voador {
	
	private long horas_de_voo;
	
	public Aviao () {
		this.horas_de_voo = 0;
	}
	
	@Override
	public void voar() {
		// TODO Auto-generated method stub
		this.horas_de_voo += 13;
		System.out.println("Estou voando como um avião e tenho "+horas_de_voo+" horas de voo");
		
		
	}

} 
