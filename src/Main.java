import java.sql.SQLData;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nchoose a figure:" +
                "\n1.Parallelepiped" +
                "\n2.Cylender");
        double a = new Scanner(System.in).nextDouble();

        if (a == 1) {

            try {
                Parallelepiped parallelepiped = new Parallelepiped();
                System.out.println("write a lenght of parallelepiped :");
                double lenght = new Scanner(System.in).nextInt();
                System.out.println("write a wight of parallelepiped :");
                double width = new Scanner(System.in).nextInt();
                System.out.println("write a height of parallelepiped :");
                double height = new Scanner(System.in).nextInt();
                if (lenght > 0 && lenght < 100) {
                    parallelepiped.setLenght(lenght);
                } else {
                    throw new MyException(" error!!! ");
                }
                if (width > 0 && width < 100) {
                    parallelepiped.setWidth(width);
                } else {
                    throw new MyException(" error!!!");
                }
                if (height > 0 && height < 100) {
                    parallelepiped.setHeight(height);
                } else {
                    throw new MyException(" error!!!");
                }
                parallelepiped.parallelepipedVolume(parallelepiped.getLenght(), parallelepiped.getHeight(), parallelepiped.getWidth());
                parallelepiped.parallelepipedSquare(parallelepiped.getLenght(), parallelepiped.getHeight(), parallelepiped.getWidth());
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException r) {
                System.out.println("Write only numbers");
            }
        } else if (a == 2) {
            try {
                Cylender cylender = new Cylender();
                System.out.println("write a height of cylender :");
                double height = new Scanner(System.in).nextInt();
                System.out.println("write a radius of cylender :");
                double radius = new Scanner(System.in).nextInt();

                if (radius > 0 && radius < 100) {
                    cylender.setHeight(height);
                } else {
                    throw new MyException(" error!!!");
                }
                if (height > 0 && height < 100) {
                    cylender.setRadius(radius);
                    cylender.cylenderVolume(cylender.getHeight(), cylender.getRadius());
                    cylender.cylenderSquare(cylender.getHeight(), cylender.getRadius());
                } else {
                    throw new MyException(" error!!!");
                }


            } catch (MyException e) {
                System.out.println(e.getMessage());


            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Write only numbers");

            }
        }

    }
}






