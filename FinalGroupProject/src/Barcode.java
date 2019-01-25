
/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class Barcode {

	private String Barcode;
	
	private String locationName;
	
	private String serialNumber;
	
	private String campusName;
	
	
	@Override
	public String toString() {
				
		return "Barcode [Barcode=" + Barcode + ", locationName=" + locationName + ", serialNumber=" + serialNumber
				+ ", campusName=" + campusName + "]";
	}

	public String getBarcode() {
		return Barcode;
	}

	public void setBarcode(String barcode) {
		Barcode = barcode;
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

	public String getCampusName() {
		return campusName;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	/**
	 * @param Barcode
	 * @param locationName
	 * @param serialNumber
	 * @param campusName
	 */
	public Barcode(String Barcode, String locationName, String serialNumber, String campusName) {
		
		this.Barcode = Barcode;
		
		this.locationName = locationName; 

		this.serialNumber = serialNumber;
		
		this.campusName = campusName;
		
	}
}
