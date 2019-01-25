import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class TonerFile {

    static ArrayList<Printer>pInfo = new ArrayList<Printer>();
    static ArrayList<PrinterStock>pInfo2 = new ArrayList<PrinterStock>();

   
    /**
     * reads whole excel file and all rows and columns
     * @param file
     * @throws FileNotFoundException
     */
    static void readFile(String file) throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File(file));

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();

            String[] printerArr = line.split(",");

            Printer tonerInfo = new Printer(printerArr[0], printerArr[1], printerArr[2],
                    printerArr[3], printerArr[4], printerArr[5], printerArr[6], printerArr[7]);

            PrinterStock printerStock = new PrinterStock(printerArr[1],printerArr[2], printerArr[5]);

            pInfo.add(tonerInfo);           
            pInfo2.add(printerStock);
           
        }
        scanFile.close();
        printIndex(pInfo);



    }
    
    /**
     * read stock file linked to PrinterStock class only read brand, model, and current stock
     * @param file
     * @throws FileNotFoundException
     */
    public static void readStockFile(String file) throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File(file));

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();

            String[] printerArr = line.split(",");
            
            PrinterStock printerStock = new PrinterStock(printerArr[1],printerArr[2], printerArr[5]);

            pInfo2.add(printerStock);

        }
        scanFile.close();
        printStockIndex(pInfo2);
    }

    
    /**
     * method for excel file printed
     * @param toBeDisplayed
     */
    public static void printIndex(ArrayList<Printer> toBeDisplayed) {

        int index = 0;
        //index++;
        for(int i = 1; i < toBeDisplayed.size(); i++)  {
            index++;
            System.out.println((index + " " + toBeDisplayed.get(i)).toString());
        }

    }
    
    /**
     * method for stock index
     * @param toBeDisplayed
     */
    public static void printStockIndex(ArrayList<PrinterStock> toBeDisplayed) {
    	
        int index = 0;

        for(int i = 1; i < toBeDisplayed.size(); i++) {
            index++;
            System.out.println(index + " " + toBeDisplayed.get(i));
        }
    }

}
