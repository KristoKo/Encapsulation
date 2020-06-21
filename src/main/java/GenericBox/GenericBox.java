package GenericBox;

public class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    //methods here


    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
