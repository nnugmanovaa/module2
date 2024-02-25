package module2.task4.exs3;

public class Point2D {
    private float x;
    private float y;

    public Point2D (){
        x = 0.0f;
        y= 0.0f;
    }

    public Point2D( float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY ( float x, float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        return new float[] {x,y};
    }
    // TODO: 21.01.2024

    @Override
    public String toString() {
        return  "(" + x + " , " + y + ")";
    }
}
