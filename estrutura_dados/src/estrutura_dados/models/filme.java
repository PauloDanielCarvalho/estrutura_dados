package estrutura_dados.models;

public class filme extends item {
	private String nome;
	private String duracao;
	private String genero;
	
	
	
	public filme() {
	}
	public filme(String nome, String duracao, String genero) {
		this.nome = nome;
		this.duracao = duracao;
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
