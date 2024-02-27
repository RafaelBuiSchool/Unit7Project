public class Package {
    private double weight;
    private double height;
    private double length;
    private double width;
    private Address originAddress;
    private Address destinationAddress;
    public Package(double weight, double height, double length, double width, Address originAddress, Address destinationAddress){
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Address getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(Address originAddress) {
        this.originAddress = originAddress;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }
    public String toString() {
        return "Origin Address: " + originAddress +"\nDestination Address: " + destinationAddress +"\nWeight: " + weight + "\nHeight: " + height + "\nLength: " + length + "\nWidth: " + width+"\nCost: $ " + PostageCalculator.shippingCalculator(this) + "\n---------------------------------\n";
    }


}
