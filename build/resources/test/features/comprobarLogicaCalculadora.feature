Feature: comprobar logica de la calculadora en android

  Scenario Outline: comprobar logica
    Given Ingresamos a la calculadora del telefono android
    When Agregamos los <datos> que queremos validar
    Then Obtenemos el <resultado> y los verificamos

    Examples:
      | datos         |  | resultado  |
      | 100000+120.6 |  | 100,120.56 |
#      | 20/20         |  | 1          |
#      | -5-5          |  | -10        |
#      | -5/-5         |  | 1          |
#      | 5/-5          |  | -1         |