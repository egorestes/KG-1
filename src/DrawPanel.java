import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private int timerDelay;
    private Timer timer;
    private Timer timer2;
    private int ticksFromStart = -200;

    private int ticks2FromStart = -300;
    private HungryCat hungryCat;
    private Whiskas whiskas;
    private BowlWithFood bowlWithFood;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.timerDelay = timerDelay;
        timer = new Timer(timerDelay, this);
        timer2 = new Timer(timerDelay, this);
        timer.start();

        this.hungryCat = new HungryCat(-400, 500, 400, 500, Color.DARK_GRAY);

        this.whiskas = new Whiskas(0, 500, 400, 400);

        this.bowlWithFood = new BowlWithFood(800, 500, 160, 80);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        bowlWithFood.draw(gr);
        whiskas.draw(gr);
        whiskas.setX(ticksFromStart * 6);
        if (ticksFromStart * 6 > 1000) {
            bowlWithFood.drawFood(gr);
        }
        if (whiskas.getX() > 1600) {
            timer.stop();
            hungryCat.draw(gr);
            timer2.start();
        }
        if (ticks2FromStart * 5 > 300) {
            timer2.stop();
            bowlWithFood.draw(gr);
            hungryCat.drawHeart(gr);
        }
        hungryCat.setX(ticks2FromStart * 5);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
        if (e.getSource() == timer2) {
            repaint();
            ++ticks2FromStart;
        }
    }
}