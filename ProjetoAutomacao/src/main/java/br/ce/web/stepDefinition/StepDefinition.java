package br.ce.web.stepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import br.ce.web.pages.ContasPage;
import br.ce.web.pages.MenuPage;
import br.ce.web.pages.MovimentacaoPage;
import br.ce.web.set.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();

	
	@Given("^acesso o site$")
	public void acesso_o_site() throws Throwable {
		BaseTest driver = new BaseTest();
		driver.setup();
	}



	/**
	 * Cadastro de uma nova conta com nome e email randômico 
	 * 
	 */
	@Given("^clico botao Novo Usuario$")
	public void clico_botao_Novo_Usuario() throws Throwable {
		menuPage.acessarTelaInserirConta();
	}
	
	@Given("^prencho os campos nome, email, e senha:\"([^\"]*)\"$")
	public void prencho_os_campos_nome_email_e_senha(String senha) throws Throwable {
		contasPage.setNome(RandomStringUtils.randomAlphanumeric(10));
		contasPage.setEmail(RandomStringUtils.randomAlphanumeric(10)+ "@gmail"+".com.br");
		contasPage.setSenha(senha); 
	}

	@Then("^clico botao Cadastrar$")
	public void clico_botao_Cadastrar() throws Throwable {
		contasPage.clicarBtCadastrar();
	}
	
	/**
	 * 
	 * 
	 */

	@Given("^acesso o menu Login$")
	public void acesso_o_menu_Login() throws Throwable {
		menuPage.acessarMenuLogin();
	}

	@Given("^preencho o campo email \"([^\"]*)\"$")
	public void preencho_o_campo_email(String email) throws Throwable {
		contasPage.setEmail(email);

	}

	@Given("^preencho o campo senha \"([^\"]*)\"$")
	public void preencho_o_campo_senha(String senha) throws Throwable {
		contasPage.setSenha(senha);
	}

	@Then("^clico botao entrar$")
	public void clico_botao_entrar() throws Throwable {
		menuPage.entrar();
	}

	@Then("^valido mensagem de sucesso$")
	public void valido_mensagem_de_sucesso() throws Throwable {
		Assert.assertEquals("Bem vindo, Vanessa Cardoso!", contasPage.obterMensagemSucesso());
	}
	
	
	@Then("^valido mensagem de sucesso \"([^\"]*)\"$")
	public void valido_mensagem_de_sucesso(String mensagem) throws Throwable {
		Assert.assertEquals(mensagem, contasPage.obterMensagemSucesso());
	}
	
	/**
	 * Cadastro e exclusão de contas
	 * 
	 */

	@Given("^clico botao Contas e menu Adicionar$")
	public void clico_botao_Contas_e_menu_Adicionar() throws Throwable {
		menuPage.acessarTelaCadastrarConta();
	}

	@Given("^preencho o campo \"([^\"]*)\"$")
	public void preencho_o_campo(String nome) throws Throwable {
		contasPage.setNome(nome);
	}

	@Then("^clico botao Salvar$")
	public void clico_botao_Salvar() throws Throwable {
		menuPage.salvar();
	}

	@Given("^clico botao Contas e menu Listar$")
	public void clico_botao_Contas_e_menu_Listar() throws Throwable {
		menuPage.acessarTelaListarConta();
	}

	@Given("^clico botao Excluir \"([^\"]*)\"$")
	public void clico_botao_Excluir(String nome) throws Throwable {
		contasPage.clicarExcluirConta(nome);
	}
	
	/**
	 *Movimentação da conta
	 */

	@Given("^clico menu Criar Movimentacao$")
	public void clico_menu_Criar_Movimentacao() throws Throwable {
		menuPage.acessarTelaInserirMovimentacao();
	}

	@Given("^seleciono \"([^\"]*)\" na combo Tipo Movimentacao$")
	public void seleciono_na_combo_Tipo_Movimentacao(String valor) throws Throwable {
		movimentacaoPage.selecionarCombo("tipo", valor);
	}

	@Given("^preencho data da movimentacao \"([^\"]*)\"$")
	public void preencho_data_da_movimentacao(String data) throws Throwable {
		movimentacaoPage.setDataMovimentacao(data);
	}

	@Given("^preencho descricao \"([^\"]*)\"$")
	public void preencho_descricao(String interessado) throws Throwable {
		movimentacaoPage.setDescricao(interessado);
	}

	@Given("^preencho interessado \"([^\"]*)\"$")
	public void preencho_interessado(String interessado) throws Throwable {
		movimentacaoPage.setInteressado(interessado);
	}

	@Given("^preencho valor \"([^\"]*)\"$")
	public void preencho_valor(String valor) throws Throwable {
		movimentacaoPage.setValor(valor);
	}

	@Given("^seleciono a conta \"([^\"]*)\"$")
	public void seleciono_a_conta(String conta) throws Throwable {
		movimentacaoPage.selecionarCombo("conta", conta);
	}

	@Given("^preencho data do pagamento \"([^\"]*)\"$")
	public void preencho_data_do_pagamento(String data) throws Throwable {
		movimentacaoPage.setDataPagamento(data);
	}

	@Given("^seleciono a opcao de pagamento \"([^\"]*)\"$")
	public void seleciono_a_opcao_de_pagamento(String status) throws Throwable {
		movimentacaoPage.setStatus(status);
	}

	@Then("^realizo logoff$")
	public void realizo_logoff() throws Throwable {
		menuPage.sair();
	}

	/**
	 * Menu Resumo mensal
	 */
	
	@Given("^clico menu Resumo mensal$")
	public void clico_menu_Resumo_mensal() throws Throwable {
		menuPage.acessarTelaResumoMensal();
	
	}

	@Given("^seleciono o mes \"([^\"]*)\"$")
	public void seleciono_o_mes(String mes) throws Throwable {
		movimentacaoPage.selecionarCombo("mes", mes);
	}

	@Given("^seleciono o ano \"([^\"]*)\"$")
	public void seleciono_o_ano(String ano) throws Throwable {
		movimentacaoPage.selecionarCombo("ano", ano);
	}

	@Given("^clico botao Buscar$")
	public void clico_botao_Buscar() throws Throwable {
		menuPage.buscar();
	}

}
