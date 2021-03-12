package usuario;

import java.util.ArrayList;

import biblioteca.Livro;


public class Gerente extends Usuario {
	
	private static ArrayList<Livro> livrosAdicionados = new ArrayList<>();
		
		public Gerente(String usuario, String senha) {
			super.setUsuario(usuario);
			super.setSenha(senha);
		}
		
		public void adicionarLivro(String titulo, String autor, int ano){
			livrosAdicionados.add(super.livro.montarLivro(titulo, autor, ano));
		}
		
		public static ArrayList<Livro> getLivrosAdicionados() {
			return livrosAdicionados;
		}
		public Livro getLivro() {
			return super.livro;
		}

		public void setLivro(Livro livro) {
			super.livro = livro;
		}

		public String removerLivro(int i){
			String nomeLivroRemovido = Gerente.getLivrosAdicionados().get((i-1)).getAutor();
			livro.removerLivro(i);
			return nomeLivroRemovido;
		}
		public void removerTodosLivros(){
			super.livro.excluirTodosOsLivros();
		}
		public void listarPraExcluir(){
			super.livro.listarLivrosComId();
		}
		public Livro selecionarLivro(int i){
			Livro nomeLivroEditar = Livro.getLista().get((i-1));
			return nomeLivroEditar;
		}
		
		public void editarLivro(Livro nomeLivroEditar, String titulo, String autor, int ano){
			nomeLivroEditar.editarLivro(nomeLivroEditar, titulo, autor, ano);
			
		}

	
		
		

		
		
	


}
