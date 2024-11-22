package com.example.cursodioeletriccar

import com.example.cursodioeletriccar.data.Carros

object  CarFactory {

    val list = listOf(
        Carros(
            id = 1,
            preco = "R#300,000,00",
            potencia = "200cv",
            bateria = "300 kWh",
            recarga = "30 min",
            urlPhoto = "www.google.com"
        ),
        Carros(
            id = 2,
            preco = "R#400,000,00",
            potencia = "300cv",
            bateria = "330 kWh",
            recarga = "20 min",
            urlPhoto = "www.google.com"
        )
    )

}