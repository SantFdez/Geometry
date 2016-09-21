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
    private Float base;
    private Float heigth;

    public RightAngleTriangle(Float base, Float heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    
    
    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeigth() {
        return heigth;
    }

    public void setHeigth(Float heigth) {
        this.heigth = heigth;
    }

    @Override
    public Float perimeter() {
         return (float)(Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.heigth, 2))+this.base+this.heigth);
    }

    @Override
    public Float area() {
            return (this.base*this.heigth/2);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.base);
        hash = 43 * hash + Objects.hashCode(this.heigth);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RightAngleTriangle other = (RightAngleTriangle) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.heigth, other.heigth)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
