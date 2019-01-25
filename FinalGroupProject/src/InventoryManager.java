import java.util.ArrayList;

/**
 * Inventory interface which contracts our users to check, update and orderStock
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public interface InventoryManager {
	 
    public void checkInventory(ArrayList<Printer> toBeDisplayed); 

 
    public int updateStock(int neededStock);

   
    
    public String orderStock(String brand, String model, String order);

}
