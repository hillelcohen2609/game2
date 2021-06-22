import java.awt.*;

public class Body {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean isEnemy;

    public Body(int x, int y, int width, int height, boolean isEnemy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isEnemy = isEnemy;
    }
    public void paint(Graphics graphics) {
        if (!this.isEnemy){
            graphics.setColor(Color.red);
            graphics.fillRect(this.x, this.y, this.width, this.height);
            return;
        }
        graphics.setColor(Color.blue);
        graphics.fillRect(this.x, this.y, this.width, this.height);


    }
    public void moveRight(){
        this.x += 5;
    }
    public void moveLeft(){

        this.x -= 5;
    }

    public void moveUp(){
        this.y -= 5;
    }
    public void moveDown(){
        this.y += 5;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
