package Database.Model;

/**
 *
 * @author victor
 */
public class modelAddress {
    private int idAddress;
    private String country;
    private String state;
    private String neighborhood;
    private String zipCode; 
    private String street;
    private String numberOfHouse;
    
    /**
     * @return the neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood the neighborhood to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    
    /**
     * @return the idAddress
     */
    public int getIdAddress() {
        return idAddress;
    }

    /**
     * @param idAddress the idAddress to set
     */
    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the numberOfHouse
     */
    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    /**
     * @param numberOfHouse the numberOfHouse to set
     */
    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

              
}
