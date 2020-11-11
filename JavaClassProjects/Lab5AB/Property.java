package Lab5AB;

class Property {

    String address;
    long price;
    String description;

    public Property() {
    }

    public Property(String address, long price, String description) {
        this.address = address;
        this.price = price;
        this.description = description;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}