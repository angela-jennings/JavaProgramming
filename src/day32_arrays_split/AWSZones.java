package day32_arrays_split;
import java.util.*;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deployment of etsy app to AWS zones-----");
        String[] newZones = zones.split(",");
        System.out.println(Arrays.toString(newZones));
        for(String each : newZones){
            System.out.println("Deploying [" + app + "] " + each);
        }





    }
}
