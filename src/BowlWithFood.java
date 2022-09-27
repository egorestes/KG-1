import java.awt.*;

public class BowlWithFood {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color = new Color(176, 164, 198, 255);

    public BowlWithFood(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setColor(Color.black);
        g.drawOval(this.x, this.y, this.width, this.height);
    }

    void drawFood(final Graphics gr){
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(93, 44, 44));
        g.fillOval((int)(this.x + 0.45 *this.width), (int)(this.y + 0.28 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.48 *this.width), (int)(this.y + 0.35 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.40 *this.width), (int)(this.y + 0.40 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.41 *this.width), (int)(this.y + 0.35 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.46 *this.width), (int)(this.y + 0.45 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.55 *this.width), (int)(this.y + 0.41 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.52 *this.width), (int)(this.y + 0.42 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.52 *this.width), (int)(this.y + 0.32 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.52 *this.width), (int)(this.y + 0.35 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.52 *this.width), (int)(this.y + 0.36 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.51 *this.width), (int)(this.y + 0.43 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.56 *this.width), (int)(this.y + 0.44 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.56 *this.width), (int)(this.y + 0.44 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.56 *this.width), (int)(this.y + 0.42 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.62 *this.width), (int)(this.y + 0.40 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.64 *this.width), (int)(this.y + 0.38 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.66 *this.width), (int)(this.y + 0.30 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
        g.fillOval((int)(this.x + 0.68 *this.width), (int)(this.y + 0.32 *this.height), (int)(0.06 * this.width), (int)(0.06 * this.width));
    }
}