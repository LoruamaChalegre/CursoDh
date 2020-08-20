package incognitus;

import java.time.LocalDate;

public class Supervisor extends FuncionarioPf {
	
	{this.bonificacao = 0.08;}
	{this.cargo = "supervisor";}
	
	public Supervisor(String endereco, String nome, String cpf, String email, String setor, String cargo,
			LocalDate data_de_admissao, LocalDate data_de_demissao, LocalDate data_de_retorno_ferias,
			LocalDate data_de_reajuste_salario, boolean nunca_pegou_ferias, boolean funcionario_de_ferias,
			boolean nunca_teve_reajuste_salarial, double salario_base, double bonificacao, String codigo_NIT) {
		super(endereco, nome, cpf, email, setor, cargo, data_de_admissao, data_de_demissao, data_de_retorno_ferias,
				data_de_reajuste_salario, nunca_pegou_ferias, funcionario_de_ferias, nunca_teve_reajuste_salarial, salario_base,
				bonificacao, codigo_NIT);
		// TODO Auto-generated constructor stub
	}

	public void demitir (Funcionario func) {
		if (func.cargo=="funcionario") {
			func.data_de_demissao = LocalDate.now();
			System.out.println("Funcionário demitido com sucesso");
		} else {
			System.out.println("Você não está autorizado a demitir o funcionário");
		}
	}
}


