package Lab4;
public class Address {
    private String street;
    private String cityTown;
    private String county;

    public Address(String street, String cityTown, String county) {
        this.street = street;
        this.cityTown = cityTown;
        this.county = county;
    }

    @Override
    public String toString() {
        return street + ", " + cityTown + ", " + county;
    }
}
