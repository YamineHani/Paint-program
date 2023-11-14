/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.awt.Color;
import java.awt.Point;


/**
 *
 * @author yasmi
 */
public abstract  class AbstractShape implements Shape, Moveable{
    private Point position ;
    private Color color = Color.BLACK;
    private Color fillColor = Color.BLACK;
    private Point draggingPoint; //null??
    
    public AbstractShape(Point p){
        position = p;
    }
    
    
    @Override
    public void setPosition(Point position) {
         this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }


    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }
    
    @Override
    public void setDraggingPoint(Point point){
        this.draggingPoint = point;
    }
    @Override
    public Point getDraggingPoint(){ //return null??
        return draggingPoint;
    }

    
    
    
      
}
