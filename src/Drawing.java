import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Drawing {

  private static ArrayList<Shape> shapes = new ArrayList<>(List.of(new Circle(0), new Circle(1), new SquareSet(new int[]{4,5}), new Stick(2), new Stick(3)));
  private static int counter = 0;

  //
  // {} represent a set of object collected together with the composite pattern
  //

  public static void draw() {
    AsciiImage asciiImage = new AsciiImage();
    shapes.forEach(shape -> {shape.draw(asciiImage);});
    System.out.println(asciiImage);
  }

  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.schedule(new DrawScreen(), 0, 1000);
  }

  static class DrawScreen extends TimerTask {
    public void run(){
      Drawing.draw();
      updateScreen();
    }

    //
    //Proves that the screen is being refreshed every 1 second
    //
    public void updateScreen(){
      shapes.add(new Circle(6 + Drawing.counter++));
    }
  }
}
