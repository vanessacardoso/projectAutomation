package br.ce.web.pages;

import org.openqa.selenium.By;

import br.ce.web.set.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta(){
		clicarLink("Novo usuário?");
	
	}
	
	public void acessarMenuLogin(){
		clicarLink("Login");
	
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Entrar");
		}
	
	public void buscar(){
		clicarBotao(By.cssSelector("body > div.form-group.col-lg-9 > form > input"));
		}
	
		
	public void sair(){
		clicarLink("Sair");
		}
	
	public void acessarTelaCadastrarConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta(){
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void salvar(){
		clicarBotaoPorTexto("Salvar");
	}
	
	public void acessarTelaInserirMovimentacao(){
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumoMensal() {
		clicarLink("Resumo Mensal");
	}
	

}
