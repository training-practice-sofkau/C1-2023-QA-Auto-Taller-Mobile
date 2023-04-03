Feature: Photo Demo
  yo como usuario de la app movil
  quiero usar los servicios photo demo
  para poder usar los servicios de la app

  @PhotoDemo
  Scenario Outline:PhotoDemo
    Given el usuario esta en la pagina de inicio de la the app
    When navega hasta la opcion photo selecciona una photo para ver las descrripcion de cada una de ellas
    Then el usuario debe ver la <informacion> de la photo
    Examples:
      | informacion                                                    |
      | "This is a picture of: A long thin cloud below mountain level" |
