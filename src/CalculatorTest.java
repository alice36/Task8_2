public class CalculatorTest extends ShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Line2D line2d = new Line2D(2,2,5,5);
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(11,12);
        Ball ball = new Ball(3);
        Cube cube = new Cube(21);

        System.out.println("Odcinek wyznaczony przez współrzędne [" + line2d.getX1() + "," + line2d.getY1()  + "] [" + line2d.getX2()  + "," + line2d.getY2() + "] ma długość " + lineLength(line2d));
        System.out.println("Okrąg o promieniu " + circle.getRadius() + " ma powierzchnię " + shapeCalculator.circleArea(circle));
        System.out.println("Kula o promieniu " + ball.getRadius() + " ma pojemność " + shapeCalculator.ballVolume(ball));
        System.out.println("Prostokąt o długościach boków " + rectangle.getLongSide() + " i " + rectangle.getShortSide()  + " ma pole, które wynosi " + shapeCalculator.rectangleArea(rectangle));
        System.out.println("Sześcian o długości krawędzi wynoszącej " + cube.getDiagonal() + " ma pojemność " + shapeCalculator.cubeVolume(cube));
        
    }
}
