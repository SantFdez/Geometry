/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.circunferences;

/**
 *
 * @author SONY
 */
public class Circle extends Circunference {

    public Circle(Float radio) {
        super(radio);
    }

    
    @Override
    public Float perimeter() {
        return (float)Math.PI*2*this.radio;
    }

    @Override
    public Float area() {
        return (float)Math.PI*this.radio*this.radio;
    }
    
}
