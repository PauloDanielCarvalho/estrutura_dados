package estrutura_dados.models;

import estrutura_dados.models.disco;
import estrutura_dados.models.filme;

public class locadoura {
	public static void main (String args[]) {
		disco[] indiceD = new disco[1];
		filme[] indiceF = new filme[1];
		indiceD[0]=new disco();
		indiceD[1]=new disco();
		
		indiceF[0]= new filme();
		indiceF[1]= new filme();
		
		novoDisco0(indiceD[0]);
		novoDisco1(indiceD[1]);
		
		novoFilme0(indiceF[0]);
		novoFilme1(indiceF[1]);
		
	
	}
	static void listarDisco(disco d) {
		System.out.println("Informações do Disco \n"
				+ "-----------------------------------------\n"
				+ "Título: "+d.getTitulo()+"\n"
						+ "Ano de Lançamento: "+ d.getAno_lancamento()+"\n"
								+ "Comentário: "+ d.getComentario()+"\n"
										+ "Artista: "+d.getNome()+"\n"
												+ "Quantidade de Faixas: "+d.getQuantidade()+"\n"
														+ "Midia: "+d.getMidia());
	}
	static void listarFilme(filme f) {
		System.out.println("Informações do Filme \n"
				+ "-----------------------------------------\n"
				+ "Título: "+f.getTitulo()+"\n"
						+ "Ano de Lançamento: "+f.getAno_lancamento()+"\n"
								+ "Comentário: "+f.getComentario()+"\n"
										+ "Diretor: "+f.getNome()+"\n"
												+ "Duração: "+f.getDuracao()+"\n"
														+ "Gênero: "+f.getGenero());
	}

	static void novoDisco0(disco d) {
		d.setTitulo("Samba Social Clube 5");
		d.setAno_lancamento("2014");
		d.setComentario(" Vários Sambas");
		d.setNome("Vários Artistas");
		d.setQuantidade("12");
		d.setMidia("CD");
		listarDisco(d);
	}
	
	static void novoDisco1(disco d) {
		d.setTitulo("Pode Entrar");
		d.setAno_lancamento("2009");
		d.setComentario(" Ivete e Convidados");
		d.setNome("Ivete Sangalo");
		d.setQuantidade("14");
		d.setMidia("DVD");
		listarDisco(d);
	}
	
	static void novoFilme0(filme f) {
		f.setTitulo("Smurfs 2");
		f.setAno_lancamento("2013");
		f.setComentario("Gargamel cria a versão malvada dos Smurfs");
		f.setNome("Raja Gosnell");
		f.setDuracao("140");
		f.setGenero("Animação");
		listarFilme(f);
	}
	
	static void novoFilme1(filme f) {
		f.setTitulo("Os mercenários 2");
		f.setAno_lancamento(" 2012");
		f.setComentario("De volta ao mundo");
		f.setNome("Simon West");
		f.setDuracao(" 210");
		f.setGenero("Animação");
		listarFilme(f);
	}
	
	

	}