package nl.sander.mieras.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import nl.sander.mieras.regex.USRegexPatterns;

public class Person extends USRegexPatterns{
	
	@NotNull(message = "First name may not be null")
    @Pattern(regexp=ALPHABET_UPPER_LOWERCASE, message = "First name has invalid characters")
	private String first_name;
	
	@NotNull(message = "Last name may not be null")
	@Pattern(regexp=ALPHABET_UPPER_LOWERCASE, message = "Last name has invalid characters")
	private String last_name;
	
	@NotNull(message = "Company name may not be null")
	private String company_name;
	
	@NotNull(message = "Address name may not be null")	
	private String address;
	
	@NotNull(message = "City name may not be null")
	@Pattern(regexp=VALID_CITY, message = "City has invalid characters")
	private String city;
	
	private String county;
	
	@NotNull(message = "Sate name may not be null")
	@Size(min=2,max=2, message = "State does not contain minimum 2 characters and maximum 2 characters")
	@Pattern(regexp=VALID_US_STATES, message = "State has invalid characters")
	private String state;
	
	@NotNull(message = "Zip name may not be null")
    @Size(min=5,max=5, message = "Zip does not contain minimum 5 characters and maximum 5 characters")
    @Pattern(regexp=VALID_US_ZIP)
	private String zip;
	
	@NotNull(message = "Phone1 name may not be null")
	@Pattern(regexp=VALID_US_PHONENUMBER, message = "Phone1 has invalid characters")
	private String phone1;	
	
	@Pattern(regexp=VALID_US_PHONENUMBER, message = "Phone2 has invalid characters")
	private String phone2;
		
	@NotNull(message = "Email name may not be null")
	@Pattern(regexp=VALID_EMAIL, message = "Email has invalid characters")
	private String email;
	
	@NotNull(message = "Web name may not be null")
	@Pattern(regexp=VALID_URL, message = "Web has invalid characters")
	private String web;	
	
	@Override
	public String toString() {
		return "first_name=" + first_name + ", last_name=" + last_name
				+ ", company_name=" + company_name + ", address=" + address + ", city="
				+ city + ", county=" + county + ", state=" + state + ", zip=" + zip
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", email=" + email
				+ ", web=" + web + "]";
	}

	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhone1() {
		return phone1;
	}
	
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	
	public String getPhone2() {
		return phone2;
	}
	
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getWeb() {
		return web;
	}
	
	public void setWeb(String web) {
		this.web = web;
	}
}
