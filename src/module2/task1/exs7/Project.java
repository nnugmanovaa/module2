package module2.task1.exs7;

public class Project {
    private String name;
    private int cost;
    private String type;
    private boolean isGovermental;

    public Project(String name, int cost, String type, boolean isGovermental) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovermental = isGovermental;
    }

    public int getCostWithDiscount(String specType) {
        if (type.equals(specType)) {
            return (int) (cost * 0.8); // Apply 20% discount for the specified type
        }
        return cost;
    }
}
