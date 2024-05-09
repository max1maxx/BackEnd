package com.espe.concesionario.models;

public class AutomovilModel {
    private Long id_automovil;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String precio;

    public AutomovilModel() {
    }

    public AutomovilModel(Long id_automovil, String matricula, String marca, String modelo, String color, String precio) {
        this.id_automovil = id_automovil;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Long getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(Long id_automovil) {
        this.id_automovil = id_automovil;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "AutomovilModel{" +
                "id_automovil=" + id_automovil +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
