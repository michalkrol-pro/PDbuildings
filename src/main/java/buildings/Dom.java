package buildings;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dom {
    String city;
    int area;
    double pricePerMeter;
    int rooms;
    int windows;
    boolean garage;
    boolean garden;
    boolean gym;


    public double getFullPrice() {
        return area * pricePerMeter * 0.95;
    }
    public  double getFullPriceNormalPrice (){return area*pricePerMeter;}

}