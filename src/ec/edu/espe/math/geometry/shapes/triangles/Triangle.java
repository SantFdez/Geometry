/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.geometry.Triangle;

import java.util.Objects;
import math.geometry.Quadrilateral.Shape;

/**
 *
 * @author Labs-DECC
 */
public abstract class Triangle extends Shape{

    private Float sideOne;
    private Float sideTwo;
    private Float sideThree;

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public Float getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(Float sideTwo) {
        this.sideTwo = sideTwo;
    }

    public Float getSideThree() {
        return sideThree;
    }

    public void setSideThree(Float sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.sideOne);
        hash = 53 * hash + Objects.hashCode(this.sideTwo);
        hash = 53 * hash + Objects.hashCode(this.sideThree);
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
        final Triangle other = (Triangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        if (!Objects.equals(this.sideTwo, other.sideTwo)) {
            return false;
        }
        if (!Objects.equals(this.sideThree, other.sideThree)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
