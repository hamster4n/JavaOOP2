package home01.task03;

/**
 * Created by Hamster4n.
 * Описать класс Vector3d (т.е. он должен описывать вектор в 3х мерной, декартовой системе координат).
 * В качестве свойств этого класса возьмите координаты вектора. Для этого класса реализовать
 * методы сложения и скалярного и векторного произведения векторов.
 * Создайте несколько объектов этого класса и протестируйте их.
 */
public class Main {
    public static void main(String[] args) {
        Vector3d vector1 = new Vector3d(12.0, 19.0, 10.0);
        Vector3d vector2 = new Vector3d(28.0, 24.0, 21.0);
        Vector3d vector3 = new Vector3d(15.0, 15.0, 15.0);

        System.out.println("v1 + v2 = " + Vector3d.getVectorSum(vector1, vector2));
        System.out.println("v1 + v3 = " + Vector3d.getVectorSum(vector1, vector3));
        System.out.println("v3 + v2 = " + Vector3d.getVectorSum(vector3, vector2));
        System.out.println();


        System.out.println("v1 * v2 = " + Vector3d.getVectorOp(vector1, vector2));
        System.out.println("v1 * v3 = " + Vector3d.getVectorOp(vector1, vector3));
        System.out.println("v3 * v2 = " + Vector3d.getVectorOp(vector3, vector2));
        System.out.println();


        System.out.println("Scalar v1 * v2 = " + Vector3d.getScalarOp(vector1, vector2));
        System.out.println("Scalar v1 * v3 = " + Vector3d.getScalarOp(vector1, vector3));
        System.out.println("Scalar v3 * v2 = " + Vector3d.getScalarOp(vector3, vector2));



    }
}
