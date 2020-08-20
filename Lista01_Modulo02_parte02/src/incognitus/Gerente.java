package incognitus;

import java.time.LocalDate;

public class Gerente extends FuncionarioPf{
	
	{this.bonificacao = 0.12;}
	{this.cargo = "supervisor";}
	
	public Gerente(String endereco, String nome, String cpf, String email, String setor, String cargo,
			LocalDate data_de_admissao, LocalDate data_de_demissao, LocalDate data_de_retorno_ferias,
			LocalDate data_de_reajuste_salario, boolean nunca_pegou_ferias, boolean funcionario_de_ferias,
			boolean nunca_teve_reajuste_salarial, double salario_base, double bonificacao, String codigo_NIT) {
		super(endereco, nome, cpf, email, setor, cargo, data_de_admissao, data_de_demissao, data_de_retorno_ferias,
				data_de_reajuste_salario, nunca_pegou_ferias, funcionario_de_ferias, nunca_teve_reajuste_salarial, salario_base,
				bonificacao, codigo_NIT);
		// TODO Auto-generated constructor stub
	}
	
	public void demitir(Funcionario func){
		if (func.cargo=="funcionario" || func.cargo=="supervisor") {
			func.data_de_demissao = LocalDate.now();
			System.out.println("Funcionário demitido com sucesso");
		} else {
			System.out.println("Você não está autorizado a demitir o funcionário");
	}}
	
	public void reajustarSalario(Funcionario func) {
		double perc = 0.10;
		if (func.cargo=="funcionario" || func.cargo=="supervisor") {
			func.salario_base = salario_base * (1+perc);
			System.out.println("Salário reajustado com sucesso");
		} else {
			System.out.println("Você não está autorizado a reajustar o salário do funcionário");
	}}	
}



