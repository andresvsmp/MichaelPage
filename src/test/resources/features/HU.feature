Feature: HU para Michael Page

  Scenario: Prueba creacion de contacto en formulario
    Given Hago log in en la pagina
    Then Realizo el formulario de contacto

  Scenario: Prueba creacion de cliente en formulario
    Given Hago log in en la pagina
    Then Realizo el formulario de cliente
    Then Cierro el browser
