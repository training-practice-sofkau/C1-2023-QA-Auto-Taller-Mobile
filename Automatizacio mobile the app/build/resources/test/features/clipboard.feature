Feature: Portapapeles en The APP
  AS usuario de la aplicacion The APP
  WANT guardar informacion en el portapapeles de la app
  BECAUSE no perder informacion

  @Clipboard
  Scenario Outline: Guardar en el portapapeles
    Given Se ingresa a la aplicacion para guardar informacion
    When Se llena el campo de <info> se oprime el boton guardar y el boton refresh
    Then El portapapeles muestra la <info> guardada

    Examples:
      | info                                                                        |
      | "1635246541343132564613"                                                    |
      | "Delete * \n"                                                               |
      | "  "                                                                        |
      | "git clone https://github.com/Josenzb/C1-2023-QA-Auto-Taller-Mobile.git \n" |