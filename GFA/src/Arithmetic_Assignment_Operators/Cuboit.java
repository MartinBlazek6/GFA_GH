package Arithmetic_Assignment_Operators;

public class Cuboit {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double sideA = 50;
        double sideB = 55;
        double sideC = 80;
        double SouAr = sideA*2+sideB*2+sideC*2; // 3D object so 3 main sides there is top ant bottom
        double Volume = sideA*sideC*sideC;
        System.out.println("Object have Sourface Area of: " + SouAr + " and volume of: " + Volume + " unkown units.");
    }
}
