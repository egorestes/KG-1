import java.awt.*;

public class Whiskas {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color = new Color(255, 0, 255);

    public Whiskas(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
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

        g.setFont(new Font("Courier New", 1, (int) (this.width * 0.2)));

        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height - (int) (this.height * 0.3));
        g.setColor(Color.WHITE);
        g.drawString("WHISKAS", (int) (this.x + 0.1 * this.width), (int) (this.y + 0.3 * this.y));

        g.setColor(new Color(102, 51, 0));
        g.fillRect(this.x, this.y, this.width, (int) (this.height * 0.02));

        g.setColor(this.color);
        g.fillRect(this.x, this.y - (int) (this.height * 0.2), this.width, (int) (this.height * 0.2));


        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, this.width, this.height - (int) (this.height * 0.3));
        g.drawRect(this.x, this.y, this.width, (int) (this.height * 0.02));
        g.drawRect(this.x, this.y - (int) (this.height * 0.2), this.width, (int) (this.height * 0.2));
    }
}