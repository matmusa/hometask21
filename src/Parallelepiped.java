public class Parallelepiped {
    private double lenght;
    private double width;
    private double height;
    private double radius;

    public Parallelepiped() {

    }


    public Parallelepiped(double lenght, double width, double height, double radius) {
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

    void parallelepipedSquare(double length, double height, double width) {
        System.out.println("S=" + 2 * ((height * length) + (length * width) + (height * width)));
        setLenght(length);
        setHeight(height);
        setWidth(width);

    }

    void parallelepipedVolume(double length, double height, double width) {
        setLenght(length);
        setHeight(height);
        setWidth(width);
        System.out.println("V=" + (length * width * height));

    }
}
