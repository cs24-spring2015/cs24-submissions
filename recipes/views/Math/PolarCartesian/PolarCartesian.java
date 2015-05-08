/* This class holds two inner clases (Cartesian and Polar). It also holds two
    methods to convert each one to the other and vice versa. We followed the mathematical formulas
    to convert accordingly. It was a lot of fun going through the Math class and seeing the 
    methods we can use to simplify the methods. The main method runs the code to make sure 
    it is working properly. **/
public class PolarCartesian {

    /*This is the Cartesian Class made up of x and y coordiantes. **/
    private static class Cartesian {
        private int x;
        private int y;
        
        public Cartesian(int xDir, int yDir) {
            this.x = xDir;
            this.y = yDir;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

    }

    /* This is the Polar Coordinates that works with a radius
        and the measurement of the angles are in degrees. **/ 
    private static class Polar {
        private int radius;
        private int theta; 

        public Polar(int r, int t) {
            this.radius = r;
            this.theta = t;
        }

        public int getRadius() {
            return this.radius;
        }

        public int getTheta() {
            return this.theta;
        }
    }

    /*This method converts a polar coordinate to a Cartesian one.
        It prints the Cartesian Point in the (x, y) format. **/ 
    public static void convertToCartesian(int r, int t) {
        double theta = Math.toRadians(t);
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        System.out.println("=== Cartesian Coordinate ===");
        System.out.println("");
        System.out.println("(" + x + "," + y + ")");
    }

    /*This method converts a cartesian point to a polar one.
        It prints the polar point in the (r, theta) format. **/ 
    public static void convertToPolar(int xDir, int yDir) {
        double r;
        int temp = xDir * xDir + yDir * yDir; 
        r = Math.sqrt(temp);
        double theta = Math.atan2((double) yDir, (double) xDir);
        double thetaDeg = Math.toDegrees(theta);
        System.out.println("=== Polar Coordinate ===");
        System.out.println("");
        System.out.println("(" + r + "," + thetaDeg + ")");  
    }

    public static void main(String[] args) {
        PolarCartesian.Polar point = new Polar(3, 30);
        PolarCartesian.convertToCartesian(point.getRadius(), point.getTheta());

        PolarCartesian.Cartesian point2 = new Cartesian(3, 4);
        PolarCartesian.convertToPolar(point2.getX(), point2.getY()); 
    }
}
