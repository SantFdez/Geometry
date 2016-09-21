/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cones;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import java.util.Objects;

/**
 *
 * @author SONY
 */
public class Cone extends Circunference implements ConeSolidInterface{

    private Float height;
    private Float side;

    public Cone(Float height, Float side, Float radio) {
        super(radio);
        this.height = height;
        this.side = side;
    }

   

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.height);
        hash = 79 * hash + Objects.hashCode(this.side);
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
        final Cone other = (Cone) obj;
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        if (!Objects.equals(this.side, other.side)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public Float volume() {
        return (float)((1/3f)*Math.PI*Math.pow(this.radio, 2)*this.height);
    }

    @Override
    public Float perimeter() {
        return (float)(Math.PI*this.radio*(this.side+this.radio));
    }

    @Override
    public Float area() {
        return (float)(Math.PI*this.radio*this.side);
    }
    
}
