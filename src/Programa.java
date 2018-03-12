
public class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setDataDeEntrada("05/05/05");
		f1.setDepartamento("Vendas");
		f1.setEstaNaEmpresa(true);
		f1.setNome("João Silva");
		f1.setRg("45.568.456-1");
		f1.setSalario(2000.0);
		//f1.calculaSalario();
		
		
		
		
		Gerente g1 = new Gerente();
		g1.departamento = "Vendas - Gerente";
        g1.dataDeEntrada = "01/05/06";
        g1.estaNaEmpresa = true;
        g1.nome = "Marcos Costa";
        g1.salario = 4000.0;
        g1.rg = "44.455.566-6";
        g1.setLogin("m.costa");
        g1.setSenha("mc1000");
        
        
        
        Supervisor s1 = new Supervisor();
		s1.departamento = "Vendas - Supervisor";
        s1.dataDeEntrada = "08/07/13";
        s1.estaNaEmpresa = true;
        s1.nome = "Fernando Del Valle";
        s1.salario = 6000.0;
        s1.rg = "36.407.387-1";
        s1.setLogin("f.delvalle");
        s1.setSenha("fdv1000");
        
        
        
        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.calculaTotalDeBonus(f1);
        controle.calculaTotalDeBonus(g1);
        controle.calculaTotalDeBonus(s1);
        
		System.out.println("Nome: " + f1.getNome());		
		System.out.println("Data de Entrada: " + f1.getDataDeEntrada());
		System.out.println("Departamento: " + f1.getDepartamento());
		System.out.println("RG: " + f1.getRg());
		System.out.println("Salário/mês: " + f1.getSalario());
		//System.out.println("Trabalha na empresa: " + f1.isEstaNaEmpresa());
		System.out.println("Bonificação: " + f1.bonifica());
		
		
		System.out.println("/////////////////////");
		
		g1.autentica("m.costa", "mc1000");
		g1.calculaSalario();
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Data de Entrada: " + g1.getDataDeEntrada());
		System.out.println("Departamento: " + g1.getDepartamento());
		System.out.println("RG: " + g1.getRg());
		System.out.println("Salário/mês: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.bonifica());
		
        System.out.println("/////////////////////");
		
		s1.autentica("f.delvalle", "fdv1000");
		s1.calculaSalario();
		System.out.println("Nome: " + s1.getNome());
		System.out.println("Data de Entrada: " + s1.getDataDeEntrada());
		System.out.println("Departamento: " + s1.getDepartamento());
		System.out.println("RG: " + s1.getRg());
		System.out.println("Salário/mês: " + s1.getSalario());
		System.out.println("Bonificação: " + s1.bonifica());
		
		System.out.println("/////////////////////");
		
		System.out.println("Total de bonus do mês c/ impostos: R$" + controle.getTotalDeBonus());
		
		
	}

}
