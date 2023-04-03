Feature: Calcular multiplicaion
  AS usuario de la calculadora
  WANT realizar multipilcaciones
  BECAUSE hacer operaciones matematicas

  @Multiplicar
  Scenario Outline: Calculo multiplicacion
    Given Ingresamos a la calculadora para multiplicar
    When Agregamos los <datos> para realizar una multiplicacion
    Then Obtenemos el <resultado> de la multiplicacion realizada

    Examples:
      | datos |  | resultado |
      | 2*1   |  | 2         |
      | 9*0   |  | 0         |
      | 7*3   |  | 21        |
      | 8*6   |  | 48        |