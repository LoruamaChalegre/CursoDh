package incognitus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario {
	
	String endereco;
	String nome;
	String cpf;
	String email;
	String setor;
	String cargo = "funcionario";
	LocalDate data_de_admissao;
	LocalDate data_de_demissao;
	LocalDate data_de_retorno_ferias;
	LocalDate data_de_reajuste_salario;
	boolean nunca_pegou_ferias;
	boolean funcionario_de_ferias;
	boolean nunca_teve_reajuste_salarial;
	double salario_base;
	double bonificacao = 0;
	
	public Funcionario(String endereco, 
	String nome, 
	String cpf, 
	String email,
	String setor,
	String cargo,
	LocalDate data_de_admissao,
	LocalDate data_de_demissao,
	LocalDate data_de_retorno_ferias,
	LocalDate data_de_reajuste_salario,
	boolean nunca_pegou_ferias,
	boolean funcionario_de_ferias,
	boolean nunca_teve_reajuste_salarial,
	double salario_base,
	double bonificacao) {
		
		this.endereco = endereco;
		this.nome = nome; 
		this.cpf  = cpf; 
		this.email = email;
		this.setor = setor;
		this.cargo = cargo;
		this.data_de_admissao = data_de_admissao;
		this.data_de_demissao = data_de_demissao;
		this.data_de_retorno_ferias = data_de_retorno_ferias;
		this.data_de_reajuste_salario = data_de_reajuste_salario;
		this.nunca_pegou_ferias = nunca_pegou_ferias;
		this.funcionario_de_ferias = funcionario_de_ferias;
		this.nunca_teve_reajuste_salarial = nunca_teve_reajuste_salarial;
		this.salario_base = salario_base;
		this.bonificacao = bonificacao;
		
	}
	
	public double consultaContraCheque () {
		double salario_liquido = this.salario_base + this.salario_base * this.bonificacao;
		return salario_liquido;
}
		
	public void RequisicaoFerias() {
		boolean concedeFerias = false;
		LocalDate data_de_hoje = LocalDate.now();			
		long tempo_de_empresa = ChronoUnit.MONTHS.between(data_de_admissao, data_de_hoje);
		if (tempo_de_empresa >= 11) {
			if (this.nunca_pegou_ferias) {
				concedeFerias = true;
			} else {
				long tempo_depois_ferias = ChronoUnit.MONTHS.between(data_de_retorno_ferias, data_de_hoje);
				if (tempo_depois_ferias >= 4) {
					concedeFerias = true;
				}
			}}
		if (concedeFerias) {
			this.funcionario_de_ferias = true;
			System.out.println("Aproveite as suas férias");
		} else {
			System.out.println("Você ainda não tem direito a férias");
			}
		}
	
	public boolean trabalhar() {
		boolean trabalho;
		if (this.funcionario_de_ferias) {
			System.out.println("O funcionário não pode trabalhar nas férias");
			trabalho = false;
		} else {
			trabalho = true;
		} return trabalho;}
	
	public void pedirDemissao() {
		this.data_de_demissao = LocalDate.now();
		System.out.println("Nós agradecemos o tempo dedicado a empresa. Sucesso!");
	}
	
	public void aumentoSalarial() {
		LocalDate data_de_hoje = LocalDate.now();			
		long tempo_de_empresa = ChronoUnit.YEARS.between(data_de_admissao, data_de_hoje);
		if (tempo_de_empresa < 1) {
			System.out.println("Infelizmente não foi possível aceitar sua solicitação");
		} else {
			if (this.nunca_teve_reajuste_salarial) {
				this.salario_base = this.salario_base * (1+0.1);
			} else {
				long periodo_sem_reajuste = ChronoUnit.YEARS.between(data_de_reajuste_salario, data_de_hoje);
				if (periodo_sem_reajuste<1) {
					System.out.println("Infelizmente não foi possível aceitar sua solicitação");
					System.out.println("Seu novo salário é: "+this.salario_base);
				} else {
					this.salario_base = this.salario_base * (1+0.1);
					System.out.println("Salário reajustado com sucesso!");
					System.out.println("Seu novo salário é: "+this.salario_base);
				}
			}
		}
	}}


