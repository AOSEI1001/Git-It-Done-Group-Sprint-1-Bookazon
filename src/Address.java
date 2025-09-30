/**
 * Represents a mailing address with multiple fields.
 */
public class Address {

  private String line1;
  private String line2;
  private String city;
  private String state;
  private String zip;
  private String country;

  /**
   * Constructs an Address object with all fields specified.
   *
   * @param line1   the first line of the address
   * @param line2   the second line of the address (optional)
   * @param city    the city
   * @param state   the state or province
   * @param zip     the postal code
   * @param country the country
   */
  public Address(String line1, String line2, String city, String state, String zip, String country) {
    this.line1 = line1;
    this.line2 = line2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }

  /**
   * Returns a formatted string representation of the address.
   *
   * @return the full address as a single string
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(line1);

    if (line2 != null && !line2.isEmpty()) {
      sb.append(", ").append(line2);
    }

    sb.append(", ").append(city)
      .append(", ").append(state)
      .append(" ").append(zip)
      .append(", ").append(country);

    return sb.toString();
  }
}
