package estrutura_dados.models;

public class disco extends item {
	private String nome;
	private String quantidade;
	private String midia;
	
	
	
	public disco() {
		super();
	}
	public disco(String nome, String quantidade, String midia) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.midia = midia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getMidia() {
		return midia;
	}
	public void setMidia(String midia) {
		this.midia = midia;
	}
	
}
