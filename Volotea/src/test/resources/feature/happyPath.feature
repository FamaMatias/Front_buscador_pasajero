Feature: Passanger
  AS Passenger
  I WANT TO Select the Origin and Destiantion
  TO fly

  Scenario: Happy path

    Given user in the portal
    When user select origin and destination
    And select date to outbound and return
    Then he can buy the fly