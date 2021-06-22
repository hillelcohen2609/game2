import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScan extends JPanel {
    private Human player;
    private Human enemy0;
    private Human enemy1;
    private Human enemy2;
    private Human enemy3;
    public static boolean flag = false;


    public GameScan(Human player, Human enemy0, Human enemy1, Human enemy2, Human enemy3) {
        this.player = player;
        this.enemy0 = enemy0;
        this.enemy1 = enemy1;
        this.enemy2 = enemy2;
        this.enemy3 = enemy3;
    }




    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.green);
        this.player.paint(g);
        this.enemy0.paint(g);
        this.enemy1.paint(g);
        this.enemy2.paint(g);
        this.enemy3.paint(g);



    }

    public void mainGameLoop() {
        new Thread(() -> {
            while (!GameScan.flag) {
                try {
                    repaint();
                    Thread.sleep(25);
                    randomMovement(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }




        }
        ).start();
    }

    public void randomMovement(int n) {
        Random random = new Random();
        int num = random.nextInt(4);
        if (num == 0) {
            for (int i = 0; i < n; i++) {
                enemy0.moveUp();
                if (coolision1(player, enemy0)) {
                    this.flag = true;
                }
                enemy1.moveUp();
                if (coolision2(player, enemy1)) {
                    this.flag = true;
                }


            }
        } else if (num == 1) {
            for (int i = 0; i < n; i++) {
                if (this.enemy1.getHandRight().getX() - 180 <= Def.GAME_HEIGHT) {

                    enemy1.moveRight();
                    if (coolision2(player, enemy1)) {
                        this.flag = true;
                    }
                } else {
                    for (int j = 0; j < 70; j++) {

                        enemy1.moveLeft();
                        if (coolision2(player, enemy1)) {
                            this.flag = true;
                            getGraphics().setColor(Color.red);
                            getGraphics().setFont(new Font("MV BOLLEY",Font.PLAIN,300));
                            getGraphics().drawString("GAME OVER",850,550);

                        }
                    }
                }
                if (this.enemy2.getHandRight().getX() - 180 <= Def.GAME_HEIGHT) {
                    enemy2.moveRight();
                    if (coolision3(player, enemy2)) {
                        this.flag = true;
                        getGraphics().setColor(Color.red);
                        getGraphics().setFont(new Font("MV BOLLEY",Font.PLAIN,300));
                        getGraphics().drawString("GAME OVER",850,550);

                    }
                } else {
                    for (int j = 0; j < 100; j++) {

                        enemy2.moveLeft();
                        if (coolision3(player, enemy2)) {
                            this.flag = true;
                        }
                    }
                }

            }
        } else if (num == 2) {
            for (int i = 0; i < n; i++) {
                if (this.enemy2.getLegLeft().getY() <= Def.GAME_HEIGHT - 440) {

                    enemy2.moveDown();
                    if (coolision3(player, enemy2)) {
                        this.flag = true;
                    }
                } else {
                    for (int j = 0; j < 120; j++) {
                        enemy2.moveUp();
                        if (coolision3(player, enemy2)) {
                            this.flag = true;
                        }
                    }
                }
                if (this.enemy3.getLegLeft().getY() <= Def.GAME_HEIGHT - 440) {

                    enemy3.moveDown();
                    if (coolision4(player, enemy3)) {
                        this.flag = true;
                    }
                }
                for (int j = 0; j < 130; j++) {
                    enemy3.moveUp();
                    if (coolision4(player, enemy3)) {
                        this.flag = true;
                    }

                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (this.enemy1.getHandRight().getX() - 15 - 40 >= 0) {

                    enemy1.moveLeft();
                    if (coolision2(player, enemy1)) {
                        this.flag = true;
                    }
                } else {
                    for (int j = 0; j < 100; j++) {

                        enemy1.moveRight();
                        if (coolision2(player, enemy1)) {
                            this.flag = true;
                        }
                    }
                }
                if (this.enemy3.getHandRight().getX() - 15 - 40 >= 0) {

                    enemy3.moveLeft();
                    if (coolision4(player, enemy3)) {
                        this.flag = true;
                    }
                } else {
                    for (int j = 0; j < 80; j++) {
                        enemy3.moveRight();
                        if (coolision4(player, enemy3)) {
                            this.flag = true;
                        }

                    }
                }
            }
        }

    }

    public boolean coolision1(Human player, Human enemy0) {
        Rectangle recPers1 = new Rectangle(player.getHandLeft().getX(), player.getHead().getY(), 70, 140);
        Rectangle recPers2 = new Rectangle(enemy0.getHandLeft().getX(), enemy0.getHead().getY(), 70, 140);
        if (recPers1.intersects(recPers2)) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            return true;
        } else return false;


    }

    public boolean coolision2(Human player, Human enemy1) {
        Rectangle recPers1 = new Rectangle(player.getHandLeft().getX(), player.getHead().getY(), 70, 140);
        Rectangle recPers2 = new Rectangle(enemy1.getHandLeft().getX(), enemy1.getHead().getY(), 70, 140);
        if (recPers1.intersects(recPers2)) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            return true;
        } else return false;


    }

    public boolean coolision3(Human player, Human enemy2) {
        Rectangle recPers1 = new Rectangle(player.getHandLeft().getX() ,player.getHead().getY(), 70, 140);
        Rectangle recPers2 = new Rectangle(enemy2.getHandLeft().getX(), enemy2.getHead().getY(), 70, 140);
        if (recPers1.intersects(recPers2)) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            return true;
        } else return false;


    }

    public boolean coolision4(Human player, Human enemy3) {
        Rectangle recPers1 = new Rectangle(player.getHandLeft().getX(), player.getHead().getY(), 70, 140);
        Rectangle recPers2 = new Rectangle(enemy3.getHandLeft().getX(), enemy3.getHead().getY(), 70, 140);
        if (recPers1.intersects(recPers2)) {
            JOptionPane.showMessageDialog(null, "GAME OVER");
            return true;
        } else return false;

    }
}

