import java.awt.*;

public class Human implements Paintable{
    private Body body;
    private Body handRight;
    private Body handLeft;
    private Body legRight;
    private Body legLeft;
    private Head head;
    private boolean isEnemy;
    int offset;
    int offset2;
    int offset3;
    int offset4;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Body getHandRight() {
        return handRight;
    }

    public void setHandRight(Body handRight) {
        this.handRight = handRight;
    }

    public Body getHandLeft() {
        return handLeft;
    }

    public void setHandLeft(Body handLeft) {
        this.handLeft = handLeft;
    }

    public Body getLegRight() {
        return legRight;
    }

    public void setLegRight(Body legRight) {
        this.legRight = legRight;
    }

    public Body getLegLeft() {
        return legLeft;
    }

    public void setLegLeft(Body legLeft) {
        this.legLeft = legLeft;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }

    public Human(boolean isEnemy) {
        this.isEnemy = isEnemy;
        if (!isEnemy){
            this.body = new Body(100,100,40,60, isEnemy);
            this.head = new Head(105,70,30,30, isEnemy);
            this.legLeft=new Body(100,161,15,50, isEnemy);
            this.legRight=new Body(125,161,15,50, isEnemy);
            this.handLeft=new Body(84,100,15,70, isEnemy);
            this.handRight=new Body(141,100,15,70, isEnemy);
        }

        else {

            for (int i = 0; i < 4; i++) {
                switch (i){
                    case 1:
                        offset = 100;
                        this.body = new Body(100+offset,100,40,60, isEnemy);
                        this.head = new Head(105+offset,70,30,30, isEnemy);
                        this.legLeft=new Body(100+offset,161,15,50, isEnemy);
                        this.legRight=new Body(125+offset,161,15,50, isEnemy);
                        this.handLeft=new Body(84+offset,100,15,70, isEnemy);
                        this.handRight=new Body(141+offset,100,15,70, isEnemy);
                        break;
                    case 2:
                         offset2 = 250;
                        int changey =0;
                        this.body = new Body(100+offset2,100+changey,40,60, isEnemy);
                        this.head = new Head(105+offset2,70+changey,30,30, isEnemy);
                        this.legLeft=new Body(100+offset2,161+changey,15,50, isEnemy);
                        this.legRight=new Body(125+offset2,161+changey,15,50, isEnemy);
                        this.handLeft=new Body(84+offset2,100+changey,15,70, isEnemy);
                        this.handRight=new Body(141+offset2,100+changey,15,70, isEnemy);
                        break;
                    case 3:
                        offset3 = 450;
                        this.body = new Body(100+offset3,100,40,60, isEnemy);
                        this.head = new Head(105+offset3,70,30,30, isEnemy);
                        this.legLeft=new Body(100+offset3,161,15,50, isEnemy);
                        this.legRight=new Body(125+offset3,161,15,50, isEnemy);
                        this.handLeft=new Body(84+offset3,100,15,70, isEnemy);
                        this.handRight=new Body(141+offset3,100,15,70, isEnemy);
                        break;
                    case 4:
                        offset4 = 700;
                        this.body = new Body(100+offset4,100,40,60, isEnemy);
                        this.head = new Head(105+offset4,70,30,30, isEnemy);
                        this.legLeft=new Body(100+offset4,161,15,50, isEnemy);
                        this.legRight=new Body(125+offset4,161,15,50, isEnemy);
                        this.handLeft=new Body(84+offset4,100,15,70, isEnemy);
                        this.handRight=new Body(141+offset4,100,15,70, isEnemy);
                        break;
                }

            }

        }




    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset2() {
        return offset2;
    }

    public void setOffset2(int offset2) {
        this.offset2 = offset2;
    }

    public int getOffset3() {
        return offset3;
    }

    public void setOffset3(int offset3) {
        this.offset3 = offset3;
    }

    public int getOffset4() {
        return offset4;
    }

    public void setOffset4(int offset4) {
        this.offset4 = offset4;
    }

    public void moveRight(){
        this.body.moveRight();
        this.head.moveRight();
        this.legRight.moveRight();
        this.legLeft.moveRight();
        this.handLeft.moveRight();
        this.handRight.moveRight();

    }
    public void moveLeft(){
        this.body.moveLeft();
        this.head.moveLeft();
        this.legRight.moveLeft();
        this.legLeft.moveLeft();
        this.handRight.moveLeft();
        this.handLeft.moveLeft();
    }
    public void moveUp(){
       if ((head.getY() - 5) <= 0){
            if (!isEnemy) {
                return;
            }
            else if (head.getY()-5<=0){
                for (int i = 0; i < 50; i++) {

                    this.body.moveDown();
                    this.head.moveDown();
                   this.legRight.moveDown();
                   this.legLeft.moveDown();
                   this.handRight.moveDown();
                   this.handLeft.moveDown();

                }

            }
        }
        this.body.moveUp();
        this.head.moveUp();
        this.legRight.moveUp();
        this.legLeft.moveUp();
        this.handRight.moveUp();
        this.handLeft.moveUp();
    }
    public void moveDown() {
            this.body.moveDown();
            this.head.moveDown();
            this.legRight.moveDown();
            this.legLeft.moveDown();
            this.handRight.moveDown();
            this.handLeft.moveDown();
        }

    public void paint(Graphics graphics) {
        this.body.paint(graphics);
        this.head.paint(graphics);
        this.legLeft.paint(graphics);
        this.legRight.paint(graphics);
        this.handRight.paint(graphics);
        this.handLeft.paint(graphics);


    }


}
