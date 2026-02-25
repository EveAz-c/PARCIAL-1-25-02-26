public class Circle extends GeometricObject {
    private double radio;

    public Circle(){
        super();
        this.radio = 1.0;
    }
    public Circle(double radio, String color, boolean filled) {
        super(color, filled);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
}
    public double getArea() {
        return Math.PI * radio * radio;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radio;
    }
    public double getDiameter() {
        return 2 * radio;
    }
    public void printCircle() {
        System.out.println("Radio del circulo:" + radio);
    }
}
