Feature: Calcular restas
  AS usuario de la calculadora
  WANT realizar restas
  BECAUSE hacer operaciones matematicas

  @Resta
  Scenario Outline: Calculo restas
    Given Ingresamos a la calculadora para restar
    When Agregamos los <datos> para realizar una resta
    Then Obtenemos el <resultado> de la resta realizada

    Examples:
      | datos |  | resultado |
      | 2-1   |  | 1         |
      | 9-0   |  | 9         |
      | 7-3   |  | 4         |
      | 8-6   |  | 2         |