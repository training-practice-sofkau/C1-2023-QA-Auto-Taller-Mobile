Feature: Grabar mensajes en TheApp
  Yo como usuario de la app TheApp
  Quiero grabar un mensaje de texto
  para despues verlo en pantalla

  Scenario: guardar un mensaje de texto
    Given que abrimos a la aplicacion TheApp
    When seleccionamos la opcion la opcion EchoBox y escribimos un mensaje
    Then observamos el mensaje en pantalla