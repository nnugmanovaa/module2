package project2.entities.items;

import project2.enums.ItemType;

public abstract class LibraryItem {
    private int id;
    private String name;
    private boolean isAvailable;

    private ItemType itemType;

    public LibraryItem(){}

    public LibraryItem(int id, String name, boolean isAvailable, ItemType itemType) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.itemType = itemType;
    }

    public void displayDetails(){
        System.out.printf("Id: %d, Name: %s, isAvailable: %s \n", this.id, this.name, this.isAvailable);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", itemType=" + itemType +", ";
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
