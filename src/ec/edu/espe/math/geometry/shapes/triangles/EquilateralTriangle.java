/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.triangles;

/**
 *
 * @author SONY
 */
public class EquilateralTriangle extends Triangle{

   
    public EquilateralTriangle(Float sideOne) {
        super(sideOne, null);
    }
    
    
    @Override
    public Float perimeter() {
        return (float)(this.base*3);
    }

    @Override
    public Float area() {
        return (float)(Math.sqrt(3)*Math.pow(this.base, 2)/4);
    }
    
}
