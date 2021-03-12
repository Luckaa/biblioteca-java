package usuario;

import biblioteca.Livro;

public abstract class  Usuario {
	
	private String usuario;
	private String senha;
	Livro livro = new Livro();
	
	public void listarLivros(){
		livro.listarLivros();
	};
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
	

	
	

