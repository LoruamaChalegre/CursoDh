package santander;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	long limite_cheque_especial;
	
	public ContaCorrente(String numeroCliente, String numeroRg, String numeroCpf, 
			Object cheque, String numeroConta, long saldo, long limite_cheque_especial) {
		super(numeroCliente, numeroRg, numeroCpf, numeroConta, saldo);
		// TODO Auto-generated constructor stub
		this.limite_cheque_especial = limite_cheque_especial;
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		Scanner valorDigitado = new Scanner(System.in);
		System.out.println("Digite o valor que deseja sacar:");
		long valorSacado =  valorDigitado.nextLong();
		valorDigitado.close();
		if (valorSacado <= this.saldo) {
			System.out.println("Aguarde a contagem de notas");
			this.saldo -= valorSacado;
			System.out.println("Saque realizado com sucesso!");
		} else {
			if (this.limite_cheque_especial + this.saldo >= valorSacado) {
				System.out.println("Aguarde a contagem de notas");
				this.limite_cheque_especial -= (valorSacado - this.saldo);
				this.saldo -= valorSacado;
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Você não tem saldo o suficiente");
				}
		}
	}
	
	public void depositarCheque(Cheque cheque) {
		System.out.println("Cheque recebido no valor de "+cheque.valor+" a ser compensado no dia "+cheque.data_de_pagamento);		
	}

	public long getLimite_cheque_especial() {
		return limite_cheque_especial;
	}

	public void setLimite_cheque_especial(long limite_cheque_especial) {
		this.limite_cheque_especial = limite_cheque_especial;
	}
}
