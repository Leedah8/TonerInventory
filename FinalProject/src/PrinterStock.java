/**
 * Class for printer stock methods and properties
 * @author khalidahabdul-muqtadir
 * @author kaylacollazo
 * @author zachmuzzleman
 * @author jamescooper
 *
 */
public class PrinterStock {

	private String brand;
	private String model;
	private String curStock;
	
	/**
	 * @param brand
	 * @param model
	 * @param curStock
	 */
	public PrinterStock (String brand, String model, String curStock) {
		super();
		
		this.brand = brand;
		this.model = model;
		this.curStock = curStock;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCurStock() {
		return curStock;
	}

	public void setCurStock(String curStock) {
		this.curStock = curStock;
	}

	@Override
	public String toString() {
		return "[brand=" + brand + ", model=" + model + ", curStock=" + curStock + "]";
	}
}
