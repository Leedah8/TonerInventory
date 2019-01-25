import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class Inventory implements InventoryManager, TechnicianInterface {
	
    static ArrayList<PrinterStock>pInfo = new ArrayList<PrinterStock>();
    static ArrayList<Printer>pInfo2 = new ArrayList<Printer>();

    @Override
    /*
     * (non-Javadoc)
     * @see TechnicianInterface#viewStock(java.lang.String, java.lang.String, int)
     * Have the program display All the printers and their descriptions
     * have the user type a model number
     * Then display all of that model number and their descriptions and current stock
     */
    public int viewStock(String brand, String model, int currentStock) throws IOException  {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in a Printer Model to search for that model: ");

        return currentStock;
    }

    /* (non-Javadoc)
     * @see InventoryManager#checkInventory(java.util.ArrayList)
     */
    @Override
    public void checkInventory(ArrayList<Printer> toBeDisplayed) {
        
    }

    /*
     * (non-Javadoc)
     * @see InventoryManager#updateStock(int)
     */
    @Override
    public int updateStock(int neededStock) {
        

        return neededStock;
    }

    /* (non-Javadoc)
     * @see InventoryManager#orderStock(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public String orderStock(String brand, String model, String order) {
       
        return order;
    }

}

