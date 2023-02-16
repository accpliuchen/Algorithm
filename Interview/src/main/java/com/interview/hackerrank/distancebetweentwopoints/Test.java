package com.interview.hackerrank.distancebetweentwopoints;

import java.util.Scanner;

class Point2D
{
    int x,y;

    public Point2D(int x, int y) {

        this.x = x;
        this.y = y;
    }
    double dist2D(Point2D p)
    {
        double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
        return distance;
    }
    void printDistance(double d)
    {
        System.out.println("2D distance = " + (int) Math.ceil(d));
    }

}

class Point3D extends Point2D
{
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    double dist3D(Point3D p)
    {
        double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2) + Math.pow((p.z - z), 2));
        return distance;
    }
    void printDistance(double d)
    {
        System.out.println("2D distance = " + (int) Math.ceil(d));
    }

}

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();

        Point3D p1=new Point3D(x1,y1,z1);
        Point3D p2=new Point3D(x2,y2,z2);

        double d1=p1.dist2D(p2);
        double d2=p1.dist3D(p2);

        Point2D k = new Point2D(0, 0);
        k.printDistance(d1);
        k = p1;
        k.printDistance(d2);
    }

}
