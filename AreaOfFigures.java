package com.company;
import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        if(figure.equals("square")){
            double squareSide = Double.parseDouble(scan.nextLine());
            double result = squareSide * squareSide;
            System.out.printf("%.3f", result);
        }
        else if(figure.equals("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double result = a * b;
            System.out.printf("%.3f", result);
        }
        else if(figure.equals("circle")){
            double r = Double.parseDouble(scan.nextLine());
            double area = (r * r) * Math.PI;
            System.out.printf("%.3f", area);
        }
        else if(figure.equals("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double result = a * b /2;
            System.out.printf("%.3f", result);
        }
        else if(figure.equals("traps")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double result = (a+b) * h/2;
            System.out.printf("%.3f", result);
        }
    }
}
/*•	Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
•	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
•	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
•	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа -
дължината на страната му и дължинатана височината към нея
vsichko zakrugleno do 3*/