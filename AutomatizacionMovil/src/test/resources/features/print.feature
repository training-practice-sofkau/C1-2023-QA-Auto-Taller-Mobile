Feature: Imprimir mensajes
  YO como usuario de TheApp
  QUIERO escribir un texto
  PARA poder leerlo

  Background:
    Given El usuario esta en la aplicacion

  Scenario Outline: Informacion de dias
    Given El usuario esta en Echo Box
    When Escribe un <Texto>
    Then obtiene un <Texto>

    Examples:
      | Texto                     |
      | "Bienvenidos al Himalaya" |
      | "Ya viene la graduacion"  |
      | "No se que mas escribir"  |