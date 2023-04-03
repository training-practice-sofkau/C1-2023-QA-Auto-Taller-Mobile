Feature: The app Echo Box

  Scenario Outline: Guardar mensaje
    Given Ingresamos a la funcionalidad Echo Box
    When Agregamos el mensaje <mensaje>
    Then Obtenemos mensaje <mensaje>

    Examples:
      | mensaje |
      | "hola"  |
