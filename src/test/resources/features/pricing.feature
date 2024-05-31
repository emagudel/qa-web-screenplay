Feature: Choose a Plan
  I as a user want to choose a plan
  For strategic planning and business intelligence software

  Scenario Outline: Choose a plan successfully
    Given that the user open the pricing page
    And I select the <period>
    When I subscribe to the <plan>
    And I fill out plan form

    Examples:
      | period   | plan     |
      | Monthly  | Basic    |
      | Annually | Platinum |

    #Given el Usuario es comprador usual
    #When ingresa sus credenciales
    #Then su autenticacion es exitosa