Feature: Escribir algo en echobox
  Yo como usuario de la aplicación The App
  Quiero poder escribir algo en el echobox
  para que se guarde en la memoria local.

  Scenario: Escribir algo en echobox
    Given que el usuario esta en la pagina del inicio
    When el usuario entra a la funcion echobox y escribe el mensaje "Hola mundo"
    Then el usuario debera ver en pantalla el mensaje "Hola mundo"



