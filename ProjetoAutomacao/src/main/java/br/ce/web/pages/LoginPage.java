package br.ce.web.pages;
import br.ce.web.set.BasePage;


public class LoginPage extends BasePage {
		
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Entrar");
	}
	
	
}
