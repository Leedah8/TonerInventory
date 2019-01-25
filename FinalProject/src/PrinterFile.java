import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Driver that Parses our printer file that includes all printer inventory to be searched
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class PrinterFile {

    static ArrayList<AllPrinters>pInfo = new ArrayList<AllPrinters>();

    /**
     * @param file
     * @throws FileNotFoundException
     */
    static void readFile(String file) throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File(file));

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();

            String[] printerArr = line.split(",");

            AllPrinters printerInfo = new AllPrinters(printerArr[0], printerArr[1], printerArr[2],
                    printerArr[3], printerArr[4], printerArr[5], printerArr[6]);

            pInfo.add(printerInfo);
        }
        scanFile.close();
        printPrinters(pInfo);
    }
   
    /**
     * displays index for each printer in the file
     * @param toBeDisplayed
     */
    public static void printPrinters(ArrayList<AllPrinters> toBeDisplayed) {

        int index = 0;
 
        for(int i = 1; i < toBeDisplayed.size(); i++)  {
            index++;
            System.out.println((index + " " + toBeDisplayed.get(i)).toString());
        }

    }

}


