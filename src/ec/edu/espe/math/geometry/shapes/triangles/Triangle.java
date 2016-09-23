/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.triangles;

import java.util.Objects;
import ec.edu.espe.math.geometry.shapes.ShapeInterface;

/**
 *
 * @author Labs-DECC
 */
public abstract class Triangle implements ShapeInterface{

    protected Float base;
    protected Float height;

    public Triangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.base);
        hash = 37 * hash + Objects.hashCode(this.height);
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
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
