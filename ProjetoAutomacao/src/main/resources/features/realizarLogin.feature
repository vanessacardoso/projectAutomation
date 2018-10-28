Feature: Realizar login
 
  @realiza_login
  Scenario: Realizar Login na Conta
    Given acesso o site
    Given acesso o menu Login 
    And preencho o campo email "vanessacardoso.santos@gmail.com"
    And preencho o campo senha "123456"
    Then clico botao entrar
    And valido mensagem de sucesso
    

