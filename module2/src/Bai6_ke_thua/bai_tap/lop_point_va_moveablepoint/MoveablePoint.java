package Bai6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MoveablePoint extends Point{
    public float xSpeed;
    public float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr2=new float[2];
        arr2[0]=xSpeed;
        arr2[1]=ySpeed;
        return arr2;
    }

    public void setSpeed(float ySpeed,float xSpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +", "+super.toString();
    }

    public MoveablePoint move(){
        x +=xSpeed;
        y +=ySpeed;
        return this;
    }
}
