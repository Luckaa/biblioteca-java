package cliente;
import java.util.Scanner;

import usuario.Gerente;
import utilities.utilities;
import cliente.InterfaceCliente;

public class InterfaceGerente extends InterfaceCliente{
	int option = 0;
	public Scanner sc = new Scanner(System.in);
	public utilities util = new utilities();

	public Gerente logandoGerente(String login, String senha){
		Gerente gerente = new Gerente(login, senha);
		this.loopGerente(gerente);
		return gerente;
	}
	
	public int perguntandoGerente(){
		System.out.println("O que você deseja fazer agora?");
		System.out.println("[1]Cadastrar Livro");
		System.out.println("[2]Excluir Livro Cadastrado");
		System.out.println("[3]Ver Livros Cadastrados");
		System.out.println("[4]Editar Livros");
		System.out.println("[5]Voltar");
		option = sc.nextInt();
		return option;
	}
	
	public void loopFuncaoCadastrar(Gerente gerente){
		this.cadastrarLivro(gerente);
		int continuar = this.desejaContinuar();
		if(continuar == 1){
			loopFuncaoCadastrar(gerente);
		}
		if(continuar ==2){
			this.loopGerente(gerente);
		}
	}
	
	public void loopFuncaoExcluir(Gerente gerente){
		int excluir = this.perguntandoExcluirLivros();
		this.excluirLivro(gerente, excluir);
		int continuar = this.desejaContinuar();
		if(continuar == 1){
			loopFuncaoExcluir(gerente);
		}
		if(continuar ==2){
			this.loopGerente(gerente);
		}
	}
	
	
	
	public void editarLivro(){
		
	}
	
	
	public void excluirLivro(Gerente gerente, int excluir){
		if(excluir == 1){
			gerente.listarPraExcluir();
			System.out.println("Qual livro você deseja excluir?");
		}
		if(excluir == 2){
			gerente.removerTodosLivros();
		}
	}
	
	public void cadastrarLivro(Gerente gerente){
		utilities.clearScreen();
		System.out.println("digite o titulo do livro : ");
		String tituloLivro = sc.next();
		System.out.println("");
		System.out.println("digite o autor do livro: ");
		String autorLivro = sc.next();
		System.out.println("");
		System.out.println("digite o ano do livro: ");
		int anoLivro = sc.nextInt();
		System.out.println("");
		gerente.adicionarLivro(tituloLivro, autorLivro, anoLivro);
	}
	
	public int desejaContinuar(){
		System.out.println("Deseja continuar?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		int i = sc.nextInt();
		return i;
	}
	
	public void loopGerente(Gerente gerente){
		int option = this.perguntandoGerente();
		if(option == 1){
			this.loopFuncaoCadastrar(gerente);
			utilities.clearScreen();
		}
		if(option == 2){
			this.loopFuncaoExcluir(gerente);
			utilities.clearScreen();
		}
		if(option == 3){
			gerente.listarLivros();
			this.loopGerente(gerente);
		}
		if(option == 4){
			
		}	
		if(option == 5){
			utilities.clearScreen();
			super.loopServer();
		}
	}
	
	public int perguntandoExcluirLivros(){
		System.out.println("O que você deseja fazer agora?");
		System.out.println("[1]Excluir um Livro");
		System.out.println("[2]Excluir todos os Livros");
		int excluirLivro = sc.nextInt();
		return excluirLivro;
	}

}
