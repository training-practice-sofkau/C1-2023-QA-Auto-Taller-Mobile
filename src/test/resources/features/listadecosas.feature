Feature: lista de cosas en TheApp
  Yo como usuario de la app TheApp
  Quiero ver la informacion de una lista de cosas
  para saber acerca de su contenido

  Scenario: Consulta de informacion de una lista de cosas
    Given que iniciamos la aplicacion TheApp
    When seleccionamos la opcion la opcion ListDemo y seleccionamos una cosa
    Then obtenemos informacion acerca de la cosa de la lista