package Lesson35;

public class Less35<T, U> {
    private T item;
    private U item2;

    public Less35(T item, U item2) {
        this.item = item;
        this.item2 = item2;
    }
    public void setItem(T item, U item2) {
        this.item = item;
        this.item2 = item2;
    }
    public T getItem() {
        return item;
    }
    public U getItem2() {
        return item2;
    }
}
