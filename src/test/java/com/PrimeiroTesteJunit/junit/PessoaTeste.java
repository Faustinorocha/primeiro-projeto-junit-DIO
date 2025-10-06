package com.PrimeiroTesteJunit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("JESSICA", LocalDateTime.of(2000, 1, 1, 15,20,30));
        Assertions.assertEquals(25, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("JESSICA", LocalDateTime.of(2000, 1, 1, 15,20,30));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("JOAO", LocalDateTime.of(2015, 1, 1, 15,20,30));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
