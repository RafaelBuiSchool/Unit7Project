import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PackageSimulator {
    private ArrayList<Package> packagesList;
    public PackageSimulator(){
        this.packagesList = new ArrayList<>();
    }
    public void generateRandomPackages(int numberPackages){
        for(int i = 0; i < numberPackages; i++){
            Address originAddress = randomAddress();
            Address destinationAddress = randomAddress();
            double weight =randomWeight();
            double length = randomSizes();
            double width = randomSizes();
            double height = randomSizes();
            Package x = new Package(weight,height,length,width,originAddress,destinationAddress);
            packagesList.add(x);

        }
    }
    public double totalCost(){
        double total =0;
        for(Package i: packagesList){
            total += PostageCalculator.shippingCalculator(i);
        }
        return total;
    }
    private Address randomAddress(){
        Random i = new Random();
        String houseNumber = "123";
        String streetName = "Random Street";
        String apartment = "3C";
        String city = "City";
        String state = "State";
        String zipCode = String.format("%05d",i.nextInt(100000));
        return new Address(houseNumber,streetName,apartment,city,state,zipCode);
    }
    private double randomWeight(){
        Random i = new Random();
        return i.nextDouble()*50+.1;
    }
    private double randomSizes(){
        Random i = new Random();
        return i.nextDouble()*50 +2;
    }
    public String info(){
        String information = "Randomly generated packages info:\n";
        int count = 1;
        for(Package i:packagesList){
            information += "Package " + count + ":\n"+i.toString();
            count++;
        }
        return information;
    }
    public void resetInfo(){
        packagesList.clear();
    }
}
