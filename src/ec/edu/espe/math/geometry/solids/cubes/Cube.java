/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cubes;

import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;
import ec.edu.espe.math.geometry.solids.cubes.CubeSolidInterface;

/**
 *
 * @author SONY
 */
public class Cube extends Square implements CubeSolidInterface{

    public Cube(Float side) {
        super(side);
    }
    
    
    @Override
    public Float volume() {
        return (float)(Math.pow(this.getSide(), 3));
    }

    @Override
    public Float area() {
        return super.area()*6; 
    }
    
    
    
}
