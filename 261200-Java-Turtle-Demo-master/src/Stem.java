public class Stem extends Turtle {
    public Stem() {
        penColor("green");
    }

    public void draw() {
        setDirection(270);
        forward(50);
        setDirection(225);
        forward(30);
        setDirection(270);
        forward(10);
        setDirection(315);
        forward(30);
        setDirection(270);
        forward(40);
        setDirection(225);
        forward(30);
        setDirection(270);
        forward(10);
        setDirection(315);
        forward(30);
    }
}