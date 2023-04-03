Feature: Aprender sobre un fecha
  AS usuario de la aplicacion The APP
  WANT investigar una fecha
  BECAUSE aprender informacion acerca de esta fecha

  @LearnDate
  Scenario Outline: Buscar fecha
    Given Se ingresa a la aplicacion para buscar fechas
    When Se llena el campo de <mes> el campo <dia> y se oprime el boton buscar
    Then Se mostrara un dato acerca de ese dia

    Examples:
      | mes | dia |
      | 5   | 10  |
      | 6   | 15  |
      | 12  | 4   |