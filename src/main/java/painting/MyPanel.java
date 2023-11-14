/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package painting;



import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import shapes.Shape;

/**
 *
 * @author yasmi
 */
public class MyPanel extends JPanel implements DrawingEngine{
    private ArrayList<Shape> shapes = new ArrayList<>();
     private  Shape selctedShape;
    public void MyPanel(){
      
    }
    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
       
    } 

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        repaint();
        
     }
     @Override
    public void clear() {
        for(Shape shape : getShapes()){
            removeShape(shape);
        }
    }

    @Override
    public Shape[] getShapes() {
        Shape[] arr = new Shape[shapes.size()];
        arr = shapes.toArray(arr);
        return  arr;
    }
     public void setShape(Shape shape)
    {
        this.selctedShape=shape;
    }

    @Override
    public void refresh(Graphics canvas) {
      repaint();
       
    }
    @Override
    public void paint(Graphics g){
        super.paintComponent(g); 
          Shape[] arr = getShapes(); 
         for (Shape shape : arr) { //draw shapes
            shape.draw(g);
         }
    }

   

}
