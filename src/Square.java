public class Square extends Shape {

  private final int x;

  public Square(int x) {
    super();
    this.x = x;
  }

  public int getX(){
    return x;
  }

  @Override
  public void setType(){
    type = "square";
  }

  void draw(AsciiImage asciiImage) {
    asciiImage.draw(x*2, '#');
  }
}
