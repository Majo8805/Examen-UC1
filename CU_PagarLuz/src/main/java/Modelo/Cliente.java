/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author garfi
 */
public class Cliente {
    
    private String numServicio;
    private String nombre;
    private float kwh;
    private double total;

    public Cliente(String numServicio, String nombre, float kwh, double total) {
        this.numServicio = numServicio;
        this.nombre = nombre;
        this.kwh = kwh;
        this.total = total;
    }

    public String getNumServicio() {
        return numServicio;
    }

    public void setNumServicio(String numServicio) {
        this.numServicio = numServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numServicio=" + numServicio + ", nombre=" + nombre + ", kwh=" + kwh + ", total=" + total + '}';
    }
    
}
