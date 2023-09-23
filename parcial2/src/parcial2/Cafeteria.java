/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author AGUILAR
 */
public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();

        //cafe = new Leche(cafe);

        cafe = new Chocolate(cafe);

        System.out.println("Descripción: " + cafe.getDescripcion());
        System.out.println("Costo Total: " + cafe.getCosto());
    }
}
