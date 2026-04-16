package br.com.cp02fiap.main;

import br.com.cp02fiap.model.*;


public class Principal {
    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("ABC1234", 1000.0, 6);
        Veiculo moto = new Moto("XYZ5678", 50.0, true);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota1 = new Rota(pacote, caminhao);
        rota1.iniciarEntrega();

        Rota rota2 = new Rota(pacote, moto);
        rota2.iniciarEntrega();
    }
}

