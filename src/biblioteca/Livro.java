package biblioteca;

import java.util.*;


public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private static ArrayList<Livro> lista = new ArrayList<>();
	
	
	public Livro montarLivro(String titulo, String autor, int ano){
		Livro livro = new Livro();	
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setAno(ano);
		adicionarNaLista(livro);
		return livro;
	}

	public void adicionarNaLista(Livro livro){
		lista.add(livro);
		System.out.println("Adicionado Livro: " + livro.getTitulo());
		System.out.println("");

	}
	
	public void listarLivros(){
		System.out.println("Livros: ");
		for(Livro livro : lista){
			System.out.println(livro.getTitulo());
		}
	}
	public void listarLivrosComId(){
		System.out.println("Livros para excluir: ");
		int i = 1;
		for(Livro livro : lista){
			System.out.println("["+i+"]"+livro.getTitulo());
			i++;
		}
		System.out.println("");
	}
	public void excluirTodosOsLivros(){
		System.out.println("Livros Excluidos:");
		for(Livro livro : lista){
			System.out.println(livro.getTitulo());
		}
		lista.clear();
	}
	public void perguntarEditar(){
		System.out.println("Qual livro você deseja editar?");
		this.listarLivrosComId();
		
	}
	public void removerLivro(int i){
		Livro livro = Livro.getLista().get(i);
		lista.remove((i-1));
		System.out.println("Removido Livro: " + livro.getTitulo());
	}
	
	public static ArrayList<Livro> getLista() {
		return lista;
	}
	public static void setLista(ArrayList<Livro> lista) {
		Livro.lista = lista;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void editarLivro(Livro livro){
		
	}
		
		
	
	
	
}
