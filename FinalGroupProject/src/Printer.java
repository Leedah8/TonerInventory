/**
 * Printer class with properties and methods
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class Printer {
	
	private String printerModel;
	private String brand ;
	private String model;
	private String printers;
	private String minStock;
	private String curStock;
	private String order;
	private String tonerNeeded;
	private String stockBrand;
	private String stockModel;
	private String stockCurStock;
	
	/**
	 * @param printerModel
	 * @param brand
	 * @param model
	 * @param printers
	 * @param minStock
	 * @param curStock
	 * @param order
	 * @param tonerNeeded
	 */
	public Printer(String printerModel, String brand, String model, String printers, String minStock, String curStock,
			String order, String tonerNeeded) {
		
		super();
		this.printerModel = printerModel;
		this.brand = brand;
		this.model = model;
		this.printers = printers;
		this.minStock = minStock;
		this.curStock = curStock;
		this.order = order;
		this.tonerNeeded = tonerNeeded;
	}
	

	public String getPrinterModel() {
		return printerModel;
	}
	public void setPrinterModel(String printerModel) {
		this.printerModel = printerModel;
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
	public String getPrinters() {
		return printers;
	}
	public void setPrinters(String printers) {
		this.printers = printers;
	}
	public String getMinStock() {
		return minStock;
	}
	public void setMinStock(String minStock) {
		this.minStock = minStock;
		
	}
	public String getCurStock() {
		return curStock;
	}
	public void setCurStock(String curStock) {
		this.curStock = curStock;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getTonerNeeded() {
		return tonerNeeded;
	}
	public void setTonerNeeded(String tonerNeeded) {
		this.tonerNeeded = tonerNeeded;
	}
	
	@Override
	public String toString() {
		
		return "Printer [printerModel=" + printerModel + ", brand=" + brand + ", model=" + model + ", printers="
				+ printers + ", minStock=" + minStock + ", curStock=" + curStock + ", order=" + order + ", tonerNeeded="
				+ tonerNeeded + "]";
	}
	
	/**
	 * @param brand
	 * @param model
	 * @param curStock
	 */
	public Printer(String brand, String model, String curStock) {
		
		super();
		this.stockBrand = brand;
		this.stockModel = model;
		this.stockCurStock = curStock;
		
	}


	public String getStockBrand() {
		return stockBrand;
	}


	public void setStockBrand(String stockBrand) {
		this.stockBrand = stockBrand;
	}


	public String getStockModel() {
		return stockModel;
	}


	public void setStockModel(String stockModel) {
		this.stockModel = stockModel;
	}


	public String getStockCurStock() {
		return stockCurStock;
	}


	public void setStockCurStock(String stockCurStock) {
		this.stockCurStock = stockCurStock;
	}
	
	public String stockToString() {
		return "[" + " brand= " + brand + ", model=" + model + ", curStock=" + curStock + "]";
	}


	/**
	 * @param userInput
	 * @return
	 */
	public boolean contains(String userInput) {
		
		return false;
	}

}