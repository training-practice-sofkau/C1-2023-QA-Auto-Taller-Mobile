Feature: Echo Box
  yo como usuario de la app movil
  quiero usar los servicios de chat de eco
  para poder ver los chat de la app

  @EchoBox
  Scenario Outline:Echo Box
    Given el usuario esta en la pagina de inicio de la app
    When navega hasta la opcion de echo box envia la <informacion> al  chat
    Then el usuario debe ver su <mensaje> guardado en pantalla
    Examples:
      | informacion             | mensaje                 |
      | "hola mundo soy yeison" | "hola mundo soy yeison" |
