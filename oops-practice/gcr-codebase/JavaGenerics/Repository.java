import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T obj) {
        data.add(obj);
    }

    public void display() {

        for (T obj : data) {
            System.out.println(obj);
        }
    }
}