package com.sda.exceptions.calc.triangles;

public class TriangleApp {
    public static void main(String[] args) {
        try {
            int x = NumberLoader.loadFromUser();
            int y = NumberLoader.loadFromUser();
            int z = NumberLoader.loadFromUser();

            int circuit = TriangleCalculation.calculateTriangleCircuit(x, y, z);

            System.out.println("Calculated triangle circuit: " + circuit);

        } catch (InvalidInputException invalidInputException) {
            System.out.println("Invalid input");
        } catch (CannotBuildTriangleException cannotBuildTriangleException) {
            System.out.println("Invalid lenghts");
        }
    }
}
