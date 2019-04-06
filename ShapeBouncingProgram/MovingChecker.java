/*
 *    ==========================================================================================
 *    MovingChecker Subclass: This subclass extends the MoviingShape class provided with the 
 *    draw method overidden. 
 *    UPI = spt909
 *    Name = Sanket Patil
 *    ==========================================================================================
 */
import java.awt.*;
import java.util.*;

public class MovingChecker extends MovingRectangle{
    int horizontalSquares, verticalSquares;

    /** constuctor to create a shape with default values
     */
    public MovingChecker(){
        super();
        horizontalSquares = generateRandom();
        verticalSquares = generateRandom();
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
    public MovingChecker(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x, y, w, h, mw, mh, c, fc, pathType);
        horizontalSquares = generateRandom();
        verticalSquares = generateRandom();
    }

    @Override
    public void draw(Graphics g){
        Graphics2D c2D = (Graphics2D) g;
        int rowSize = width/horizontalSquares;
        int colSize = height/verticalSquares;
        int tempY = topLeft.y;
        boolean firstInRowFilled = true;
        for(int i = 0; i < verticalSquares; i++){
            int tempX = topLeft.x;
            boolean isFilled = firstInRowFilled;
            for(int x = 0; x < horizontalSquares; x++){
                if(isFilled){
                    c2D.setPaint(fillColor);
                    c2D.fillRect(tempX, tempY, rowSize, colSize);
                }
                else{
                    c2D.setPaint(borderColor);
                    c2D.fillRect(tempX, tempY, rowSize, colSize);
                }
                tempX += rowSize;
                isFilled = !isFilled;
            }
            tempY += colSize;
            firstInRowFilled = !firstInRowFilled;
        }
        drawHandles(g);
    }

    //Generates a random number that determines the number of horizontal and vertical squares for
    //the checker pattern.
    private static int generateRandom(){
        Random r = new Random();
        int low = 2;
        int high = 8;
        int result = r.nextInt(high - low) + low;
        return result;
    }
}