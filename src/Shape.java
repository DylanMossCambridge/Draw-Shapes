public abstract class Shape {

    public String type;

    Shape(){
        setType();
    }

    public void setType(){
        type = "Shape";
    }

    abstract void draw(AsciiImage asciiImage);
}
