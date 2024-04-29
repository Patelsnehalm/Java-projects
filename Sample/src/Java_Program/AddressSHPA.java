package Java_Program;

public class AddressSHPA implements Cloneable {

	private String streetName;
	private String cityName;
	private String province;

	public AddressSHPA(String streetName, String cityName, String province) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
		this.province = province;
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "AddressSHPA [streetName=" + streetName + ", cityName=" + cityName + ", province=" + province + "]";
	}

}
