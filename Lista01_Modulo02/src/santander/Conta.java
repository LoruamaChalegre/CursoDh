package santander;
import java.util.Scanner;

abstract class Conta extends Cliente {
	
	long saldo;
	
	public Conta(String numeroCliente, String numeroRg, String numeroCpf, String numeroConta, long saldo) {
		super(numeroCliente, numeroRg, numeroCpf, numeroConta);
		// TODO Auto-generated constructor stub
		this.saldo = saldo;

	}
	
	public void Depositar(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor que deseja depositar:");
		long valorDepositado =  entrada.nextLong();
		entrada.close();
		this.saldo += valorDepositado;
		System.out.println("Depósito de "+valorDepositado+" reais foi realizado com sucesso");
	}
	
	abstract public void sacar();
		
	public void ConsultarSaldo() {
		System.out.println("Seu saldo é de "+this.saldo+" reais");
	}		
	}
		
	

