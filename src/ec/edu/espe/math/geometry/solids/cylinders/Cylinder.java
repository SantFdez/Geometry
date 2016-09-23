/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cylinders;

import ec.edu.espe.math.geometry.shapes.circunferences.Circle;
import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;

/**
 *
 * @author SONY
 */
public class Cylinder extends Circunference implements CylinderSolidInterface{
    private Float height;

    public Cylinder(Float height, Float radio) {
        super(radio);
        this.height = height;
    }

    
    
    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
    
    
    @Override
    public Float perimeter() {
        return null;
    }

    @Override
    public Float area() {
        return (float)(2*Math.PI*this.radio*(this.height));
    }

    @Override
    public Float volume() {
        return (float)(Math.PI*Math.pow(this.radio,2)*this.height);
    }
    
}