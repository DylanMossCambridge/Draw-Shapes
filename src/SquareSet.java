import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class SquareSet extends Shape {

    ArrayList<Square> squareList = new ArrayList<>();

    SquareSet(int[] indexes){
        for(int index : indexes){
            squareList.add(new Square(index));
        }
    }

    @Override
    void draw(AsciiImage asciiImage) {

        int minIndex = Collections.min(squareList, Comparator.comparing(element -> element.getX())).getX();
        int maxIndex = Collections.max(squareList, Comparator.comparing(element -> element.getX())).getX();

        for(Square square : squareList){
            square.draw(asciiImage);
        }

        asciiImage.draw(minIndex * 2 - 1, '{');
        asciiImage.draw(maxIndex * 2 + 1, '}');
    }
}
