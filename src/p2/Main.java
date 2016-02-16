package p2;

/*
 * Created by emailman on 2/16/2016.
 */

import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] joe) {

        // Define two points
        Point2D pt1 = new Point2D(4, 0);
        Point2D pt2 = new Point2D(0, 3);

        // Print information about the points
        System.out.println(pt1);
        System.out.println(pt2);

        // Find the hypotenuse
        double hyp = pt1.distance(pt2);

        // Print the hypotenuse
        System.out.println("hyp=" + hyp);
    }
}
