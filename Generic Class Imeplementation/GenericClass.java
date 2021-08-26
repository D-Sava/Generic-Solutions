public class GenericClass<T> {

    private T firstElement;
    private T secondElement;

    GenericClass(){
        this.firstElement = null;
        this.secondElement = null;
    }

    GenericClass(T firstElement, T secondElement){
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                '}';
    }
}
