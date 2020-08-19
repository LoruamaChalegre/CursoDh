package santander;

public class Cheque {
	long valor;
	String bancoEmissor;
	String data_de_pagamento;
	
	public Cheque(long valor, String bancoEmissor, String data_de_pagamento	) {
		this.valor = valor;
		this.bancoEmissor = bancoEmissor;
		this.data_de_pagamento = data_de_pagamento;
	}
}