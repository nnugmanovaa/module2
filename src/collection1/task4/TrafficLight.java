package collection1.task4;
//Write a Java program to create class called "TrafficLight"
// with attributes for color and duration, and methods to change the color and check for red or green.
public class TrafficLight {

    private String [] color = {"red", "yellow", "green"};
    private int duration;
    private int currentColorIndex;

    public TrafficLight(int duration) {
        this.duration = duration;
        this.currentColorIndex = 0;
    }

    public void changeColor(){
        currentColorIndex = (currentColorIndex + 1) % color.length;
        System.out.printf("Now yout new trafic loght color %s", color[currentColorIndex]);
    }

    public boolean isGreen (){
        if ( color[currentColorIndex].equals("green")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isYellow() {
        return color[currentColorIndex].equalsIgnoreCase("yellow");
    }

    public boolean isRed() {
        return color[currentColorIndex].equalsIgnoreCase("red");
    }
    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCurrentColorIndex() {
        return currentColorIndex;
    }

    public void setCurrentColorIndex(int currentColorIndex) {
        this.currentColorIndex = currentColorIndex;
    }
}
