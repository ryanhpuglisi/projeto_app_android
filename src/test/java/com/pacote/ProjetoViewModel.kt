package com.seu-pacote.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seu-pacote.model.Projeto

class ProjetoViewModel : ViewModel() {

    private val _precoCalculado = MutableLiveData<Double>()
    val precoCalculado: LiveData<Double> get() = _precoCalculado

    fun processarPrecificacao(horas: String, valorHora: String, custos: String) {
        val h = horas.toIntOrNull() ?: 0
        val vh = valorHora.toDoubleOrNull() ?: 0.0
        val c = custos.toDoubleOrNull() ?: 0.0

        val projeto = Projeto(horasEstimadas = h, valorHora = vh, custosAdicionais = c)
        _precoCalculado.value = projeto.calcularPrecoFinal()
    }
}
