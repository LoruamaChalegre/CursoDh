package santander;

public class Cliente {
	
	String numeroCliente;
	String sobrenome;
	String numeroRg;
	String numeroCpf;
	String numeroConta;
	
	public Cliente(String numeroCliente, String numeroRg, String numeroCpf, String numeroConta) {
		this.numeroCliente = numeroCliente;
		this.numeroRg = numeroRg;
		this.numeroCpf = numeroCpf;
		this.numeroConta = numeroConta;	
	}
}

