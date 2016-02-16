package p1;

public class Main {

    public static void main(String[] args) {

        // Create an array of balloons
        Balloon[] thing = new Balloon[5];

        // Build the first balloon
        thing[0] = new Balloon();

        // Build the second balloon
        thing[1] = new Balloon(12, "white");

        // Build the third balloon
        thing[2] = new Balloon(6, "maroon");

        // Print the number of balloons made today
        System.out.printf("Number of balloons made = %d%n",
                Balloon.getQuantity());

        // Show the balloons' characteristics
        for (Balloon each : thing)

            // Only show object if it's defined
            if (each != null)
                System.out.println(each);
    }
}

class Balloon {
    // Properties
    private int size;
    private String color;
    private boolean inflated;

    public boolean isInflated() {
        return inflated;
    }

    public void setInflated(boolean arg) {
        inflated = arg;
    }

    private static int quantity = 0;

    // Default constructor
    Balloon() {
        size = 10;
        color = "blue";
        inflated = false;
        quantity++;
    }

    // Custom constructor
    Balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        inflated = false;
        quantity++;
    }

    // Return color of the object
    String getColor () {
        return color;
    }

    // Return color of the object
    int getSize () {
        return size;
    }

    // Return the number of balloons produced
    static int getQuantity () {
        return quantity;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "size=" + size +
                ", color=" + color +
                ", " + (inflated ? "inflated" : "not inflated") +
                '}';
    }
}