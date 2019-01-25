
/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class AllPrinters {
	
	private String Barcode;

	private String description ;

	private String categoryName;

	private String locationName ;

	private String serialNumber;

	private String manufacturerName;

	private String division;
	

	/**
	 * @param Barcode
	 * @param description
	 * @param categoryName
	 * @param locationName
	 * @param serialNumber
	 * @param manufacturerName
	 * @param division
	 */
	public AllPrinters(String Barcode, String description, String categoryName, 

			String locationName, String serialNumber, String manufacturerName, String division) {

		super();


		this.Barcode = Barcode;

		this.description = description;

		this.categoryName = categoryName;

		this.locationName = locationName; 

		this.serialNumber = serialNumber;

		this.manufacturerName = manufacturerName;

		this.division = division;
		
	}

	@Override
	public String toString() {
		return "Printer [barcode=" + Barcode + ", description=" + description + ", categoryName=" + categoryName
				+ ", locationName=" + locationName + ", serialNumber=" + serialNumber + ", manufacturerName="
				+ manufacturerName + ", division=" + division + "]";
	}
	
	public String getBarcode() {
		
		return Barcode;
	}

	public void setBarcode(String Barcode) {
		this.Barcode = Barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}


	/**
	 * @param userInput
	 * @return
	 */
	public boolean contains(String userInput) {
		
		return false;
	}

}
