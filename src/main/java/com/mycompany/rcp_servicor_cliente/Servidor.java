/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rcp_servicor_cliente;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

/**
 *
 * @author jt251
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            JOptionPane.showInternalMessageDialog(null, "Iniciando el Servidor");
            WebServer server =new WebServer(8080);
            Suma suma= new Suma();
            server.addHandler("miServidorRcp", suma);
            
            server.start();
                        JOptionPane.showInternalMessageDialog(null, "Servidor en linea");

                    
        }catch(Exception e){ 
            JOptionPane.showInternalMessageDialog(null, e.getMessage());

        }          
    }
}
