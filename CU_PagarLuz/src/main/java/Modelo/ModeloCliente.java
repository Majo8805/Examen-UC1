/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garfi
 */
public class ModeloCliente {
    
    private List<Cliente> listaClientes;
    private Cliente clienteSeleccionado;
    private boolean pagado;
    private PropertyChangeSupport soporteObserver;
        
    public ModeloCliente() {
        soporteObserver = new PropertyChangeSupport(this);
        listaClientes = new ArrayList<>();
        pagado = false;

        //Datos mockeados
        listaClientes.add(new Cliente("12345678", "José Hernández Torres", 1234.5f, 2500.00));
        listaClientes.add(new Cliente("87654321", "María García López", 850.2f, 980.50));
        listaClientes.add(new Cliente("11223344", "Carlos Ruiz Sánchez", 2100.0f, 4200.75));
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        soporteObserver.addPropertyChangeListener(listener);
    }
    
    public void buscarClientes(String texto) {
        List<Cliente> resultados = new ArrayList<>();
        
        if (texto == null || texto.trim().isEmpty()) {
            setListaResultados(resultados); 
            return;
        }

        for (Cliente c : listaClientes) {
            if (c.getNumServicio().contains(texto)) {
                resultados.add(c);
            }
        }
        
        setListaResultados(resultados);
    }
    
    private void setListaResultados(List<Cliente> resultados) {
        soporteObserver.firePropertyChange("resultadosBusqueda", null, resultados);
    }
    
    public void seleccionarCliente(String id) {
        for (Cliente c : listaClientes) {
            if (c.getNumServicio().equals(id)) {
                this.clienteSeleccionado = c;
                this.pagado = false;

                soporteObserver.firePropertyChange("clienteSeleccionado", null, this.clienteSeleccionado);
                break;
            }
        }
    }
    
    public void realizarPago() {
        if (this.clienteSeleccionado != null && !this.pagado) {
            this.pagado = true;
            soporteObserver.firePropertyChange("pagoRealizado", false, this.clienteSeleccionado);
        }
    }
    
}
