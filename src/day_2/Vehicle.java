package day_2;

public class Vehicle {
    private int id;
    private String vehicle_number;
    private String vehicle_type;
    private String owner_name;
    private double price;
    private String manufacturing_year;

    public Vehicle(int id, String vehicle_number, String vehicle_type, String owner_name, double price, String manufacturing_year) {
        this.id = id;
        this.vehicle_number = vehicle_number;
        this.vehicle_type = vehicle_type;
        this.owner_name = owner_name;
        this.price = price;
        this.manufacturing_year = manufacturing_year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", price='" + price + '\'' +
                ", manufacturing_year='" + manufacturing_year + '\'' +
                '}';
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getManufacturing_year() {
        return manufacturing_year;
    }

    public void setManufacturing_year(String manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
