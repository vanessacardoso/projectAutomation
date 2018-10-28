Feature: Criar conta

  @criar_conta 
  Scenario: Criar uma conta
    Given acesso o site
    And clico botao Novo Usuario
    And prencho os campos nome, email, e senha:"123456"
    Then clico botao Cadastrar
