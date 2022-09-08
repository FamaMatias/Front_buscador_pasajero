Feature: Passanger
  AS Passenger
  I WANT TO Select the number of passengers
  TO indicate the number of people traveling with me

  Scenario: Increase in number of Adults

    Given user add passenger
    When user click on selector plus
    Then he can see one more adult


  Scenario Outline: Group reservation sign below the Adults selector

    Given user want select <Adults>
    When user click on selector plus
    Then he can see an alert whit a link <Sign> below the Adults selector

  Examples:
  |Adults  |Sign                |
  |9       |null                |
  |10      |"Group reservation" |
  |25      |"Group reservation" |


  Scenario: Select label Country

    Given user want see country options
    When user click on selector origin
    And user click on selector country
    Then he can see boxes with all country inside
