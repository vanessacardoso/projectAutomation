Feature: Criar movimentacao

  Background: realizar login
    Given acesso o site
    Given acesso o menu Login
    And preencho o campo email "vanessacardoso.santos@gmail.com"
    And preencho o campo senha "123456"
    Then clico botao entrar

  @criar_movimentacao
  Scenario Outline: Criar movimentacoes
    Given clico menu Criar Movimentacao
    And seleciono "<tipo>" na combo Tipo Movimentacao
    And preencho data da movimentacao "<dataMovimentacao>"
    And preencho data do pagamento "<dataPagamento>"
    And preencho descricao "<descricao>"
    And preencho interessado "<interessado>"
    And preencho valor "<valor>"
    And seleciono a conta "<conta>"
    And seleciono a opcao de pagamento "<status>"
    When clico botao Salvar
    Then realizo logoff

    Examples: 
      | tipo    | dataPagamento | dataMovimentacao | descricao | interessado            | valor | conta          | status          |
      | Receita | 11/10/2018    | 11/10/2018       | descricao | interessado a qualquer |   150 | Conta da Luiza | status_pago     |
      | Despesa | 11/10/2018    | 11/10/2018       | descricao | interessado a qualquer |   150 | Conta da Luiza | status_pendente |

  @listar_movimentacao
  Scenario Outline: Menu resumo mensal
    Given clico menu Resumo mensal
    And seleciono o mes "<mes>"
    And seleciono o ano "<ano>"
    And clico botao Buscar
    Then realizo logoff

    Examples: 
      | mes    | ano    |
			|Outubro | 2018   |