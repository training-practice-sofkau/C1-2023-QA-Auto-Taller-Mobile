Feature: Obtener datos curiosos de los dias del año
  YO como usuario de TheApp
  QUIERO conocer información importante de los dias del año
  PARA aprende mas de la historia

  Background:
    Given El usuario esta en la aplicacion

  Scenario Outline: Informacion de dias
    Given El usuario esta en Picker Demo
    When Escoge el <Mes> y el <Dia> que desea consultar
    Then obtiene un <Titulo> y un mensaje

    Examples:
      | Mes | Dia | Titulo                   |
      | 11  | 11  | "On this day (11/11) in" |
      | 2   | 30  | "Error"                  |