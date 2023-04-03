Feature: Aprender sobre una foto
  AS usuario de la aplicacion The APP
  WANT investigar una foto
  BECAUSE aprender informacion acerca de esta foto

  @LearnDate
  Scenario Outline: Buscar fecha
    Given Se ingresa a la aplicacion para buscar fotos
    When Se da click en la foto <numero>
    Then Se mostrara un dato acerca de esa foto

    Examples:
      | numero |
      | 1      |
      | 2      |
      | 3      |
      | 4      |
