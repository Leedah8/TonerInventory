import java.io.IOException;
import java.util.ArrayList;

/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public interface TechnicianInterface {
	
    /** Checks inventory of the specific printer
     * @param inventory An object that holds the inventory of the printer
     */
    public void checkInventory(ArrayList<Printer> toBeDisplayed);

    /**
     * Views stock from the printer brand, model and it's current stock
     * @param brand An object that holds the brand name of the printer
     * @param model An object that holds the model number of the printer
     * @param currecntStock An object that holds the currentStock amount of toner
     * @return currentStock, the amount of toner that is currently in possession
     * @throws IOException
     */
    public int viewStock(String brand, String model, int currentStock) throws IOException;


}
