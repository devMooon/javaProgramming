package swing.hw.customGraphicsEx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class 수연 extends JFrame {
   public 수연() {
      super("Paint Ex");
      this.setSize(300, 300);

      buildGUI();

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);

   }

   private void buildGUI() {
      PaintCanvas canvas = new PaintCanvas();
      this.add(canvas);
   }

   private class PaintCanvas extends JComponent {
      static final int width = 50;
      static final int height = 50;

      ArrayList<Point> pointList = new ArrayList<Point>();
      
      int dragId = -1;

      PaintCanvas() {
         registerEventListener();
      }

      private void registerEventListener() {
         addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) { // 마우스를 클릭할 때
               Point point = e.getPoint();
               pointList.add(point);

               repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) { // 마우스를 누르고 있는 상태
               Iterator<Point> it; 
               it = pointList.iterator();
               
               while(it.hasNext()) {
                  Point p = it.next();
                  if(p.x - (width / 2) < e.getX() && p.x + (width / 2) > e.getX()
                        && p.y - (height / 2) < e.getY() && p.y + (height / 2) > e.getY()) { 
                     dragId = pointList.indexOf(p);
                  }
                  
               }
            }

            @Override
            public void mouseReleased(MouseEvent e) { // 마우스를 뗐을 때
               dragId = -1;
            }

         });

         addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
               if (dragId != -1) {
                  pointList.get(dragId).x = e.getX();
                  pointList.get(dragId).y = e.getY();
                  
                  repaint();
               }
               
               
            }

         });
      }

      @Override
      public void paint(Graphics g) {
         Iterator<Point> it;
         g.setColor(Color.red);
         it = pointList.iterator();
         while (it.hasNext()) {
            Point p = it.next();
            g.fillOval(p.x - (width/2), p.y - (height/2), width, height);
         }

      }

   }
}