
Feature: Passanger
  AS Passenger
  I WANT TO Select the number of passengers
  TO indicate the number of people traveling with meScenario: Select label Country

  Scenario: Select label Country

    Given user want see country options
    When user click on selector origin
    And user click on selector country
    Then he can see boxes with all country inside