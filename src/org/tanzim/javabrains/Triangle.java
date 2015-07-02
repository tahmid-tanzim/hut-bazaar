/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanzim.javabrains;

import java.util.List;

/**
 *
 * @author tanzim
 */
public class Triangle {
    private List<Point> points;
    
    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public List<Point> getPoints() {
        return this.points;
    }

    public void draw(){
        for(Point point : this.getPoints()) {
            System.out.println("Point - ("+ point.getX() + ", " + point.getY() + ")");
        }
    }
}
