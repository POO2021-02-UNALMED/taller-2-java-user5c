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
        return asientos.length;
    }
    
    String verificarIntegridad(){
        if(this.registro != motor.registro ){
            return "Las piezas no son originales";
        } else {
            for(int i=0; i < this.cantidadAsientos(); i++){
                Asiento asiento = asientos[i];
                if(this.registro != asiento.registro){
                    return "Las piezas no son originales";
                }
            }
        }
        
        return "Auto original";
    }
}
