package com.sda.exceptions.calc.triangles;

import java.util.Arrays;


public class TriangleCalculation {

    public static int calculateTriangleCircuit(int x, int y, int z) throws RuntimeException {
        int[] sides = {x,y,z};

//        int [] sides = [3]; //inna forma zadeklarowania i in
//        sides[0] = x;
//        sides[1] = y;
//        sides[2] = z;

        Arrays.sort(sides);

        if (sides[2] >= sides[1] + sides[0]) {
            throw new CannotBuildTriangleException();
        }
        return x + y + z;
    }
}

