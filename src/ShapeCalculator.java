public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{
    @Override
    public double ballVolume(Ball ball){
        return 4/3*PI*Math.pow(ball.getRadius(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getDiagonal(),3);
    }

    @Override
    public double circleArea(Circle circle){
        return PI*circle.getRadius()*circle.getRadius();
    }

    @Override
    public double rectangleArea(Rectangle rectangle){
        return rectangle.getShortSide()*rectangle.getLongSide();
    }

}
