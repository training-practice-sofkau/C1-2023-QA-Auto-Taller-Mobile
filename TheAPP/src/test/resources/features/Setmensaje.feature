Feature: Obtener mensaje por clipboard
  yo como usuario de The App
  quiero ingresar un mensaje en la app
  para poder mirar el mensaje de los servicios de la App

  Scenario: mensaje por clipboard
    Given Ingresamos a la funcionalidad Clipboard
    When ingresa el mensaje "mensaje"
    Then Obtendra el  mensaje "mensaje"

