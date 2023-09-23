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

abstract class Decorador extends Bebida {
    protected Bebida bebida;

public Decorador(Bebida bebida) {
        this.bebida = bebida;
    

}
}

class Leche extends Decorador {
    public Leche(Bebida bebida) {
        super(bebida);
        descripcion = "Leche";
        costo = 5;
    }

    public double getCosto() {
        return bebida.getCosto() + costo;
    }
}
