package classwork2;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double userPrice;

    public InvoiceItem(String id, String desc, int qty, double userPrice){
        this.id =id;
        this.desc=desc;
        this.qty=qty;
        this.userPrice=userPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(double userPrice) {
        this.userPrice = userPrice;
    }

}
