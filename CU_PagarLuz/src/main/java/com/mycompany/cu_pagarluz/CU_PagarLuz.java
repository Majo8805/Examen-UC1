/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cu_pagarluz;

import Vista.VistaPagoLuz;

/**
 *
 * @author garfi
 */
public class CU_PagarLuz {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaPagoLuz ventana = new VistaPagoLuz();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
    }
}
