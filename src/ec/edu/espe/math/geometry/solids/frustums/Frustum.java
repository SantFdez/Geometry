/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.frustums;

import ec.edu.espe.math.geometry.shapes.circunferences.Ellipse;
import java.util.Objects;

/**
 *
 * @author SONY
 */
public class Frustum extends Ellipse implements FrustumSolidInterface{

    private Float height;

    public Frustum(Float height, Float radioTwo, Float radio) {
        super(radioTwo, radio);
        this.height = height;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.height);
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
        final Frustum other = (Frustum) obj;
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }

    @Override
    public Float volume() {
        return (float)(Math.PI*this.radio*this.height*(Math.pow(this.radio, 2)+Math.pow(this.getRadioTwo(), 2)+this.radio*this.getRadioTwo()));
    }
  
    
    
    
  
    
}
