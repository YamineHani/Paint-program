/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import org.json.simple.JSONObject;



/**
 *
 * @author yasmi
 */
public class Rectangle  extends AbstractShape{
    private int width;
    private int height;
    private int counter;
//    private Point point2;
//    private Point point3;
//    private Point point4;
    public Rectangle (int counter, int width, int height, Point p){
        super(p);
        this.counter= counter;
        this.width = width;
        this.height = height;
//        this.point2 = new Point(getPosition().x+width,getPosition().y);
//        this.point3 = new Point(getPosition().x,getPosition().y+height);
//        this.point4 = new Point(p.x + width, p.y + height); //new
    }
    public Rectangle(JSONObject jsonObject){
        super(new Point(Integer.parseInt(jsonObject.get("xPosition").toString()),Integer.parseInt(jsonObject.get("yPosition").toString())));
        this.counter = Integer.parseInt(jsonObject.get("id").toString());
        this.width =Integer.parseInt(jsonObject.get("width").toString()) ; 
        this.height =Integer.parseInt(jsonObject.get("height").toString()) ;
        this.setColor(new Color(Integer.parseInt(jsonObject.get("color").toString())));
        this.setFillColor(new Color(Integer.parseInt(jsonObject.get("fillColor").toString())));
    }
      public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    @Override
    public void draw(Graphics g) {
         
         g.setColor(getColor());
        // g.drawRect(getPosition().x, getPosition().y, width, height);
       g.drawRect(getMin().x, getMin().y,  getMax().x - getMin().x, getMax().y - getMin().y);
            if(this.getFillColor() != null){
             g.setColor(getFillColor());
         // g.fillRect(getPosition().x, getPosition().y, width, height);
           g.fillRect(getMin().x, getMin().y,  getMax().x - getMin().x, getMax().y - getMin().y);

    }
    }

         @Override
    public String toString(){
        if (width == height)
            return "square"+counter;
        else
         return "rectangle"+counter;
    }
    @Override
    public int getId(){
        return counter;
    }

    @Override
    public boolean contains(Point point) {
//        int x1 = getPosition().x;
//        int y1 = getPosition().y ;
//        int x2 = getPosition().x + width;
//        int y2 = getPosition().y + height;
//        int x = point.x;
//        int y = point.y;
//        if(x > x1 && x < x2 && y > y1 && y < y2)
//            return true;
//        else
//            return false;
        int x1 = getMin().x;
        int y1 = getMin().y ;
        int x2 = getMax().x;
        int y2 = getMax().y;
        int x = point.x;
        int y = point.y;
        if(x > x1 && x < x2 && y > y1 && y < y2)
            return true;
        else
            return false;
        
    }
    public Point getMin(){
        Double[] distances = {getPoints()[0].distance(0, 0) ,
            getPoints()[1].distance(0, 0) ,
            getPoints()[2].distance(0, 0), 
            getPoints()[3].distance(0, 0) };
        Arrays.sort(distances);
        if(distances[0].equals(getPoints()[0].distance(0,0)))
            return getPoints()[0];
        else if(distances[0].equals(getPoints()[1].distance(0,0)))
            return getPoints()[1];
        else if(distances[0].equals(getPoints()[2].distance(0,0)))
            return getPoints()[2];
        else{
            return getPoints()[3];
        }
    }
      public Point getMax(){
         Double[] distances = {getPoints()[0].distance(0, 0) 
                 ,getPoints()[1].distance(0, 0) ,
                 getPoints()[2].distance(0, 0)
                 , getPoints()[3].distance(0, 0) };
        Arrays.sort(distances);
        if(distances[3].equals(getPoints()[0].distance(0,0)))
            return getPoints()[0];
        else if(distances[3].equals(getPoints()[1].distance(0,0)))
            return getPoints()[1];
        else if(distances[3].equals(getPoints()[2].distance(0,0)))
            return getPoints()[2];
        else{
            return getPoints()[3];
        }
    }

    @Override
    public void moveTo(Point point) {
       int x = point.x - getDraggingPoint().x;
       int y = point.y - getDraggingPoint().y;
       setDraggingPoint(point);
       getPosition().translate(x, y);
      // getMin().translate(x, y);
    }

