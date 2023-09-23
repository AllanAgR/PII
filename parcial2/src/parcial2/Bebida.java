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
abstract class Bebida {
    protected String descripcion;
    protected double costo;

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getCosto();
}
