public class Leaves extends Turtle {
    public Leaves() {
        penColor("green");
    }

    public void draw() {
        setDirection(270);
        forward(30);
        setDirection(210);
        forward(20);
        setDirection(270);
        forward(10);
        setDirection(330);
        forward(20);
        setDirection(270);
        forward(30);

        setDirection(90);
        forward(30);
        setDirection(150);
        forward(20);
        setDirection(90);
        forward(10);
        setDirection(30);
        forward(20);
        setDirection(90);
        forward(30);
    }
}