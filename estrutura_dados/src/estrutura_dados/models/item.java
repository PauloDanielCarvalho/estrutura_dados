package estrutura_dados.models;

public class item {
	private String titulo;
	private String ano_lancamento;
	private String comentario;
	
	
	public item() {
	}
	
	public item(String titulo, String ano_lancamento, String comentario) {
		
		this.titulo = titulo;
		this.ano_lancamento = ano_lancamento;
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno_lancamento() {
		return ano_lancamento;
	}
	public void setAno_lancamento(String ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
