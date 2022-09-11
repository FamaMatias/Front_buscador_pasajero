Feature: Passanger
  AS Passenger
  I WANT TO Select the number of passengers
  TO indicate the number of people traveling with me

  Scenario: Increase in number of Adults

    Given user add passenger
    When user click on selector plus
    Then he can see one more adult

