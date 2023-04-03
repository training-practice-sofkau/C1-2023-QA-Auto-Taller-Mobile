Feature: Calcular sumas
  AS usuario de la calculadora
  WANT realizar sumas
  BECAUSE hacer operaciones matematicas

  @Sumas
  Scenario Outline: Calculo suma
    Given Ingresamos a la calculadora para sumar
    When Agregamos los <datos> para realizar una suma
    Then Obtenemos el <resultado> de la suma realizada

    Examples:
      | datos |  | resultado |
      | 5+5   |  | 10        |
      | 6+3   |  | 9         |
      | 2+4   |  | 6         |
      | 5+3   |  | 8         |

