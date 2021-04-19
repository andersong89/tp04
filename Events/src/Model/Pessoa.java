package Model;

abstract public class Pessoa {
	
	protected String nome;
	protected int Idade;
	protected String telefone;
	protected String email;
	protected String endereco;
	
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Pessoa(String nome, int idade, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		Idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
