package Model;

public class Usuario extends Pessoa {

	protected String senha;
	protected String nivelAcesso;
	
	
	
	
	public Usuario(String nome, String email, String senha, String nivelAcesso) {
		super(nome, email);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	public Usuario(String nome, int idade, String telefone, String email, String endereco, String senha,
			String nivelAcesso) {
		super(nome, idade, telefone, email, endereco);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
	
}