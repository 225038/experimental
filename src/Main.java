import javafx.scene.layout.Border;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by саша on 24.04.2017.
 */
public class Main {

    public Main() {
        initComponents();
    }

    private JFrame viewForm;

    private void initComponents() {
        viewForm = new JFrame("Laba6");
        Dimension size = new Dimension(950, 800);
        viewForm.setSize(size);
        viewForm.setMaximumSize(size);
        viewForm.setVisible(true);
        viewForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImagePanel panel = new ImagePanel(new ImageIcon("C:\\Users\\саша\\Desktop\\1.jpg").getImage());

        viewForm.getContentPane().add(panel);
        viewForm.pack();

        JButton button = new JButton("Click me!");
        button.setBackground(new Color(112, 112,112));
        button.setBorder(BorderFactory.createBevelBorder(0, new Color(78, 78, 78), Color.darkGray));
        button.setFocusPainted(false); //Убираются границы вокруг текста на кнопке
        button.setVisible(true);
        button.setLocation(12, 12);
        button.setSize(165, 50);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) { // Выскакивает предупреждающее сообщение
                JOptionPane.showMessageDialog(viewForm, "Don't touch me!",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }

        });

        viewForm.getContentPane().add(button);
        viewForm.getContentPane().add(new JLabel());
    }

//    public void actionPerformed(ActionEvent action) {
//    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

}
