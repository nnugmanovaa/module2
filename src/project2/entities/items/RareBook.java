package project2.entities.items;

import java.io.Serializable;

public class RareBook extends Book implements Serializable {
    private int rarituLevel;

    public void displayDetails(){
        System.out.printf("Author: %s, Title: %s, Isbn: %s,RarityLevel: %s", getAuthor(), getTitle(),getIsbn(), getRarituLevel());
    }

    public int getRarituLevel() {
        return rarituLevel;
    }
    public String deserialize() {
        StringBuilder sb = new StringBuilder(super.deserialize());
        sb.append(getRarituLevel())
                .append(";");
        return sb.toString();
    }

    public void setRarituLevel(int rarituLevel) {
        this.rarituLevel = rarituLevel;
    }
}
