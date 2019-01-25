import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author khalidahabdul-muqtadir
 * @author kayla collazo
 * @author zach muzzleman
 * @author james cooper
 *
 */
public class TestBarcode {
	
    static ArrayList<Barcode> pInfo = new ArrayList<Barcode>();
    
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
     

        try {
            readFile("printers.csv");
 
        }

        catch (IOException e) {
            System.out.println("File not found!");
        } finally {}
    }

    /**
     * @param file
     * @throws FileNotFoundException
     */
    @SuppressWarnings("unlikely-arg-type")
    static void readFile(String file) throws FileNotFoundException {
    	
    	PrintStream out = new PrintStream(new FileOutputStream("TestBarcode.json"));

        Scanner scanFile = new Scanner(new File(file));

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();

            String[] printerArr = line.split(",");

            Barcode tonerInfo = new Barcode(printerArr[0], printerArr[3], printerArr[4], printerArr[8]);

            pInfo.add(tonerInfo);
         

        }
        printIndex(pInfo); // Just prints Index

        while (true) {
        System.out.println("\nEnter a Barcode to search for a printer by campus: ");
        Scanner input = new Scanner(System.in);
        String model = input.next();
        boolean a = false;
        for(int i = 0; i < pInfo.size(); i++) {
            System.setOut(out);

            if (model.equals(pInfo.get(i).getBarcode())) {
                System.out.printf("Serial Number: %s\n",pInfo.get(i).getLocationName());
                System.out.printf("Location: %s\n",pInfo.get(i).getSerialNumber());
                System.out.printf("Campus: %s\n",pInfo.get(i).getCampusName());
                a = true;
                break;

            }

        }
        if (!a) {
            System.out.println("Printer NOT FOUND!!! Please try again!");
            continue;
        }
        break;
    }
 }

    /**
     * @param toBeDisplayed
     */
    public static void printIndex(ArrayList<Barcode> toBeDisplayed) {

        int index = 0;

        for(int i = 0; i < toBeDisplayed.size(); i++)  {
            index++;
            System.out.println((index + " " + toBeDisplayed.get(i)).toString());
        }

    }





}
