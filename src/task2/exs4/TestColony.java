package task2.exs4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestColony {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int cheapestApartmentPrice = Integer.MAX_VALUE;

        List<Colony> colonyList =  new ArrayList<>();

        for(int i =0; i< number; i++){
            String name = scanner.next();
            int smetPrice = scanner.nextInt();
            int apCount =  scanner.nextInt();
            Apartment[] apartments = new Apartment[apCount];

            for ( int j=0; j< apCount; j++){
                String title = scanner.next();
                int  smet = scanner.nextInt();
                String type = scanner.next();

                Apartment apartment = new Apartment(title,smet,type);
                apartments[j] = apartment;
            }
            Colony colony = new Colony(name, smetPrice, apCount, apartments);
            colonyList.add(colony);
        }
        String smllestAppartmenytName = " ";
        int smallestPriceofTheAppartemnt= Integer.MAX_VALUE;
        String smallestColonyName= " ";

        for( Colony colony : colonyList){
            for(Apartment apartment: colony.aparts){
                if(apartment.calculatePrice(colony.getSmetPrice()) < smallestPriceofTheAppartemnt){
                    smallestPriceofTheAppartemnt = apartment.calculatePrice(colony.getSmetPrice());
                    smllestAppartmenytName = apartment.getTitle();
                    smallestColonyName = colony.getName();
                }
            }
        }

        System.out.println(smallestColonyName +" " + smallestPriceofTheAppartemnt +" "+  smllestAppartmenytName);

//        for(Colony colony : colonyList){
//            int apartmentPrice = colony.getApartmentPrice(, colony.getSmetPrice());
//            System.out.println(colony.getFInalPriceOfTheColony());
//
//            if (apartmentPrice < cheapestApartmentPrice) {
//                cheapestApartmentPrice = apartmentPrice;
//                cheapestApartmentCity = name;
//            }
//        }
    }
}
