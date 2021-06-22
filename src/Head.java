import java.awt.*;

public class Head implements Paintable{
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean isEnemy;
    public Head(int x, int y, int width, int height, boolean isEnemy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isEnemy = isEnemy;
    }
    public void moveRight(){
//        if (isEnemy) {
//            this.x += 1;
//        }
        this.x+=5;
    }
    public void moveLeft(){
//        if (isEnemy) {
//            this.x -= 1;
//        }
        this.x-=5;
    }
    public void moveUp(){
//        if (isEnemy) {
//            this.y -= 1;
//        }
        this.y-=5;
    }
    public void moveDown(){
        this.y+=5;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillOval(this.x, this.y, this.width, this.height);
    }
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
}
