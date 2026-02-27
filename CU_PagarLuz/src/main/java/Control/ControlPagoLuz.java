/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ModeloCliente;
import Vista.VistaPagoLuz;

/**
 *
 * @author garfi
 */
public class ControlPagoLuz {
    
    private VistaPagoLuz vista;
    private ModeloCliente modelo;
    
    public ControlPagoLuz(VistaPagoLuz vista, ModeloCliente modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void eventoBusqueda(String texto) {
        modelo.buscarClientes(texto); 
    }
    
    public void notificarSeleccion(String numeroServicio) {
        modelo.seleccionarCliente(numeroServicio); 
    }
    
    public void eventoBotonPagar() {
        modelo.realizarPago(); 
    }
    
}
