package com.PrimeiroTesteJunit.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 13, 20)));
    }
    @AfterEach
    void removeDadosTeste(){
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 13, 20)));
    }
    @AfterAll
    static  void finalizarConexao() {
        BancoDeDados.finalizarConexao();

    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

}
