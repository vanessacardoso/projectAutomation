Feature: Menu de Conta
 
 Background: realizar login
    Given acesso o site
    Given acesso o menu Login
    And preencho o campo email "vanessacardoso.santos@gmail.com"
    And preencho o campo senha "123456"
    Then clico botao entrar

  @adicionar_conta
  Scenario Outline: Adicionar Contas
    Given clico botao Contas e menu Adicionar
    And preencho o campo "<nome>"
    Then clico botao Salvar
    Then realizo logoff

    Examples: 
      | nome    |
      | Luiza   |
      | Eduarda |

  @excluir_conta
  Scenario Outline: Adicionar Contas
    Given clico botao Contas e menu Listar
    And clico botao Excluir "<nome>"
    Then valido mensagem de sucesso "Conta removida com sucesso!"
    Then realizo logoff

    Examples: 
      | nome  |
      | Luiza |
