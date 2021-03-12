package cliente;

import java.util.Scanner;

import utilities.utilities;

public class InterfaceCliente {	
	public utilities util = new utilities();
	public Scanner sc = new Scanner(System.in);
	private String login;
	private String senha;
	
	public void loopServer(){
	utilities.clearScreen();
	int option = this.perguntarLogin();
	this.logando(option);
	}
	
	public int perguntarLogin(){
		System.out.println("O que você deseja fazer?");
		System.out.println("[1]Logar como Aluno");
		System.out.println("[2]Logar como Gerente");
		System.out.println("[3]Sair");
		int optionLogin = 0;
		optionLogin = sc.nextInt();
		
		return optionLogin;
	}

	
	public void logando(int option){
		if(option != 3){
			System.out.println("Por favor digite seu login e senha!");
			login = this.digiteSeuLogin();
			senha = this.digiteSuaSenha();
		}
		if(option == 1){
			System.out.println("a ser feito...");
		}
		if(option == 2){
			InterfaceGerente servicesGerente = new InterfaceGerente();
			 servicesGerente.logandoGerente(login, senha);
		}
	}
	

	public String digiteSeuLogin(){
		System.out.print("login:");
		String login = sc.next();	
		return login;
	}
	
	public String digiteSuaSenha(){
		System.out.print("senha:");
		String senha = sc.next();
		return senha;
	}
			

}
