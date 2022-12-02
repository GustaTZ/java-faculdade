package br.com.turma.modelo;

public class Usuario {
	
	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	public Usuario() {
		super();
	}
	public Usuario(int codigo, String nome, String login, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	private int codigo;
	private String nome;
	private String login;
	private String senha;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	
	
}
