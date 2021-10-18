/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


/**
 *
 * @author camilo
 */
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    String verificarIntegridad(){
        if(this.registro != motor.registro ){
            return "Las piezas no son originales";
        } else {
            for (Asiento asiento : asientos) {
                if(asiento != null && this.registro != asiento.registro){
                    return "Las piezas no son originales";
                }
            }
        }
        
        return "Auto original";
    }
}
