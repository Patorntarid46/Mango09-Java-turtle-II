public class Petals extends Turtle {
    public Petals() {
        penColor("red");
    }

    public void draw() {
        penColor("violet");
        for (int i = 0; i < 18; i++) {
            setDirection(i * 20);
            for (int j = 0; j < 30; j++) {
                forward(j / 10.0);
                left(2);
            }
            setDirection((i + 1) * 20);
            for (int j = 0; j < 30; j++) {
                forward(j / 10.0);
                right(2);
            }
        }
    }
}