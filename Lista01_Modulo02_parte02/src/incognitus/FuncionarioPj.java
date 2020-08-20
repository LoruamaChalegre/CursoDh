package incognitus;

import java.time.LocalDate;

public class FuncionarioPj extends Funcionario{
	
	String codigo_CNPJ;
	
	public FuncionarioPj(String endereco, String nome, String cpf, String email, String setor, String cargo,
			LocalDate data_de_admissao, LocalDate data_de_demissao, LocalDate data_de_retorno_ferias,
			LocalDate data_de_reajuste_salario, boolean nunca_pegou_ferias, boolean funcionario_de_ferias,
			boolean nunca_teve_reajuste_salarial, double salario_base, double bonificacao, String codigo_CNPJ) {
		super(endereco, nome, cpf, email, setor, cargo, data_de_admissao, data_de_demissao, data_de_retorno_ferias,
				data_de_reajuste_salario, nunca_pegou_ferias, funcionario_de_ferias, nunca_teve_reajuste_salarial, salario_base,
				bonificacao);
		this.codigo_CNPJ = codigo_CNPJ;
		// TODO Auto-generated constructor stub
	}
}	
	
	


