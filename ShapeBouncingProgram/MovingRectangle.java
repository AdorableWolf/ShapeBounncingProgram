/*
 *    ==========================================================================================
 *    MovingRectangle: This subclass extends the MovingShape SuperClass and implements a  
 *    MovingRectangle with the given parameters described below.
 *    UPI = spt909
 *    Name = Sanket Patil.  
 *    ==========================================================================================
 */

import java.awt.*;

public class MovingRectangle extends MovingShape{

    /** constuctor to create a shape with default values
     */
    public MovingRectangle(){
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
    public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x, y, w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g){
        Graphics2D r2D = (Graphics2D) g;
        r2D.setPaint(fillColor);
        r2D.fillRect(topLeft.x, topLeft.y, width, height);
        r2D.setPaint(borderColor);
        r2D.setStroke(new BasicStroke(2f));
        r2D.drawRect(topLeft.x, topLeft.y, width, height);
        drawHandles(r2D);
    }

    @Override
    public boolean contains(Point p){
        return ((p.x > topLeft.x && p.x < (topLeft.x + width)) && (p.y > topLeft.y && p.y < (topLeft.y + height)));
    }
}