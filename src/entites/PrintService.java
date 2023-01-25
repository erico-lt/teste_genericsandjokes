package entites;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Generic> {
    List<Generic> list = new ArrayList<>();

    public void addItem(Generic item) {
        list.add(item);
    }

    public Generic first() {
        if(this.list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return list.get(0);
    }

    public void print () {
        if(!this.list.isEmpty()) {
            System.out.print("[" + list.get(0));
        }
        for(int cont = 1; cont < list.size(); cont ++) {
            System.out.print(", " + list.get(cont));
        }
        System.out.println("]");
    }
}