
public class Funcionario {
	protected String nome;
	protected String departamento;
	protected double salario;
	protected String dataDeEntrada;
	protected String rg;
	protected boolean estaNaEmpresa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	

	public boolean calculaSalario(double valor, double horaExtra) {
		if(this.salario <=2000) {
			double valorHorasExtra = (this.salario/30) / 8 * horaExtra;
			this.salario = this.salario - (this.salario*0.06) + valorHorasExtra;
			return true;
		}else {
			System.out.println("Valores Inválidos");
			return false;
		}
	} 

	    public boolean calculaSalario() {
		if(this.salario <= 2000) {
		this.salario = this.salario - (this.salario * 0.06);
		return true;
	}else {
		System.out.println("Valor inválido ");
		return false;
	}
	}

	public double bonifica(){
		return this.salario * 0.10;
	}
	
	

	public void demite() {
		estaNaEmpresa = false;
	}

	public double calculaGanhoAnual() {
		return salario * 12;
	}
	

}
