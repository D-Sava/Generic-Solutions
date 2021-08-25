import java.util.LinkedList;

public class Stek <T> {

    private LinkedList<T> elementiSteka = new LinkedList<>();

    public void push(T element){
        elementiSteka.addFirst(element);
    }

    public void pop(){
        elementiSteka.removeFirst();
    }

    public boolean isEmpty(){
        return elementiSteka.isEmpty();
    }
}
