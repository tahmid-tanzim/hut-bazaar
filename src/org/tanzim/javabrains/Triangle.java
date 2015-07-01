/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanzim.javabrains;

/**
 *
 * @author tanzim
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    
    public void setPointA(Point point) {
        this.pointA = point;
    }
    
    public Point getPointA() {
        return this.pointA;
    }

    public void setPointB(Point point) {
        this.pointB = point;
    }
    
    public Point getPointB() {
        return this.pointB;
    }    
    
    public void setPointC(Point point) {
        this.pointC = point;
    }
    
    public Point getPointC() {
        return this.pointC;
    }
    
    public void draw(){
        System.out.println("PointA - ("+ this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
        System.out.println("PointB - ("+ this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
        System.out.println("PointC - ("+ this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
    }
}
