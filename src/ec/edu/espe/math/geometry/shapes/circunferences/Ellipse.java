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
public class Ellipse extends Circunference{

    private Float radioTwo;

    public Ellipse(Float radioTwo, Float radio) {
        super(radio);
        this.radioTwo = radioTwo;
    }

    public Float getRadioTwo() {
        return radioTwo;
    }

    public void setRadioTwo(Float radioTwo) {
        this.radioTwo = radioTwo;
    }
    
    
   
    @Override
    public Float perimeter() {
        return (float)(2*Math.PI*Math.sqrt((Math.pow(this.radio, 2)+Math.pow(this.radioTwo, 2))/2));
    }

    @Override
    public Float area() {
        return (float)(Math.PI*this.radio*this.radioTwo);
    }
    
}
