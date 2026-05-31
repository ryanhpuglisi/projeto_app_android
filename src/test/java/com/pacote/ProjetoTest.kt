package com.seu-pacote

import com.seu-pacote.model.Projeto
import org.junit.Assert.assertEquals
import org.junit.Test

class ProjetoTest {

    @Test
    fun calcularPrecoFinal_deveRetornarValorCorreto() {
        // Cenário (Given)
        val projeto = Projeto(
            nome = "App Local Daniel",
            horasEstimadas = 40,
            valorHora = 100.0,
            custosAdicionais = 500.0
        )

        // Ação (When)
        val precoFinal = projeto.calcularPrecoFinal()

        // Validação (Then) - Multiplicação de 40h * R$100 + R$500 deve dar R$4500
        assertEquals(4500.0, precoFinal, 0.01)
    }
}
