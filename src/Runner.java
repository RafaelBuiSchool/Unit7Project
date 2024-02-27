import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PackageSimulator i = new PackageSimulator();
        System.out.println("--------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate cost of one package");
        System.out.println("2. Simulate packages");
        System.out.println("3. How package costs are calculated");
        System.out.println("4. Exit");
        System.out.print("Input: ");
        int choice = s.nextInt();
        s.nextLine();
        boolean run = true;
        while (run) {
            if (choice == 1) {
                System.out.println("-------------------------------------");
                System.out.println("Enter the zip code of the origin package: ");
                String originZipCode = s.next();
                s.nextLine();
                System.out.println("Enter the zip code of the destination package: ");
                String destinationZipCode = s.next();
                s.nextLine();
                System.out.println("Enter the weight of the package: ");
                double weight = s.nextDouble();
                System.out.println("Enter the height of the package: ");
                double height = s.nextDouble();
                System.out.println("Enter the length of the package: ");
                double length = s.nextDouble();
                System.out.println("Enter the width of the package: ");
                double width = s.nextDouble();
                System.out.println("Cost: $" + PostageCalculator.shippingCalculator(weight,length,width,height,originZipCode,destinationZipCode));
            }
            if (choice == 2) {
                System.out.println("-------------------------------------");
                System.out.println("How many packages would you Like to simulate: ");
                int numberPackages = s.nextInt();
                i.generateRandomPackages(numberPackages);
                System.out.println(i.info());
                double total = i.totalCost();
                System.out.println("Total cost of all packages: " + total);
                i.resetInfo();
            }
            if (choice == 3){
                System.out.println("-------------------------------------");
                System.out.println("How are your packages are being calculated:");
                System.out.println("1. A base of cost of $3.75 is applied and for every tenth of a pound for the weight of your package, 5 cents is added to your total cost.");
                System.out.println("2. Then the positive difference between the origin's county code(first 3 digits of the zip code) and the destination's county code is divided by 100 and then added to the total cost to determine your final cost.");
                System.out.println("3. NOTE(OVERSIZED PACKAGES)");
                System.out.println("-------------------------------------");
                System.out.println("4. If the combined sum of the length, width, and height of the package exceeds 36, 10 cents will be added to the total cost for every inch.");
                System.out.println("5. If the package's weight exceeds 40 pounds, 10 cents will be charged per tenth of a pound over the 40 pound limit. ");
            }
            if(choice == 4){
                run = false;
            }
            if(choice != 4){
                System.out.println("--------------------------------------------------");
                System.out.println("What would you like to do?");
                System.out.println("1. Calculate cost of one package");
                System.out.println("2. Simulate packages");
                System.out.println("3. How package costs are calculated");
                System.out.println("4. Exit");
                System.out.print("Input: ");
                choice = s.nextInt();
                s.nextLine();
            }

        }
    }
}