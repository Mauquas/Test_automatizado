Feature: Preenchimento do formulario de seguro
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given que esteja no site: "http://sampleapp.tricentis.com/101/app.php"
    When esteja na pagina de Enter Vehicle Data preencho os "dados do veiculo"
    And esteja na pagina de Enter Insurant Data preencho os "dados do seguro"
    And esteja na pagina de Enter Insurant Data preencho os "dados do produto"
    And esteja na pagina de Enter Insurant Data preencho os "dados do pagamento"
    And esteja na pagina de Enter Insurant Data preencho os "enviar a cotacao"
    Then a cotacao sera realizada
