package practice.cube.controller;
import practice.cube.model.Cube;//importing the cube Class


public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(10);//set a new variable cube

        int p = cube1.perimeter(10);// set a variable for perimeter
        System.out.println("The perimeter of the cube1 is: " + p );//print the result

        int s = cube1.area(10);//set a variable for area
        System.out.println("The area of the cube1 is: " + s );//print the result

        int v = cube1.volume(10);//set a variable for volume
        System.out.println("The volume of the cube1 is: " + v );//print the result

        cube1.setRibLength(20);//set a new parameter of rib length, but i don´t understand why it is set here?
        System.out.println("The perimeter of the cube1 is: " + cube1.perimeter(20));//print of new parameter
        System.out.println("The area of the cube1 is: " +cube1.area(20));
        System.out.println("The volume of the cube1 is: " + cube1.volume(20));
    }
}
