/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.triangles;

import java.util.Objects;

/**
 *
 * @author SONY
 */
public class RightAngleTriangle extends Triangle{

    public RightAngleTriangle(Float base, Float height) {
        super(base, height);
    }
    
    

    
    
    @Override
    public Float perimeter() {
         return (float)(Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2))+this.base+this.height);
    }

    @Override
    public Float area() {
            return (this.base*this.height/2);
    }

    
    
}
