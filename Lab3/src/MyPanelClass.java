import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.black);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                      //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        // draws an inside border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1 + 1, y1+1, width-2, height-2);
//                        
//                        // draws line
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.CYAN);
//                        g.drawLine(x2, y1, x1, y2);
                        
                        // draws an oval
                       // g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval((int)(width -55)/2, (int)(height-55)/2, 55, 55);
                        
//                       Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                    
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        
                        
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
//                        
                        
                        // draws a rectangle
                        g.setColor(Color.red);
                        g.fillRect(x1 + 10, y1 + 11, width ,30 );
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+41, width, 30);
                        
                        g.setColor(Color.red);
                        g.fillRect(x1 + 10, y1+71, width, 30);
                        
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+101, width, 30);
                        
                        g.setColor(Color.red);
                        g.fillRect(x1 + 10, y1+131, width, 30);
                        
                       // draws triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 10, y1 + 10);
                        p.addPoint(x1 + 10, y1 + 161);
                        p.addPoint(x1 + 90, y1 + 85);
                    
                        g.setColor(Color.blue);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 20, y1 + 73);
                        p2.addPoint(x1 + 36, y1 + 73);
                        p2.addPoint(x1 + 42, y1 + 58);
                        p2.addPoint(x1 + 47, y1 + 73);
                        p2.addPoint(x1 + 64, y1 + 73);
                        p2.addPoint(x1 + 51, y1 + 83);
                        p2.addPoint(x1 + 56, y1 + 98);
                        p2.addPoint(x1 + 42, y1 + 88);
                        p2.addPoint(x1 + 29, y1 + 98);
                        p2.addPoint(x1 + 33, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
            }
}