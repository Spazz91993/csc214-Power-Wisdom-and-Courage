package org.example;

public class App {
    public static void main(String[] args) {
        TriangleNumberCalc calculator = new TriangleNumberCalc();
        System.out.println("Triangular number of 3: " + calculator.value(3));
        System.out.println("Triangular number of 4: " + calculator.value(4));
        System.out.println("Triangular number of 5: " + calculator.value(5));
        System.out.println("Triangular number of 7: " + calculator.value(7));
        System.out.println("Triangular number of 0: " + calculator.value(0));

        System.out.println("Add triangular numbers 5 and 7: " + calculator.add(5, 7));
        System.out.println("Add triangular numbers 3 and 4: " + calculator.add(3, 4));

        System.out.println("Subtract triangular numbers 7 and 5: " + calculator.subtract(7, 5));
        System.out.println("Subtract triangular numbers 4 and 3: " + calculator.subtract(4, 3));
    }
}
