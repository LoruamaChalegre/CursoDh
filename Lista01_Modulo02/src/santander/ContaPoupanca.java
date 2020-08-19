package santander;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	
	double taxaDeJuros;
	String dataRemuneracaoPoupanca;
	
	public ContaPoupanca(String numeroCliente, String numeroRg, String numeroCpf, String numeroConta, long saldo, double taxaDeJuros, String dataRemuneracaoPoupanca) {
		super(numeroCliente, numeroRg, numeroCpf, numeroConta, saldo);
		// TODO Auto-generated constructor stub
		this.taxaDeJuros = taxaDeJuros;
		this.dataRemuneracaoPoupanca = dataRemuneracaoPoupanca;
	}
	
	@Override
	public void sacar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor que deseja sacar:");
		long valorSacado =  entrada.nextLong();
		entrada.close();
		if (valorSacado <= saldo) {
			System.out.println("Aguarde a contagem de notas");
			saldo -= valorSacado;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Você não tem saldo o suficiente");
		}
	}
	// TODO Auto-generated method stub
	
	public void recolherJuros() {
		double rendimento = this.saldo * this.taxaDeJuros;
		System.out.println("O rendimento de sua poupança no valor de "+rendimento+"será pago em "+this.dataRemuneracaoPoupanca);		
	}
}
	

