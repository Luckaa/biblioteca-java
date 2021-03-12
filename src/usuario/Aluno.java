package usuario;

public class Aluno extends Usuario {
	
	private String livrosEmprestados;
	
	
	public Aluno(String usuario, String senha) {
		super.setUsuario(usuario);
		super.setSenha(senha);
	}

	public void emprestarLivro(){
		
	}		
	
	public String getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(String livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

	public void devolverLivro(){
		
	}
}
