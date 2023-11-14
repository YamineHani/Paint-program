/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shapes;

import java.awt.Point;


/**
 *
 * @author yasmi
 */
public interface Resizeable {
    public void resize(Point p, int index);
   //  public Rectangle2D[] setResizeableRectangle();    
    public Point[] getPoints();
    public int resizeable(Point p);
    
}
