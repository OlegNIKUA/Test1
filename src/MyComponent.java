import javax.swing.*;
import java.awt.*;

class MyComponent extends JComponent {
    Slice[] slices = { new Slice(10, Color.black), new Slice(30, Color.green),
            new Slice(10, Color.yellow), new Slice(20, Color.blue),new Slice(30, Color.red) };
    MyComponent() {}
    // прорисовка елементов
    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
        g.setColor( Color.red );
        g.drawString("CPU 30%", 420, 100);
        g.setColor( Color.green );
        g.drawString("Mother board 30%", 420, 120);
        g.setColor( Color.yellow );
        g.drawString("RAM 10%", 420, 140);
        g.setColor( Color.blue );
        g.drawString("HDD 20%", 420, 160);
        g.setColor( Color.black );
        g.drawString("Case 10%", 420, 180);
    }
    // прорисовка долек диаграммы
    void drawPie(Graphics2D g, Rectangle area, Slice[] slices) {
        double total = 0.0D;
        for (int i = 0; i < slices.length; i++) {
            total += slices[i].value;
        }
        double curValue = 0.0D;
        int startAngle = 0;

        for (int i = 0; i < slices.length-1; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (slices[i].value * 360 / total);
            g.setColor(slices[i].color);
            g.fillArc(area.x, area.y, 400, 400,
                    startAngle, arcAngle);
            curValue += slices[i].value;
        }
        g.setColor(slices[4].color);
        g.fillArc(area.x+10 , area.y+10 , 400, 400,
                253, 107);
    }

} 