/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.circunferences;

import ec.edu.espe.math.geometry.shapes.ShapeInterface;

/**
 *
 * @author SONY
 */
public abstract class Circunference implements ShapeInterface{
    protected Float radio;

    public Circunference() {
    }

    public Circunference(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
    
}
