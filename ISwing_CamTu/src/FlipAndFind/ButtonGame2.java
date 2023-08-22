package FlipAndFind;

import javax.swing.*;
import java.awt.*;

public class ButtonGame2 extends JButton {
    private int valid;
    private ImageIcon icon;
    private ImageIcon background;
    private ImageIcon nullIcon;
    private int X = 900;
    private int Y = 450;

    public ButtonGame2(int valid, ImageIcon imageIcon) {
        this.valid = valid;
        this.icon = imageIcon;
        background = new ImageIcon(".//src//image//open.png");
        nullIcon = new ImageIcon(".//src//image//bingo.png");
        Image i = (icon.getImage().getScaledInstance(X / 6, Y/ 4, Image.SCALE_SMOOTH));
        Image i2 = (background.getImage().getScaledInstance(X/ 6, Y / 4, Image.SCALE_SMOOTH));
        Image i3 = (nullIcon.getImage().getScaledInstance(X / 6, Y/ 4, Image.SCALE_SMOOTH));
        icon = new ImageIcon(i);
        background = new ImageIcon(i2);
        nullIcon = new ImageIcon(i3);
        setIcon(background);
    }

    public void open() {
        setIcon(icon);
    }

    public void close() {
        setIcon(background);
    }

    public void True() {
        valid = -1;
        setIcon(nullIcon);
    }

    public int getValid() {
        return valid;
    }
}
