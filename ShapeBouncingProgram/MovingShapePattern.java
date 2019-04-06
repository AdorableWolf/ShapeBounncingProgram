import java.awt.*;

public class MovingShapePattern extends MovingOval{

    public MovingShapePattern(){
        super();
    }

    public MovingShapePattern(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x, y, w, h, mw, mh, c, fc, pathType);  
    }

    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(topLeft.x, topLeft.y, width, height);
        
        g2d.setPaint(borderColor);
        g2d.fillArc(topLeft.x, topLeft.y, width, height, 0, 180);
        g2d.setPaint(fillColor);
        g2d.fillArc(topLeft.x, topLeft.y, width, height, 0, -180);

        g2d.setPaint(fillColor);
        g2d.fillArc(topLeft.x + width/2, topLeft.y + height/4, width/2, height/2, 0, 180);
        g2d.setPaint(borderColor);
        g2d.fillArc(topLeft.x, topLeft.y + height/4, width/2, height/2, 0, -180);

        g2d.setPaint(fillColor);
        g2d.fillOval(topLeft.x + width/8, topLeft.y + height/3, width/4, height/4);
        int halfx = topLeft.x + width/2;
        g2d.setPaint(borderColor);
        g2d.fillOval(halfx + width/8, topLeft.y + height/3, width/4, height/4);
        drawHandles(g2d);
    }  
}