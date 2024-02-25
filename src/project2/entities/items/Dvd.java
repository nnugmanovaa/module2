package project2.entities.items;

import project2.utils.BorrowableItem;
import project2.enums.ItemType;
import project2.utils.PaperItem;

import java.io.Serializable;

public class Dvd extends LibraryItem implements BorrowableItem, PaperItem, Serializable {
    private int runtime;


    public Dvd(){}

    public Dvd(int id, String name, boolean isAvailable, int runtime) {
        super(id, name, isAvailable, ItemType.DVD);
        this.runtime = runtime;
    }
//2;Sons;true;DVD;40;

    public String deserialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId())
                .append(";")
                .append(getName())
                .append(";")
                .append(isAvailable())
                .append(";")
                .append(getItemType())
                .append(";")
                .append(getRuntime())
                .append(";");
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "runtime=" + runtime +"\n";
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
