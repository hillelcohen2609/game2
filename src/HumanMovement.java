import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HumanMovement implements KeyListener {

    private Human player;


    public HumanMovement(Human player){
        this.player = player;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();

        switch (key){
            case KeyEvent.VK_RIGHT:
                 if (this.player.getHandRight().getX()-180<=Def.GAME_HEIGHT){

                     player.moveRight();
                     break;
                 }
            case KeyEvent.VK_LEFT:
                if (this.player.getHandRight().getX()-15-40>=0){

                    player.moveLeft();
                    break;
                }
            case KeyEvent.VK_UP:
                player.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                if (this.player.getLegLeft().getY()<=Def.GAME_HEIGHT-440){

                    player.moveDown();
                    break;
                }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    }

