Feature: Descripcion de fotos en TheApp
  Yo como usuario de la app TheApp
  Quiero ver la informacion de una foto
  para saber de que trata la foto


  Scenario: Consulta de informacion de una foto
    Given que ingresamos a la aplicacion TheApp
    When seleccionamos la opcion PhotoDemo y seleccionamos una foto
    Then obtenemos la información de la foto
