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
class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    void cambiarRegistro(int registro){
        this.registro = registro;
    }
    
    void asignarTipo(String tipo){
        boolean electrico = tipo.equals("electrico");
        boolean gasolina = tipo.equals("gasolina");
        if(electrico || gasolina){
            this.tipo = tipo;
        }
    }
}
