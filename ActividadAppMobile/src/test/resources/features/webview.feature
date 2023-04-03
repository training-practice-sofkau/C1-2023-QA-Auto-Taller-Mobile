Feature: Webview
  yo como usuario de la app v1.100
  quiero probar la funcionalidad del Webview
  para ver si me redirecciona a la url o si funciona el boton de clear

  Scenario Outline: Navigate page
    Given que el usuario ingresa a la aplicacion movil v1100
    When entra a la funcionalidad webview
    And escribe una <url> y presiono el <boton>
    Then aparece un <mensaje> segun el boton presionado

    Examples:
      | mensaje                                        | boton   | url              |
      | "Sorry, you are not allowed to visit that url" | "Go"    | "www.google.com" |
      | "Sorry, you are n"                             | "Go"    | "www.google.com" |
      | "https://appiumpro.com"                        | "Clear" | "asas"           |
      | "sfddfdf"                                      | "Clear" | "asas"           |