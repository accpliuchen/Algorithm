package com.interview.exercise.test.exercise1;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        double distance = Math.sqrt(
                Math.pow(p2.getY() - p1.getY(), 2) +
                        Math.pow(p2.getX() - p1.getX(), 2)
        );

        return distance;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

class Line {
    private Point start = new Point(0, 0);
    private Point end = new Point(0, 0);

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() { return start; }

    public Point getEnd() { return end; }

    public void setStart(Point start) { this.start = start; }

    public void setEnd(Point end) { this.end = end; }

    public double getLineLength() {
        return Point.distance(start, end);
    }

    public String toString() {
        return "Start: " + this.start + " End: " + this.end;
    }
}

interface ListOfLines {
    public Vector<Line> getLinesFromStartingPoint(Point p);
    public Line getLineWithMaxLength();
    public Vector<Line> list_of_lines = null;
}
class LineList implements ListOfLines {
    public Vector<Line> list_of_lines = null;

    public LineList(Vector<Line> vector){
        this.list_of_lines =vector;
    }

    public Line getLineWithMaxLength(){
        double max=list_of_lines.get(0).getLineLength();
        int flag=0;
        for(Integer i=1;i<list_of_lines.size();i++){
            //System.out.println(list_of_lines.get(i).getLineLength());
            //max=Math.max(max,list_of_lines.get(i).getLineLength());
            if(max<list_of_lines.get(i).getLineLength()){
                flag=i;
            }
        }


        return list_of_lines.get(flag);
    }

    public Vector<Line> getLinesFromStartingPoint(Point p){
        //Line line=new Line(p.getX(),p.getY());

        //    System.out.println("p value X is "+p.getX());
        //    System.out.println("p value Y is "+p.getY());
        int flag=0;
        Vector<Line> result=new Vector<>();

        for(Integer i=0;i<list_of_lines.size();i++){
            double x=this.list_of_lines.get(i).getStart().getX();
            double y=this.list_of_lines.get(i).getStart().getY();

            if(x==p.getX() && y==p.getY()){

                //System.out.println("=======");
                //Point po=new Point(x,y);
                //    Line line=list_of_lines.get(i);

                //    line.setStart(x);
                //    line.setEnd(end);
                //    result.add(line);
                result.add(list_of_lines.get(i));
            }else{
                this.list_of_lines.remove(i);
            }
        }

        //System.out.println("======="+list_of_lines);
        return result;
    }

}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        String[] first=new String[]{"3","8","13","14"};
//        String[] second=new String[]{"8","4","3","12"};
//        String[] three=new String[]{"-7","-4","17","6"};
//        String[] four=new String[]{"7","3","1","2"};

        String[] first=new String[]{"23","15","-4","8"};
        String[] second=new String[]{"7","3","2","1"};
        String[] three=new String[]{"-5","4","13","8"};
        String[] four=new String[]{"7","3","19","-12"};
        String[] five=new String[]{"3","8","1","0"};

        List<String[]> result=new ArrayList<>();
        result.add(first);
        result.add(second);
        result.add(three);
        result.add(four);
        result.add(five);

//        Scanner sc = new Scanner(System.in);
//        String sub = sc.nextLine();
//        int nLines = Integer.parseInt(sub);
        Vector<Line> lines = new Vector<Line>();
        for(int i=0; i<result.size(); i++) {
            //input = sc.nextLine().split(" ");
            String[] array=result.get(i);
            /* x1 y1 x2 y2 */
            double x1 = Double.parseDouble(array[0]);
            double y1 = Double.parseDouble(array[1]);
            double x2 = Double.parseDouble(array[2]);
            double y2 = Double.parseDouble(array[3]);

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Line line = new Line(p1, p2);
            lines.add(line);
        }

        /* Input to find all the line starting from point p1 */
        //input = sc.nextLine().split(" ");
        double point_x1 = Double.parseDouble("7.0");
        double point_y1 = Double.parseDouble("3.0");
        Point startingPoint = new Point(point_x1, point_y1);

        /* Finding Longest Line*/
        LineList myList = new LineList(lines);
        Line maxLine = myList.getLineWithMaxLength();
        System.out.println("Longest Line --> " + maxLine);
        double length = maxLine.getLineLength();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Length: " + (String)df.format(length));

        /* Finding all the lines starting from point startingPoint */
        Vector<Line> starting_lines = myList.getLinesFromStartingPoint(startingPoint);
        System.out.println("All the Lines starting from point: " + startingPoint);
        Iterator value = starting_lines.iterator();
        while(value.hasNext()) {
            System.out.println(value.next());
        }
    }
}