Feature: Listar Stuff en The App

  Yo como usuario de The App
  Quiero ver la lista de stuff disponibles

  Scenario Outline: Listar un Stuff Valido
    Given He ingresado a la interfaz de Listar
    When Selecciono el stuff deseado "<stuff>"
    Then Deberia ver un mensaje indicando que elegi el stuff
    Examples:
      | stuff       |
      | Altocumulus |
      | Cirrus      |
      | Fog         |