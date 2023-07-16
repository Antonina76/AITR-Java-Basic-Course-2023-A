package practice.cube.model;

public class Cube {
    //class fields
    public int ribLength;//rib length
    //calculation formulas: perimeter - p = 12*a; area - s = 6*(a*a); volume - v = a*a*a

    //designer of Class Cube
    public Cube(int ribLength) {
        this.ribLength = ribLength;
    }
    //getter and setter

    public int getRibLength() {
        return ribLength;
    }

    public void setRibLength(int ribLength) {
        this.ribLength = ribLength;
    }

    public void SetA (int ribLength){
        this.ribLength = ribLength;
    }
    //_____Methods______
    public int perimeter (int ribLength){
        return 12*ribLength;
    }
    public int area (int ribLength){
        return 6*(ribLength*ribLength);
    }
    public int volume (int ribLength){
        return ribLength*ribLength*ribLength;
    }
}
