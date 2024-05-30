Feature: Login Saucedemo

  Scenario: Autenticacion exitosa en la App
    Given el Usuario es comprador usual
    When ingresa sus credenciales
    Then su autenticacion es exitosa