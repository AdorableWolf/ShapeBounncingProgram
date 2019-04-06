/*
 *    ==========================================================================================
 *    MovingOval: This subclass extends the MovingShape SuperClass and implements a  
 *    MovingOval with the given parameters described below.
 *    UPI = spt909
 *    Name = Sanket Patil
 *    ==========================================================================================
 */

import java.awt.*;

public class MovingOval extends MovingShape{

    /** constuctor to create a shape with default values
     */
    public MovingOval(){
        super();
    }

    /** constuctor to create a shape
     * @param x         the x-coordinate of the new shape
     * @param y        the y-coordinate of the new shape
     * @param w         the width of the new shape
     * @param h         the height of the new shape
     * @param mw         the margin width of the animation panel
     * @param mh        the margin height of the animation panel
     * @param c        the colour of the new shape
     * @param typeOfPath         the path of the new shape
     */
    public MovingOval(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x, y, w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g){
        Graphics2D o2D = (Graphics2D) g;
        o2D.setPaint(fillColor);
        o2D.fillOval(topLeft.x, topLeft.y, width, height);
        o2D.setPaint(borderColor);
        o2D.setStroke(new BasicStroke(2f));
        o2D.drawOval(topLeft.x, topLeft.y, width, height);
        drawHandles(g);
    }

    @Override
    public boolean contains(Point p){
        Point EndPt = new Point(topLeft.x + width, topLeft.y + height); 
        double dx = (2 * p.x - topLeft.x - EndPt.x) / (double) width; 
        double dy = (2 * p.y - topLeft.y - EndPt.y) / (double) height; 
        return dx * dx + dy * dy < 1.0;
    }
}