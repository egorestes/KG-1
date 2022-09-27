import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HungryCat {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private BufferedImage image;

    public HungryCat(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    void loadImage() {
        String path = "res/heart.png";
        File file = new File(path);
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //tail
        g.setColor(this.color);
        g.fillOval((int) (this.x + 0.08 * this.width), (int) (this.y + 0.05 * this.height), (int) (0.5 * this.width), (int) (0.1 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 0.08 * this.width), (int) (this.y + 0.05 * this.height), (int) (0.5 * this.width), (int) (0.1 * this.height));

        //neck
        g.setColor(this.color);
        g.fillOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.1 * this.height), (int) (0.12 * this.width), (int) (0.35 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.1 * this.height), (int) (0.12 * this.width), (int) (0.35 * this.height));

        //body
        g.setColor(this.color);
        g.fillOval((int) (this.x + 0.5 * this.width), (int) (this.y + 0.05 * this.height), (int) (0.7 * this.width), (int) (0.25 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 0.5 * this.width), (int) (this.y + 0.05 * this.height), (int) (0.7 * this.width), (int) (0.25 * this.height));

        //legs
        g.setColor(this.color);
        g.fillOval((int) (this.x + 0.52 * this.width), (int) (this.y + 0.2 * this.height), (int) (0.1 * this.width), (int) (0.2 * this.height));
        g.fillOval((int) (this.x + 1.08 * this.width), (int) (this.y + 0.2 * this.height), (int) (0.1 * this.width), (int) (0.2 * this.height));
        g.fillOval((int) (this.x + 0.54 * this.width), (int) (this.y + 0.4 * this.height), (int) (0.1 * this.width), (int) (0.05 * this.height));
        g.fillOval((int) (this.x + 1.1 * this.width), (int) (this.y + 0.4 * this.height), (int) (0.1 * this.width), (int) (0.05 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 0.52 * this.width), (int) (this.y + 0.2 * this.height), (int) (0.1 * this.width), (int) (0.2 * this.height));
        g.drawOval((int) (this.x + 1.08 * this.width), (int) (this.y + 0.2 * this.height), (int) (0.1 * this.width), (int) (0.2 * this.height));
        g.drawOval((int) (this.x + 0.54 * this.width), (int) (this.y + 0.4 * this.height), (int) (0.1 * this.width), (int) (0.05 * this.height));
        g.drawOval((int) (this.x + 1.1 * this.width), (int) (this.y + 0.4 * this.height), (int) (0.1 * this.width), (int) (0.05 * this.height));

        //head
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.2 * this.height), (int) (0.18 * this.height), (int) (0.15 * this.height));
        g.drawOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.22 * this.height), (int) (0.11 * this.height));
        g.fillOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.05 * this.height), (int) (0.035 * this.height));
        g.setColor(this.color);
        g.fillOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.2 * this.height), (int) (0.18 * this.height), (int) (0.15 * this.height));
        g.fillOval((int) (this.x + 1.08 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.22 * this.height), (int) (0.11 * this.height));

        //ear
        g.setColor(this.color);
        g.fillOval((int) (this.x + 1.1 * this.width), (int) (this.y - 0.25 * this.height), (int) (0.1 * this.height), (int) (0.25 * this.height));

        //face
        //nose
        g.setColor(Color.PINK);
        g.fillOval((int) (this.x + 1.33 * this.width), (int) (this.y - 0.12 * this.height), (int) (0.02 * this.height), (int) (0.02 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 1.33 * this.width), (int) (this.y - 0.12 * this.height), (int) (0.02 * this.height), (int) (0.02 * this.height));

        //eyes
        g.setColor(Color.GREEN);
        g.fillOval((int) (this.x + 1.2 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.05 * this.height), (int) (0.035 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int) (this.x + 1.2 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.05 * this.height), (int) (0.035 * this.height));
        g.fillOval((int) (this.x + 1.22 * this.width), (int) (this.y - 0.15 * this.height), (int) (0.02 * this.height), (int) (0.035 * this.height));

        //mouth
        g.fillOval((int) (this.x + 1.31 * this.width), (int) (this.y - 0.08 * this.height), (int) (0.03 * this.height), (int) (0.01 * this.height));

        //mustache
        g.drawLine((int) (this.x + 1.3 * this.width), (int) (this.y - 0.11 * this.height), (int) (this.x + 1.25 * this.width), (int) (this.y - 0.06 * this.height));
        g.drawLine((int) (this.x + 1.3 * this.width), (int) (this.y - 0.11 * this.height), (int) (this.x + 1.26 * this.width), (int) (this.y - 0.06 * this.height));
        g.drawLine((int) (this.x + 1.305 * this.width), (int) (this.y - 0.11 * this.height), (int) (this.x + 1.28 * this.width), (int) (this.y - 0.065 * this.height));
        g.drawLine((int) (this.x + 1.31 * this.width), (int) (this.y - 0.111 * this.height), (int) (this.x + 1.29 * this.width), (int) (this.y - 0.063 * this.height));
        g.drawLine((int) (this.x + 1.315 * this.width), (int) (this.y - 0.111 * this.height), (int) (this.x + 1.29 * this.width), (int) (this.y - 0.064 * this.height));
        g.drawLine((int) (this.x + 1.32 * this.width), (int) (this.y - 0.111 * this.height), (int) (this.x + 1.29 * this.width), (int) (this.y - 0.065 * this.height));
    }

    void drawHeart(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        loadImage();
        g.drawImage(image, 700, 300, 200, 150, null);
    }
}