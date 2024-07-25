package client.model;

public class Pessoa {
	// ATRIBUTOS
	private String id;
	private String nome;
	private String cpf;
	private String sexo;
	
	
	// CONSTRUTOR
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	// GETTERS AND SETTERS
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
