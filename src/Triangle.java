public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String color, boolean filled)
            throws MiExcepcion {
        super(color, filled);

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new MiExcepcion("Los lados " + side1 + ", " + side2 + ", " + side3 + " no forman un triángulo.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
        public String toString() {
            return "Tringle side1=" + side1 + "side2=" + side2 + "side3=" + side3 + "Perimetro=" + getPerimeter() + "Area=" + getArea() + "color=" + color + "filled=" + filled;
        }
        //exception
    static void ilegalTriangleException(double side1, double side2, double side3) throws MiExcepcion {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new MiExcepcion("Los lados no forman un triángulo válido");
        }
    }
}
