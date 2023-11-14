/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.json.simple.JSONObject;




/**
 *
 * @author yasmi
 */
public class Line extends AbstractShape{
    private Point point2 = new Point();

    public Point getPoint2() {
        return point2;
    }
    private int counter;
    public Line (int counter, Point point1, Point point2){
        super(point1);
        this.point2 = point2;
        this.counter= counter;
    }
    
    public Line(JSONObject jsonObject){
        super(new Point(Integer.parseInt(jsonObject.get("xPosition").toString()),Integer.parseInt(jsonObject.get("yPosition").toString())));
        this.counter = Integer.parseInt(jsonObject.get("id").toString());
        this.point2 =new Point(Integer.parseInt(jsonObject.get("x2Position").toString()),Integer.parseInt(jsonObject.get("y2Position").toString()));
        this.setColor(new Color(Integer.parseInt(jsonObject.get("color").toString())));
    }
  
    


    @Override
    public void draw(Graphics canvas) {
            Graphics2D g = (Graphics2D)canvas;
         g.setColor(getColor());
        Line2D.Double line = new Line2D.Double(getPosition().getX(), getPosition().getY(), getPoint2().getX(), getPoint2().getY());
         g.draw(line);

    }
       

       @Override
    public String toString(){
        
        return "line"+counter;
    }
    @Override
    public int getId(){
        return counter;
    }

    @Override
    public boolean contains(Point point) {
//        int x1 = getPosition().x;
//        int y1 = getPosition().y;
//        int x2 = point2.x;
//        int y2 = point2.y;
//        int x = point.x;
//        int y = point.y;
//        double slope = (y1 - y2)/(x1-x2);
//        double slopeToTest = (y1 - y)/(x1 - x);
//        if(slope == slopeToTest)
//            return true;
//        else 
//            return false;
        Point pStart=new Point(getPosition().x, getPosition().y);
        double lineLength=pStart.distance(this.point2);
        double lengthFromPoint=pStart.distance(point)+this.point2.distance(point);
        return Math.abs(lengthFromPoint-lineLength) <= 2;
    }

     @Override
    public void moveTo(Point point) {
       int x = point.x - getDraggingPoint().x;
       int y = point.y - getDraggingPoint().y;
       setDraggingPoint(point);
       getPosition().translate(x, y);
       getPoint2().translate(x, y);
    }

   
    @Override
    public JSONObject getShapeData() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "line");
        jsonObject.put("id", this.getId());
        jsonObject.put("xPosition", this.getPosition().x);
        jsonObject.put("yPosition", this.getPosition().y);
        jsonObject.put("x2Position", this.getPoint2().x);
        jsonObject.put("y2Position", this.getPoint2().y);
        jsonObject.put("color", this.getColor().getRGB());
        return jsonObject;
    }

  

    @Override
    public void resize(Point p, int index) {
        
        if(index == 1){
            getPosition().move(p.x, p.y);
        }
        else if(index == 2){
            getPoint2().move(p.x, p.y);
        }
    }

    @Override
    public Point[] getPoints() { //idk working or not
         return new Point[]{getPosition(),getPoint2()};
    }

    @Override
    public int resizeable(Point p) {
        Rectangle2D  r1 = new Rectangle2D.Double(getPosition().x-5, getPosition().y-5, 10, 10);
        Rectangle2D  r2 = new Rectangle2D.Double(getPoint2().x-5, getPoint2().y-5, 10, 10);
        if(r1.contains(p)){
            return 1;
        }
        else if(r2.contains(p)){
            return 2;
        }
        return 0;
    }
    
    
}
