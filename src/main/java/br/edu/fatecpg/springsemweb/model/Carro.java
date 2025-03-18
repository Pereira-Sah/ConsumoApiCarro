package br.edu.fatecpg.springsemweb.model;

public class Carro {
    public String modelo;
    public String marca;
    public String anoModelo;
    public String valor;

    @Override
    public String toString() {
        return "Carro{" +
                "Modelo='" + modelo + '\'' +
                ", Marca='" + marca + '\'' +
                ", Ano='" + anoModelo + '\'' +
                ", Valor='" + valor + '\'' +
                '}';
    }
}
