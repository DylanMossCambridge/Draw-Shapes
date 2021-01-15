public class AsciiImage {

  private final StringBuilder stringBuilder;

  public AsciiImage() {
    stringBuilder = new StringBuilder();
    for (int i = 0; i < 30; i++) {
      stringBuilder.append(' ');
    }
  }

  void draw(int x, char c) {
    stringBuilder.setCharAt(x, c);
  }

  @Override
  public String toString() {
    return stringBuilder.toString();
  }
}
