public class Stick extends Shape {

  private final int x;

  public Stick(int x) {
    super();
    this.x = x;
  }

  @Override
  public void setType(){
    type = "stick";
  }

  void draw(AsciiImage asciiImage) {
    asciiImage.draw(x*2, '|');
  }
}
