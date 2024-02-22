package project2;

public abstract class LibraryItem {
    private int id;
    private String name;
    private boolean isAvailable;

    private ItemType  itemType;

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
