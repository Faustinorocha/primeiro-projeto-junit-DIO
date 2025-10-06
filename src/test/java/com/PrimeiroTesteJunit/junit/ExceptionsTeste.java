package com.PrimeiroTesteJunit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeEcvecaoNaTransferencia() {
        Conta contaOrigigem =  new Conta("123456", 0 );
        Conta contaDestino = new Conta("123457", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigigem, contaDestino, -1));
    }
}
