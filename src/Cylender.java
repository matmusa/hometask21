public class Cylender {

    private double lenght;
    private double width;
    private double height;
    private double radius;

    public Cylender() {

    }

    public Cylender(double lenght, double width, double height, double radius) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void cylenderSquare(double height, double radius) {

        setHeight(height);
        setRadius(radius);
        System.out.println("S=" + (2 * Math.PI * (height + radius)));

    }

    void cylenderVolume(double height, double radius) {
        setHeight(height);
        setRadius(radius);
        System.out.println("V=" + (Math.PI * radius * radius * height));

    }

}