    @Override
    public JSONObject getShapeData() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "rectangle");
        jsonObject.put("id", this.getId());
        jsonObject.put("xPosition", this.getPosition().x);
        jsonObject.put("yPosition", this.getPosition().y);
        jsonObject.put("width", this.getWidth());
        jsonObject.put("height", this.getHeight());
        jsonObject.put("color", this.getColor().getRGB());
        jsonObject.put("fillColor", this.getFillColor().getRGB());
        return jsonObject;
    }

   
//   @Override
//    public Point[] getPoints() {
//        return new Point[]{getPosition(),                               //top left
//                point2,     // top right
//                point3,     // bottom left
//                point4  // bottom right
//        };
//    }

    @Override
    public Point[] getPoints() {
        return new Point[]{getPosition(),                               //top left
                new Point(getPosition().x+width,getPosition().y),       // top right
                new Point(getPosition().x,getPosition().y+height),        //bottom left
                new Point(getPosition().x+width,getPosition().y+height) //bottom right
        };
    }

    @Override
    public void resize(Point p, int index) {
        // 1 top left
          // 2 top right
          // 3 bottom left
          // 4 bottom right
        Point[] points=getPoints();
        int dx= p.x - getDraggingPoint().x;
        int dy= p.y - getDraggingPoint().y;
        
        if(index == 1){
            width = width - dx;
            height = height - dy;
            //this.getPosition().translate(dx, dy);
            points[0].translate(dx, dy);
            points[1].translate(0, dy);
            points[2].translate(dx, 0);
            points[3].translate(0, 0);
           // this.setPosition(getMin());
        }
        else if(index == 2){
            width = width + dx;
            height = height - dy;
            //this.getPosition().translate(0, dy);
            points[0].translate(0, dy);
            points[1].translate(dx, dy);
            points[2].translate(0, 0);
            points[3].translate(dx, 0);
        }
        else if(index == 3){
            width = width - dx;
            height = height + dy;
           // this.getPosition().translate(dx, 0);
            points[0].translate(dx, 0);
            points[1].translate(0, 0);
            points[2].translate(dx, dy);
            points[3].translate(0, dy);
            
        }
        else if(index == 4){
            //this.setPosition(getMin());
            width = width + dx;
            height = height + dy;
            //this.getPosition().translate(0, 0);
            points[0].translate(0, 0);
            points[1].translate(dx, 0);
            points[2].translate(0, dy);
            points[3].translate(dx, dy);
            
        }
        setDraggingPoint(p);
          
          /////////////////////////////////////////////
//          if(index == 1){ //kolo ela 4
//              dx= points[0].x - p.x;
//              dy= points[0].y - p.y;
//              getPosition().translate(dx, dy);
//              point2.translate(0, dy);
//              point3.translate(dx, 0);
//
//          }
//          else if(index == 2){ //kolo ela 3
//              dx= points[1].x - p.x;
//              dy= points[1].y - p.y;
//              getPosition().translate(0, dy);
//              point2.translate(dx, dy);
//              point4.translate(dx, 0);
//
//          }
//           else if(index == 3){ //kolo ela 2
//              dx= points[2].x - p.x;
//              dy= points[2].y - p.y;
//              getPosition().translate(dx, 0);
//              point3.translate(dx, dy);
//              point4.translate(0, dy);
//
//          }
//           else if (index == 4){ //kolo ela 1
//              dx= points[3].x - p.x;
//              dy= points[3].y - p.y;
//              point2.translate(dx, 0);
//              point3.translate(0, dy);
//              point4.translate(dx, dy);
//
//           }
    }

    @Override
    public int resizeable(Point p) {
        Point[] points = getPoints();
        Rectangle2D  r1 = new Rectangle2D.Double(getPosition().x-5, getPosition().y-5, 10, 10);
        Rectangle2D  r2 = new Rectangle2D.Double(points[1].x-5, points[1].y-5, 10, 10);
        Rectangle2D  r3 = new Rectangle2D.Double(points[2].x-5, points[2].y-5, 10, 10);
        Rectangle2D  r4 = new Rectangle2D.Double(points[3].x-5, points[3].y-5, 10, 10);
        if(r1.contains(p)){
            return 1;
        }
        else if(r2.contains(p)){
            return 2;
        }
        else if(r3.contains(p)){
            return 3;
        }
        else if(r4.contains(p)){
            return 4;
        }
        return 0;
    }

  
    
}
