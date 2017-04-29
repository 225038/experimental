/**
 * Created by саша on 24.04.2017.
 */
import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image img;

    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(950, 800);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(new Dimension(1200, 1200));
        setSize(size);
        setLayout(null);
    }

    public void setSize(JFrame frame){
        setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
