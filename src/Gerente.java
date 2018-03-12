
public class Gerente extends Funcionario {
	
	private String login;
	private String senha;

	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double bonifica(){
		return this.salario * 0.15;
	}
	
	public boolean calculaSalario(double valor, double horaExtra) {
		if(this.salario > 2000) {
			double valorHorasExtra = (this.salario/30) / 8 * horaExtra;
			this.salario = this.salario - (this.salario*0.11) + valorHorasExtra;
			return true;
		}else {
			System.out.println("Valores Inválidos");
			return false;
		}
	} 

	
	    public boolean calculaSalario() {
		if(this.salario > 2000) {
		this.salario = this.salario - (this.salario * 0.11);
		return true;
	}else {
		System.out.println("Valor inválido ");
		return false;
	}
	}
	
	
	public void autentica(String login, String senha) {
		if((this.login == login) && (this.senha == senha)) {
		System.out.println("Acesso permitido");			
		}else {
			System.out.println("Acesso negado");
		}
	}
	


}
