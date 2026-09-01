package person;

public class Wall {

    private double width;
    private double length;

    public Wall(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {

            this.width = width;
        }
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {

            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }
}
