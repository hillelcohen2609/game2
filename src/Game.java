import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game extends JFrame {
    private Human player;
    private Human enemyA;
    private Human enemyB;
    private Human [] enemies;
    private GameScan gameScan;

    public static void main(String[] args) {

        Game g1 = new Game();
        JOptionPane.showMessageDialog(null, "cops and robbers\n" +
                "You're the thief and you have to\n"+ "use the keys to escape from the cops\n"+ "otherwise you will be disqualified");
    }

    public Game() {
        this.setBackground(Color.yellow);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Def.GAME_WIDTH, Def.GAME_HEIGHT);
        this.setLayout(null);
        this.setTitle("Game");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.green);

        boolean isEnemy = true;
        this.enemyA = new Human(isEnemy);
        this.enemyB=new Human(isEnemy);
        this.enemies=new Human[4];
        for (int i = 0; i <enemies.length ; i++) {
            this.enemies[i]=new Human(isEnemy);

        }
         isEnemy = false;
        this.player = new Human(isEnemy);
        this.gameScan = new GameScan(player, enemies[0],enemies[1],enemies[2],enemies[3]);
        HumanMovement humanMovement = new HumanMovement(player);
        this.addKeyListener(humanMovement);

        gameScan.setBounds(0, 0, Def.GAME_WIDTH, Def.GAME_HEIGHT);
        this.add(gameScan);
        gameScan.mainGameLoop();












    }




    }







