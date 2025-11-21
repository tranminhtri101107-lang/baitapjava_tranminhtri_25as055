package Ex61;

public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return 0.0;
    }
    public void setSide(double side) {
        Square square = this;
        side = side;
    }
    @Override
    public void setWidth(double side) {
        setSide(side);
    }
    @Override
    public void setLength(double side) {
        setSide(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
