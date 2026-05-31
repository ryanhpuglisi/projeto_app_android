package com.seu-pacote.model

data class Projeto(
    val id: String = "",
    val nome: String = "",
    val horasEstimadas: Int = 0,
    val valorHora: Double = 0.0,
    val custosAdicionais: Double = 0.0
) {
    // Regra de negócio automatizada para calcular o preço final
    fun calcularPrecoFinal(): Double {
        return (horasEstimadas * valorHora) + custosAdicionais
    }
}
