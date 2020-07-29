package com.sbrf.demo;

class Vector
{
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector cross_Addit(Vector vector)
    {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector cross_Subtract(Vector vector)
    {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public double scalar_Product(Vector vector)
    {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector cross_Product(Vector vector)
    {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public static Vector[] gener_vect(int n)
    {
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++)
        {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString()
    {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public static void main(String[] args)
    {
        Vector[] vectors = Vector.gener_vect(10);
        System.out.println("Вектор 0: "+ vectors[0]);
        System.out.println("Вектор 1: "+vectors[1]);
        System.out.println("Длина вектора: "+vectors[0].getLength());
        System.out.println("Сложение векторов 0 и 1: "+vectors[0].cross_Addit(vectors[1]));
        System.out.println("Вычитание из вектора 0 вектор 1: "+vectors[0].cross_Subtract(vectors[1]));
        System.out.println("Скалярное произведение вектора 0 и 1: "+vectors[0].scalar_Product(vectors[1]));
        System.out.println("Векторное произведение вектора 0 и 1: "+vectors[0].cross_Product(vectors[1]));
    }
}
