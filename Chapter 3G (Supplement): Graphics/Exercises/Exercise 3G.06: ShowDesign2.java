//Modify your ShowDesign class from the previous exercise into a new class ShowDesign2 that has a method named showDesign that accepts 
//parameters for the window width and height and displays the rectangles at the appropriate sizes. 

public class ShowDesign2 {
    public static void main(String[] args) {
        draw(300,100);
}
    public static void draw (int wit, int hei){
         DrawingPanel panel = new DrawingPanel(wit, hei);
        Graphics g = panel.getGraphics();
        for(int i = 1; i <=4; i++)
            g.drawRect( wit/10 * i,  hei/10 * i, wit - wit/5* i, hei - hei/5 * i);
    }
}
