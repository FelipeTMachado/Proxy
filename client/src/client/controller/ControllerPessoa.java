package client.controller;

import java.util.Scanner;

import client.model.Pessoa;
import client.view.ViewPessoa;

public class ControllerPessoa {
	// ATRIBUTOS
	private Scanner leitura;
	private ViewPessoa viewPessoa;
	
	
	
	// CONSTRUTOR
	public ControllerPessoa(Scanner leitura) {
		this.leitura = leitura;
	}
	
	
	
	// METODOS FUNCIONAIS
	public Pessoa menuBuscarPessoa() {
		
		
		return new Pessoa();
	}
	
	public void menuNovaPessoa() {
		
	}
	
	public void menuPessoa() {
		boolean ehSair = false;
		
		this.viewPessoa = new ViewPessoa(this.leitura);
		
		while (!ehSair) {
			switch (viewPessoa.menuPessoa()) {
			case "1": {
				menuNovaPessoa();
				
				break;
			}
			
			case "2": {
				menuBuscarPessoa();
	
				break;
			}

			case "0": {
				System.exit(0);

				break;
			}
			
			default:
				viewPessoa.menuOpcaoInexistente();
			}
		}
	}



	// GETTERS AND SETTERS
	public Scanner getLeitura() {
		return leitura;
	}
	public void setLeitura(Scanner leitura) {
		this.leitura = leitura;
	}
	public ViewPessoa getViewPessoa() {
		return viewPessoa;
	}
	public void setViewPessoa(ViewPessoa viewPessoa) {
		this.viewPessoa = viewPessoa;
	}
}
