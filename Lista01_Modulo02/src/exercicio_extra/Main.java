package exercicio_extra;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		Super_homem super_homem = new Super_homem();
		Voador[] voadores = {pato, aviao, super_homem};
		TorreDeControle torreDeControle = new TorreDeControle(voadores);
		for (int i = 0; i < 25; i++) {
			torreDeControle.voemTodos();
			}
	}

}
