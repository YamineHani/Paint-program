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
public class Circle extends AbstractShape {
    private int radiusVertical;
    private int radiusHorizontal;
    private int counter;

    public int getRadiusVertical() {
        return radiusVertical;
    }

    public int getRadiusHorizontal() {
        return radiusHorizontal;
    }
    
    public Circle (int counter, int radiusVertival,int radiusHorizontal, Point p){
        super(p);
        this.counter= counter;
        this.radiusVertical = radiusVertival;
        this.radiusHorizontal = radiusHorizontal;
    }
    public Circle(JSONObject jsonObject){
        super(new Point(Integer.parseInt(jsonObject.get("xPosition").toString()),Integer.parseInt(jsonObject.get("yPosition").toString())));
        this.counter = Integer.parseInt(jsonObject.get("id").toString());
        this.radiusHorizontal =Integer.parseInt(jsonObject.get("horizontalR").toString()) ; 
        this.radiusVertical =Integer.parseInt(jsonObject.get("verticalR").toString()) ;
        this.setColor(new Color(Integer.parseInt(jsonObject.get("color").toString())));
        this.setFillColor(new Color(Integer.parseInt(jsonObject.get("fillColor").toString())));
    }
  
  
  
    @Override
    public void draw(Graphics g) {
          g.setColor(getColor());
          //g.drawOval(getPosition().x , getPosition().y ,
           //       2*radiusHorizontal, 2*radiusVertical);
          g.drawOval(getMin().x, getMin().y,  getMax().x - getMin().x, getMax().y - getMin().y);
        
         if(this.getFillColor() != null){
             g.setColor(getFillColor());
             //g.fillOval(getPosition().x, getPosition().y, 2*radiusHorizontal, 2*radiusVertical);
             g.fillOval(getMin().x, getMin().y,  getMax().x - getMin().x, getMax().y - getMin().y);
             
         } 

    }   

    @Override
    public String toString(){
        return "oval"+counter;
    }
    @Override
    public int getId(){
        return counter;
    }
    @Override
    public boolean contains(Point point) {
//        Point center=new Point();
//        center.x=getPosition().x+radiusHorizontal;
//        center.y=getPosition().y+radiusVertical;
//        double p = (Math.pow((point.x - center.x), 2) / Math.pow(radiusHorizontal, 2))+
//                (Math.pow((point.y - center.y), 2) / Math.pow(radiusVertical, 2));
//   if ( p <= 1){
//      return true;
//   }
//   else
//      return false;
//        int x1 = getPosition().x;
//        int y1 = getPosition().y ;
//        int x2 = getPosition().x + 2*radiusHorizontal;
//        int y2 = getPosition().y + 2*radiusVertical;
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

    @Override
    public void moveTo(Point point) {
       int x = point.x - getDraggingPoint().x;
       int y = point.y - getDraggingPoint().y;
       setDraggingPoint(point);
       getPosition().translate(x, y);
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
    public JSONObject getShapeData() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "oval");
        jsonObject.put("id", this.getId());
        jsonObject.put("xPosition", this.getPosition().x);
        jsonObject.put("yPosition", this.getPosition().y);
        jsonObject.put("verticalR", this.getRadiusVertical());
        jsonObject.put("horizontalR", this.getRadiusHorizontal());
        jsonObject.put("color", this.getColor().getRGB());
        jsonObject.put("fillColor", this.getFillColor().getRGB());
        return jsonObject;
    }

     @Override
    public void resize(Point p, int index) {
         Point[] points=getPoints();
        int dx= p.x - getDraggingPoint().x;
        int dy= p.y - getDraggingPoint().y;
        
        if(index == 1){
            
            radiusHorizontal = (radiusHorizontal - dx);
            radiusVertical = (radiusVertical - dy);
            points[0].translate(dx, dy);
            points[1].translate(0, dy);
            points[2].translate(dx, 0);
            points[3].translate(0, 0);
        }
        else if(index == 2){
            
            radiusHorizontal = (radiusHorizontal + dx);
            radiusVertical = (radiusVertical - dy);
            points[0].translate(0, dy);
            points[1].translate(dx, dy);
            points[2].translate(0, 0);
            points[3].translate(dx, 0);
        }
        else if(index == 3){
            
           radiusHorizontal = (radiusHorizontal - dx);
           radiusVertical = (radiusVertical + dy);
            points[0].translate(dx, 0);
            points[1].translate(0, 0);
            points[2].translate(dx, dy);
            points[3].translate(0, dy);
            
        }
        else if(index == 4){

            radiusHorizontal = (radiusHorizontal + dx);
            radiusVertical = (radiusVertical + dy);
            points[0].translate(0, 0);
            points[1].translate(dx, 0);
            points[2].translate(0, dy);
            points[3].translate(dx, dy);
            
        }
        setDraggingPoint(p);
    }
    @Override
     public Point[] getPoints() {
        return new Point[]{getPosition(),                                            //top left
                new Point(getPosition().x+(radiusHorizontal*2),getPosition().y),     // top right
                new Point(getPosition().x,getPosition().y+(radiusVertical*2)),        //bottom left
                new Point(getPosition().x+(radiusHorizontal*2),getPosition().y+(radiusVertical*2)) // bottom right
        };
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
