# language: es
# Author: Santiago Barragán Leon
# Version: 1.0
# FechaUltimaVersion: 10/09/2021

@Cucumber
Característica: Test Serenity

  este feature se trata de reto tecnico automatizador hdi

  @Regresion
  Escenario: Validar Reunion Creada Exitosamente
    Dado Que Usuario entra en Serenity
    Cuando Usuario ingresa a la funcionalidad Mi Cuenta con datos: admin,serenity
    Y Usuario ingresa a business unit
    Y Usuario crea new business unit con datos: Test
    Y Usuario ingresa a meeting
    Y Usuario crea new meeting con datos: Prueba Completa
    Entonces Usuario visualiza texto: Prueba Completa
