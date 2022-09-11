Feature: Passanger
  AS Passenger
  I WANT TO Select the number of passengers
  TO indicate the number of people traveling with me

  Background: Increase in number of Adults

  Scenario Outline: Group reservation sign below the Adults selector
  When user click on selector plus in '<Adults>'
  Then below the Adults selector he can see an alert whit a link '<Sign>'

  Examples:
  |Adults  |Sign                |
  |9       |''                  |
  |10      |"Group reservation" |
  |25      |"Group reservation" |