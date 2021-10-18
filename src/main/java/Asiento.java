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
public class Asiento {
    String color;
    int precio;
    int registro;
    
    void cambiarColor(String color){
        boolean rojo = color.equals("rojo");
        boolean verde = color.equals("verde");
        boolean amarillo = color.equals("amarillo");
        boolean negro = color.equals("negro");
        boolean blanco = color.equals("blanco");
        if(rojo || verde || amarillo || negro || blanco){
            this.color = color;
        }
    }
}
