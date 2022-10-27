package L01WorkingWithAbstraction.lab.P2PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public boolean contains(Point point) {

        if(point.getX() >= bottomLeft.getX() &&
                point.getX() <= topRight.getX() &&
                point.getY() >= bottomLeft.getY() &&
                point.getY() <= topRight.getY()) {
            return true;
        }
        return false;
    }
}
