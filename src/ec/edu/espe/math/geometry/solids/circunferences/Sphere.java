/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circunferences;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import ec.edu.espe.math.geometry.solids.SolidInterface;

/**
 *
 * @author SONY
 */
public class Sphere extends Circunference implements CircumferenceSolidInterface{

    public Sphere(Float radio) {
        super(radio);
    }

       
    
    @Override
    public Float volume() {
        
        return (float)((4f/3)*Math.PI*Math.pow(this.radio, 3));
    }

    

    @Override
    public Float area() {
        return (float)(4*Math.PI*this.radio*this.radio);
    }

    @Override
    public Float perimeter() {
        return null;
    }
    
}
