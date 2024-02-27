public class Address {

    private String houseNumber;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;
    public Address(String houseNumber,String streetName, String apartmentNumber, String city, String state, String zipCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address i){
        this.houseNumber = i.houseNumber;
        this.streetName = i.streetName;
        this.apartmentNumber = i.apartmentNumber;
        this.city = i.city;
        this.state = i.state;
        this.zipCode = i.zipCode;
    }
    public Address(String address){
        String[] splitAddress = address.split(", ");
        String[] addressDetails = splitAddress[0].split(" ");
        String[] stateZip = splitAddress[2].split(" ");
        houseNumber = addressDetails[0];
        streetName = addressDetails[1];
        for(int i = 2; i < addressDetails.length-1;i++){
            if(!addressDetails[i].equals("Apt")){
                streetName += " " + addressDetails[i];
            }
            else{
                apartmentNumber = addressDetails[i+1];
                break;
            }
        }
        city = splitAddress[1];
        state = stateZip[0];
        zipCode = stateZip[1];

    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String toString(){
        return houseNumber + " " + streetName + " Apt " + apartmentNumber + ", " + city + ", " + state + " " + zipCode;
    }
}
