import buildings.*;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment a1 = new Apartment("Warsaw", 80, 7540,5,20,true,true,true);
        Apartment a2 = new Apartment("Cracow", 30, 10000,2,8,true,false,true);
        Apartment a3 = new Apartment("Gdansk", 80, 6540,4,18,false,false,false);

        List<Apartment> apartmentList = new ArrayList<>(Arrays.asList(a1, a2, a3));

        double totalApartmentsPrice = 0;
        for (Apartment a : apartmentList) {
            totalApartmentsPrice += a.getFullPrice();
            System.out.println(String.format("Apartment in %s costs %.2f i ma %s pokoi", a.getCity(), a.getFullPrice(), a.getRooms()));
            System.out.println("Apartament w "+ a.getCity()+" kosztuje bez zniżki "+ a.getFullPriceNormalPrice()+"zł");
        }
        System.out.println("/................./");

        double averagePrice = totalApartmentsPrice / apartmentList.size();
        System.out.println(String.format("Average apartment price is %.2f", averagePrice));
        System.out.println("////////////////");
        System.out.println("________________");

        Bliźniak b1 = new Bliźniak("Warsaw",80,6000,5,22,true,false,false);
        Bliźniak b2 = new Bliźniak("Cracow", 75,5500,4,18,false,true,false);
        Bliźniak b3 = new Bliźniak("Gdansk",65,5900,3,10,true,false,false);

        List<Bliźniak> bliźniakList= new ArrayList<>(Arrays.asList(b1,b2,b3));

        double totalBliźniakPrice = 0;
        for (Bliźniak a : bliźniakList) {
            totalBliźniakPrice += a.getFullPrice();
            System.out.println(String.format(" Bliżniak in %s costs %.2f i ma %s pokoi", a.getCity(),a.getFullPrice(),a.getRooms()));
            System.out.println(" Bliźniak w "+a.getCity()+" kosztuje bez zniżki "+a.getFullPriceNormalPrice()+"zł");
        }
        System.out.println("/................./");
        double averageBliźniakPrice = totalBliźniakPrice / bliźniakList.size();
        System.out.println(String.format("Average Bliźniak price is %.0f zł",averageBliźniakPrice));
        System.out.println("////////////////");
        System.out.println("________________");

        Blok c1 = new Blok("Warsaw",75,5900,4,8,false,false,true);
        Blok c2 = new Blok ("Cracow", 70,5750,5,10,true,false,false);
        Blok c3 = new Blok ("Wroclaw", 65,5000,3,9,false,true,true);

        List<Blok> blokList = new ArrayList<>(Arrays.asList(c1,c2,c3));
        double totalBlokPrice = 0;
        for (Blok a : blokList){
            totalBlokPrice += a.getFullPrice();
            System.out.println(String.format("Blok in %S cost %.2f i ma %s pokoi", a.getCity(),a.getFullPrice(),a.getRooms()));
            System.out.println(String.format("Blok w %s kosztuje bez zniżki %.2f zł",a.getCity(),a.getFullPriceNormalPrice()));
        }
        double averageBlokPrice = totalBlokPrice/blokList.size();
        System.out.println(String.format("Average Blok Price is %.2f zł",averageBlokPrice));
        System.out.println("////////////////");
        System.out.println("________________");

        Dom d1 = new Dom("Warsaw",100,8000,6,18,true,true,false);
        Dom d2 = new Dom ("Cracow", 90,7000,5,15,false,false,true);
        Dom d3 = new Dom ("Wroclaw", 85,6500,4,14,true,false,false);
        List <Dom> domList = new ArrayList<>(Arrays.asList(d1,d2,d3));
        double totalPriceDom = 0;
                for (Dom a : domList){
                    totalPriceDom += a.getFullPrice();
                    System.out.println(String.format("Dom in %s cost %.2f zł i ma %s pokoi",a.getCity(),a.getFullPrice(),a.getRooms()));
                    System.out.println(String.format("Dom w %s kosztuje bez zniżki %.2f", a.getCity(),a.getFullPriceNormalPrice()));
                }
                double averageDomPrice = totalPriceDom / domList.size();
        System.out.println(String.format("Average Dom price is %.2f zł",averageDomPrice));
        System.out.println("////////////////");
        System.out.println("________________");

        Willa w1 = new Willa ("Warsaw",200,12000,9,30,true,true,true);
        Willa w2 = new Willa ("Cracow",150,10000,7,17,true,true,false);
        Willa w3 = new Willa ("Gdansk", 170,8000,10,20,true,true,false);
        List <Willa> willaList = new ArrayList<>(Arrays.asList(w1,w2,w3));
        double totalWillaPrice = 0;
            for (Willa a : willaList){
            totalWillaPrice += a.getFullPrice();
           System.out.println(String.format("Willa in %s cost %.2f i ma %s pokoi",a.getCity(),a.getFullPrice(),a.getRooms()));
            System.out.println(String.format("Willa w %s kosztuje bez zniżki %.2f zł",a.getCity(), a.getFullPriceNormalPrice()));

        }
        double averageWillaPrice = (totalWillaPrice/willaList.size());
        System.out.println(String.format("Average Willa costs %.2f zł",averageWillaPrice));




    }
}
