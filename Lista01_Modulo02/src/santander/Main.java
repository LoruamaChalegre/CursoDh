package santander;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ContaCorrente contaCorrente = new ContaCorrente("717623","23234545","4645644", new Cheque(200,"Nubank","22/08/2020"), "8773208", 1200, 2800);
		contaCorrente.ConsultarSaldo();
		contaCorrente.Depositar();
		contaCorrente.ConsultarSaldo();
		contaCorrente.depositarCheque(new Cheque(2300, "Banco do Brasil", "22/08/2020"));
		long limite = contaCorrente.getLimite_cheque_especial();
		System.out.println("O limite do crédito especial é de "+limite);
		//contaCorrente.sacar();
		//contaCorrente.ConsultarSaldo();
		//limite = contaCorrente.getLimite_cheque_especial();
		System.out.println("O limite do crédito especial é de "+limite);
		ContaPoupanca contaPoupanca = new ContaPoupanca("2717623","23234545","4645644", "7236622", 1700, 0.02, "22/08/2020");
		contaPoupanca.ConsultarSaldo();
		//contaPoupanca.Depositar();
		//contaPoupanca.ConsultarSaldo();
		//contaPoupanca.sacar();
		//contaPoupanca.ConsultarSaldo();
		contaPoupanca.recolherJuros();
	}
}
	
	


