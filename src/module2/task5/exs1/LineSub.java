package module2.task5.exs1;

public class LineSub extends Point {
    Point end;               // Ending point

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }

    public LineSub(Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLenght() {
        return (int) Math.sqrt(Math.pow((end.getX() - super.getX()), 2) + Math.pow((end.getY() - super.getY()), 2));
    }

    public double getGradient() {
        return Math.atan2((end.getY() - super.getY()), (end.getX() - super.getX()));
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "end=" + end +
                '}' + super.toString();
    }
}
