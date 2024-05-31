Feature: Choose a Plan
  I as a user want to choose a plan
  For strategic planning and business intelligence software

  Scenario Outline: Choose a plan successfully
    Given that the user open the pricing page
    When I select the <period> and subscribe to the <plan>
    And I fill out basic information '<First_Name>' '<Last_Name>' '<Email_Address>' '<Phone_Number>'
    And I fill out company information '<Company_Name>' '<Fiscal_Year>' '<Accounting_Software>' '<Country>' '<State>' '<City>' '<Currency>'
    #And I fill out payment method '<Company_Name>' '<Fiscal_Year>' '<Accounting_Software>' '<Country>' '<State>' '<City>' '<Currency>'
    #Then Payment confirmation is successful

    Examples:
      | period   | plan     | First_Name | Last_Name | Email_Address            | Phone_Number | Company_Name     | Fiscal_Year | Accounting_Software | Country       | State   | City         | Currency |
      | Monthly  | Basic    | Erik       | Agudelo   | agudelo.0312+3@gmail.com | 1707844025   | Company Test     | April       | Acumatica           | United States | Florida | Miami        | USD      |
      | Annually | Platinum | Manuel     | Rios      | agudelo.0312+4@gmail.com | 1707844025   | Company Test 001 | June        | SAP                 | Canada        | Ontario | Toronto      | CAD      |
      | Monthly  | Platinum | Juan       | Perez     | agudelo.0312+5@gmail.com | 1707844025   | Company Test 002 | November    | Blackline           | England       | London  | Smithfield   | GBP      |
      | Annually | Basic    | Miguel     | Ramos     | agudelo.0312+6@gmail.com | 1707844025   | Company Test 003 | July        | Xero                | Thailand      | Buriram | Buriram City | THB      |
