Feature: Clipboard de The App

  Yo como usuario de The App
  Quiero poder usar el Clipboard
  para visualziar mis mensajes

  Scenario: Nuevo Seteo de Mensaje
    Given He ingresado a la interfaz Clipboard
    When Ingreso el nuevo mensaje que quiero visualizar
    And Refresco el Texto del clipboard
    Then Deberia ver el mensaje nuevo en el clipboard