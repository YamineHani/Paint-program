/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import org.json.simple.JSONObject;

/**
 *
 * @author yasmi
 */
public class Triangle extends AbstractShape{
    private Point point2 = new Point();

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
    private Point point3 = new Point();
    private int counter;

    public Triangle(int counter,Point p1,Point p2,Point p3) {
        super(p1);
        point2 = p2;
        point3= p3;
        this.counter = counter;
    }
    public Triangle(JSONObject jsonObject){
        super(new Point(Integer.parseInt(jsonObject.get("xPosition").toString()),Integer.parseInt(jsonObject.get("yPosition").toString())));
        this.counter = Integer.parseInt(jsonObject.get("id").toString());
        this.point2 =new Point(Integer.parseInt(jsonObject.get("x2Position").toString()),Integer.parseInt(jsonObject.get("y2Position").toString()));
        this.point3 =new Point(Integer.parseInt(jsonObject.get("x3Position").toString()),Integer.parseInt(jsonObject.get("y3Position").toString()));
        this.setColor(new Color(Integer.parseInt(jsonObject.get("color").toString())));
        this.setFillColor(new Color(Integer.parseInt(jsonObject.get("fillColor").toString())));
    }
  

    @Override
    public void draw(Graphics canvas) {
        Polygon p = new Polygon(new int[]{getPosition().x,point2.x,point3.x},
                new int[]{getPosition().y,point2.y,point3.y} , 3);
        canvas.drawPolygon(p);
         if(this.getFillColor() != null){
             canvas.setColor(getFillColor());
             canvas.fillPolygon(p);
             
         }
    }
    
    
    @Override
    public String toString(){
        return "triangle"+counter;
    }
    @Override
    public int getId(){
        return counter;
    }
    double area(int x1, int y1, int x2, int y2, int x3, int y3){
          return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

    @Override
    public boolean contains(Point point) {
        int x1 = getPosition().x;
        int y1 = getPosition().y;
        int x2 = point2.x;
        int y2 = point2.y;
        int x3 = point3.x;
        int y3 = point3.y;
        int x = point.x;
        int y = point.y;
        double area = area(x1, y1, x2, y2, x3, y3);
        double area1 = area(x1, y1, x2, y2, x, y);
        double area2 = area(x, y, x2, y2, x3, y3);
        double area3 = area(x1, y1, x, y, x3, y3);
        if(area ==( area1 + area2 + area3))
            return true;
        else 
            return false;      
    }

      @Override
    public void moveTo(Point point) {
       int x = point.x - getDraggingPoint().x;
       int y = point.y - getDraggingPoint().y;
       setDraggingPoint(point);
       getPosition().translate(x, y);
       getPoint2().translate(x, y);
       getPoint3().translate(x, y);
    }

     @Override
    public JSONObject getShapeData() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "triangle");
        jsonObject.put("id", this.getId());
        jsonObject.put("xPosition", this.getPosition().x);
        jsonObject.put("yPosition", this.getPosition().y);
        jsonObject.put("x2Position", this.getPoint2().x);
        jsonObject.put("y2Position", this.getPoint2().y);
        jsonObject.put("x3Position", this.getPoint3().x);
        jsonObject.put("y3Position", this.getPoint3().y);
        jsonObject.put("color", this.getColor().getRGB());
        jsonObject.put("fillColor", this.getFillColor().getRGB());
        return jsonObject;
    }

  

    @Override
    public void resize(Point p, int index) {
        switch (index) {
            case 1 -> getPosition().move(p.x, p.y);
            case 2 -> getPoint2().move(p.x, p.y);
            case 3 -> getPoint3().move(p.x, p.y);
            default -> {
            }
        }
    }

    @Override
    public Point[] getPoints() {
         return new Point[]{getPosition(),getPoint2(), getPoint3()};
    }

    @Override
    public int resizeable(Point p) {
        Rectangle2D  r1 = new Rectangle2D.Double(getPosition().x-5, getPosition().y-5, 10, 10);
        Rectangle2D  r2 = new Rectangle2D.Double(getPoint2().x-5, getPoint2().y-5, 10, 10);
        Rectangle2D  r3 = new Rectangle2D.Double(getPoint3().x-5, getPoint3().y-5, 10, 10);
        if(r1.contains(p)){
            return 1;
        }
        else if(r2.contains(p)){
            return 2;
        }
        else if(r3.contains(p)){
            return 3;
        }
        return 0;
    }

}
