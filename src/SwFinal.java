import javax.swing.*;
import java.awt.*;

public class SwFinal {

    public static void addComponentsToPane(Container pane) {

        MyComponent com = new MyComponent();

        pane.add(com);
        Insets insets = pane.getInsets();
        com.setBounds(1 + insets.left, 1 + insets.top,
                600,600);
    }
    // создание контейнера frame, запуск addComponentsToPane, задание заголовка,размера и видимости окна
    public static void main(String[] argv) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.setTitle("Value of computer details");
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}