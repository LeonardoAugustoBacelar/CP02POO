package br.com.cp02fiap.model;

public abstract class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("Capacidade não pode ser negativa");
        }
        this.capacidade = capacidade;
    }
}