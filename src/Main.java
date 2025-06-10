import java.awt.*;

public class Main {
    public static void main(String[] args) {
      Point pointA = new Point(10,11);
      Point pointB = pointA;

      pointA.x=100;
      pointB.y=100;


        pointB = new Point(100,90);
        pointB.y=55;
        System.out.println(pointA);
        System.out.println(pointB);

    }
}