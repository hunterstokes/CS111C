package M2.Homework;

public class Trio<T> {
    private T item1;
    private T item2;
    private T item3;

    public Trio(T item1, T item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Trio(T item1) {
        this(item1, item1, item1);
    }

    public T getItem1() {
        return item1;
    }

    public T getItem2() {
        return item2;
    }

    public T getItem3() {
        return item3;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public void setItem3(T item3) {
        this.item3 = item3;
    }
    @Override
    public String toString() {
        return item1.toString() + " " + item2.toString() + " " + item3.toString();
    }

    public void replaceAll(T item) {
        this.item1 = item;
        this.item2 = item;
        this.item3 = item;
    }


    public boolean hasDuplicates() {
        return item1.equals(item2) || item1.equals(item3) || item2.equals(item3);
    }

    public int count(T item) {
        int count = 0;
        if (item1.equals(item)) {
            count++;
        }
        if (item2.equals(item)) {
            count++;
        }
        if (item3.equals(item)) {
            count++;
        }
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Trio) {
            Trio<?> other = (Trio<?>) obj;
            return (this.item1.equals(other.item1) && this.item2.equals(other.item2) && this.item3.equals(other.item3)) ||
                    (this.item1.equals(other.item1) && this.item2.equals(other.item3) && this.item3.equals(other.item2)) ||
                    (this.item1.equals(other.item2) && this.item2.equals(other.item1) && this.item3.equals(other.item3)) ||
                    (this.item1.equals(other.item2) && this.item2.equals(other.item3) && this.item3.equals(other.item1)) ||
                    (this.item1.equals(other.item3) && this.item2.equals(other.item1) && this.item3.equals(other.item2)) ||
                    (this.item1.equals(other.item3) && this.item2.equals(other.item2) && this.item3.equals(other.item1));
        } else {
            return false;
        }
    }
}