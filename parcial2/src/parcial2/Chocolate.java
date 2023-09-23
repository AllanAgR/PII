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
class Chocolate extends Decorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
        descripcion = "Chocolate";
        costo = 6;
    }

    public double getCosto() {
        return bebida.getCosto() + costo;
    }
}