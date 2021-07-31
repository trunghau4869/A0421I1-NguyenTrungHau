package Bai6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

//    public float getXYZ() {
//        return x,y,z;
//    }
//
//    public void setXYZ(float x, float y, float z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    @Override
    public String toString() {
        return
                "z=" + z +","+super.toString()
               ;
    }
}
