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

    private Float sideOne;

    public EquilateralTriangle(Float sideOne, Float sideTwo, Float sideThree) {
        super(sideOne, sideTwo, sideThree);
    }
    
    
    @Override
    public Float perimeter() {
        return (float)(Math.sqrt(3/4)*Math.pow(this.sideOne, 2));
    }

    @Override
    public Float area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
