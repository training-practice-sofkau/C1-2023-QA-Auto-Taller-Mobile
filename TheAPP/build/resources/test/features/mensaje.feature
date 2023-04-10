Feature: The app Echo Box
  yo como usuario de The App
  quiero ingresar un mensaje en la app
  para poder registrar un mensaje de los servicios de la App

  Scenario Outline: Guardar mensaje
    Given Ingresamos a la funcionalidad Echo Box
    When Agregamos el mensaje <mensaje>
    Then Obtenemos mensaje <mensaje>

    Examples:
      | mensaje |
      | "hola"  |
