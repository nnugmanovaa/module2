package module2.task2.exs4;

public class Colony {
    private String name;
    private int smetPrice;
    private int apCount;
    Apartment[] aparts;

    public Colony(String name, int smetPrice, int apCount, Apartment[] aparts) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts = aparts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmetPrice() {
        return smetPrice;
    }

    public void setSmetPrice(int smetPrice) {
        this.smetPrice = smetPrice;
    }

    public int getApCount() {
        return apCount;
    }

    public void setApCount(int apCount) {
        this.apCount = apCount;
    }

    public Apartment[] getAparts() {
        return aparts;
    }

    public void setAparts(Apartment[] aparts) {
        this.aparts = aparts;
    }

//    public double getSmalestColonyByItPrice(){
//        List<Double> prices =  new ArrayList<>();
//        for (Apartment apartment: aparts){
//            if(apartment.getType().equalsIgnoreCase("Cyberbricks")) prices.add(apartment.getSmet() * smetPrice * 1.5);
//            else if (apartment.getType().equalsIgnoreCase("Carbonpanel")) prices.add(apartment.getSmet() * smetPrice * 0.8);
//            else prices.add((double) (apartment.getSmet() * smetPrice));
//        }
//        return Collections.min(prices);
//    }
//    public int getApartmentPrice(String type, int smet) {
//        double price = smetPrice * smet;
//
//        if (type.equals("Cyberbricks")) {
//            price *= 1.5; // Квартиры Cyberbricks дороже на 50%
//        } else if (type.equals("Carbonpanel")) {
//            price *= 0.8; // Квартиры Carbonpanel дешевле на 20%
//        }
//
//        return (int) price;
//    }

}
