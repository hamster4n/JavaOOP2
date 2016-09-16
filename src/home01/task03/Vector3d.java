package home01.task03;

/**
 * Created by Hamster4n.
 * Описать класс Vector3d (т.е. он должен описывать вектор в 3х мерной, декартовой системе координат).
 * В качестве свойств этого класса возьмите координаты вектора. Для этого класса реализовать
 * методы сложения и скалярного и векторного произведения векторов.
 * Создайте несколько объектов этого класса и протестируйте их.
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector3d getVectorSum (Vector3d vector1, Vector3d vector2){
        Vector3d vector3 = new Vector3d(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY(), vector1.getZ() + vector2.getZ());
        return vector3;
    }

    public static Vector3d getVectorOp (Vector3d vector1, Vector3d vector2){
        double x3 = vector1.getY()*vector2.getZ() - vector1.getZ()*vector2.getY();
        double y3 = vector1.getZ()*vector2.getX() - vector1.getX()*vector2.getZ();
        double z3 = vector1.getX()*vector2.getY() - vector1.getY()*vector2.getX();
        Vector3d vector3 = new Vector3d(x3, y3, z3);
        return vector3;
    }

    public static double getScalarOp (Vector3d vector1, Vector3d vector2){
        return vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY() + vector1.getZ()*vector2.getZ();
    }

    @Override
    public String toString() {
        return "Vector3d[" + "x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
