package edu.cmu.cs.cs214.rec02;

import edu.cmu.cs.cs214.rec02.points.*;

public class Main {
    public static void main(String[] args) {
        Point point1 = new CartesianPoint(2, 0);
        Point point2 = new PolarPoint(4, Math.PI);
        
        Line line = new Line(point1, point2);
        
        line.draw();
    }
}
