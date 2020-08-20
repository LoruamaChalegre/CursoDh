package incognitus;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario func1 = new Funcionario(null, null, null, null, null, null, null, null, null, null, false, false, false, 0, 0);
		func1.data_de_admissao = LocalDate.of(2019, 6, 3);
		func1.nunca_pegou_ferias = true;
		func1.data_de_retorno_ferias = LocalDate.of(2020, 5, 1);
		func1.cargo = "funcionario";
		func1.RequisicaoFerias();
		Supervisor sup1 = new Supervisor(null, null, null, null, null, null, null, null, null, null, false, false, false, 0, 0, null);
		System.out.println(sup1.cargo);
		sup1.demitir(func1);
		System.out.println(func1.data_de_demissao);
		Gerente ger1 = new Gerente(null, null, null, null, null, null, null, null, null, null, false, false, false, 0, 0, null);
		System.out.println(ger1.cargo);
		ger1.demitir(sup1);
		System.out.println(sup1.data_de_demissao);
		func1.salario_base = 2000;
		sup1.salario_base = 4000;
		ger1.salario_base = 6000;
		System.out.println(func1.consultaContraCheque());
		System.out.println(sup1.consultaContraCheque());
		System.out.println(ger1.consultaContraCheque());
}}


