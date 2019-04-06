/*
 *    ==========================================================================================
 *    MovingGradient: This subclass extends the MovingShape SuperClass and implements a  
 *    MovingGradient with the given parameters described below.
 *    UPI = spt909
 *    Name = Sanket Patil
 *    ==========================================================================================
 */
import java.awt.*;

public class MovingGradient extends MovingRectangle{
    /** constuctor to create a shape with default values
     */
    public MovingGradient(){
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
    public MovingGradient(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x, y, w, h, mw, mh, c, fc, pathType);
    }

    /*Creates a gradient fill shape where the fillcolour starts out at the centre of the shape 
        towards the end merges into the bordercolour
    */
    @Override
    public void draw(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        GradientPaint G2D = new GradientPaint((float) (topLeft.x + Math.sqrt(width * 110)), (float)(topLeft.y + Math.sqrt(height * 125)), fillColor, topLeft.x + width, 
                                            topLeft.y + height, borderColor, true);
        g2D.setPaint(G2D);
        g2D.fillRect(topLeft.x, topLeft.y, width, height);
        drawHandles(g2D);
    }
}