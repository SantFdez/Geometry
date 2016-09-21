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
public class ScaleneTriangle extends Triangle{

    public ScaleneTriangle(Float sideOne, Float sideTwo, Float sideThree) {
        super(sideOne, sideTwo, sideThree);
    }


    
    
    @Override
    public Float perimeter() {
        return this.getSideOne()+this.getSideTwo()+this.getSideThree();
    }

    @Override
    public Float area() {
        float s=this.perimeter();
        return (float)(Math.sqrt((s-this.sideOne)+(s-this.sideTwo)+(s-this.sideThree)));
    }
    
}
