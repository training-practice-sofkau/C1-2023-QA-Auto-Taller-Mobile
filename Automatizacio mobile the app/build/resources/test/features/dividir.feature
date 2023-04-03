Feature: Calcular division
  AS usuario de la calculadora
  WANT realizar divisiones
  BECAUSE hacer operaciones matematicas

  @Dividir
  Scenario Outline: Calculo Division
    Given Ingresamos a la calculadora para dividir
    When Agregamos los <datos> para realizar una division
    Then Obtenemos el <resultado> de la division realizada

    Examples:
      | datos |  | resultado |
      | 4/2   |  | 2         |
      | 8/2   |  | 4         |
      | 6/1   |  | 6         |
      | 9/3   |  | 3         |