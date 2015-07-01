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
    private String type;
    private int height;
    
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }    
    
    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }    
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return this.height;
    }    
    
    public void draw(){
        System.out.println(this.getType() + " Triangle Drawn of height: " + this.getHeight());
    }
}
