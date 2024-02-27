public class PostageCalculator {
    public static double shippingCalculator(double weight, double length, double width, double height, String originZipCode, String destinationZipCode) {
        double baseCost = 3.75;
        double addOnCost = (weight / .1) * .05;
        int originCountyCode = Integer.parseInt(originZipCode.substring(0,3));
        int destinationCountyCode = Integer.parseInt(destinationZipCode.substring(0,3));
        if (length + width + height > 36) {
            addOnCost += (length + width + height) * .1;
        }
        if (weight > 40) {
            addOnCost += ((weight - 40)/.1) * .1;
        }
        return baseCost + addOnCost + ((Math.abs(destinationCountyCode - originCountyCode)) / 100.0);
    }
    public static double shippingCalculator(double weight, double length, double width, double height, Address origin, Address destination){
        return shippingCalculator(weight,length,width,height,origin.getZipCode(),destination.getZipCode());
    }
    public static double shippingCalculator(Package i){
        return shippingCalculator(i.getWeight(),i.getLength(),i.getWidth(),i.getHeight(),i.getOriginAddress(),i.getDestinationAddress());
    }
}
