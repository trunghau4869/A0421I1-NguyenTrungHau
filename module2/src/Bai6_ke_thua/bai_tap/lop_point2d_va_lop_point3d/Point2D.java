package Bai6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr=new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y ;
    }
}
