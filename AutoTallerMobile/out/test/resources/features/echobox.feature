Feature: Echo Box
  Yo como usuario de TheApp
  Quiero escribir texto en el campo habilitado
  Para guardar el text escrito

  Scenario Outline: Ingresar texto
    Given el usuario ingresa a la funcionalidad de Echo Box
    When ingresa un texto "<texto>" en el campo habilitado
    Then el usuario debe visualizar en pantalla un mensaje del texto guardado
    Examples:
      | texto  |
      | ****   |
      | Hola / |
      | soy yo |

