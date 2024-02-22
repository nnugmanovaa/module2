package project2;

import java.io.Serializable;

public class Dvd extends LibraryItem implements BorrowableItem, PaperItem, Serializable {
    private int runtime;


    public Dvd(){}

    public Dvd(int id, String name, boolean isAvailable, int runtime) {
        super(id, name, isAvailable, ItemType.DVD);
        this.runtime = runtime;
    }


    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
