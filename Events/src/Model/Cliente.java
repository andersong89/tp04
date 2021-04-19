package Model;

public class Cliente extends Pessoa {

	protected String cep;
	protected String salario;
	


	public Cliente(String nome, int idade, String telefone, String email, String endereco, String cep, String salario) {
		super(nome, idade, telefone, email, endereco);
		this.cep = cep;
		this.salario = salario;
	}

	public Cliente(String nome, String email, String cep, String salario) {
		super(nome, email);
		this.cep = cep;
		this.salario = salario;
	}
	



	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	

	
}
