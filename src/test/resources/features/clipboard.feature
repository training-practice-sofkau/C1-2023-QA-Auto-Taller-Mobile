Feature: Usar un portapapeles

  Scenario Outline: usar exitosamente el portapepeles
    Given Ingresamos a la app TheApp
    When seleccionamos la opcion de Clipboard Demo
    And Agregamos los <textos>
    Then Obtenemos los mismos <textosescritos> en pantalla

    Examples:
      | textos                    |  | textosescritos            |
      | "el dia esta muy soleado" |  | "el dia esta muy soleado" |
      | "que rico piscina"        |  | "que rico piscina"        |
