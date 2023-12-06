package Bridge_Pattern;

public class BridgePatternExample {
    public static void main(String[] args) {
        Color redColor = new Red();
        Color blueColor = new Blue();

        Shape redCircle = new Circle(redColor);
        Shape blueSquare = new Square(blueColor);

        redCircle.draw();
        blueSquare.draw();
    }
}
