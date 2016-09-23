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
public class ObtuseAngleTriangle extends RightAngleTriangle{

   
    private Float side2;
    private Float side3;

    public ObtuseAngleTriangle(Float side2, Float side3, Float base) {
        super(base, null);
        this.side2 = side2;
        this.side3 = side3;
    }

    public Float getSide2() {
        return side2;
    }

    public void setSide2(Float side2) {
        this.side2 = side2;
    }

    public Float getSide3() {
        return side3;
    }

    public void setSide3(Float side3) {
        this.side3 = side3;
    }
    
    

    @Override
    public Float area() {
        float s=this.perimeter();
        return (float)(Math.sqrt((s-this.getSide2())+(s-this.getSide3())+(s-this.base)));
    }

    @Override
    public Float perimeter() {
        return (float)(side2+side3+base);
    }

    
   
}
