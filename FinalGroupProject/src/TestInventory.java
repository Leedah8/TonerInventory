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
public class TestInventory {
	
	static ArrayList<Printer> pInfo = new ArrayList<Printer>();
	static ArrayList<PrinterStock>pInfo2 = new ArrayList<PrinterStock>();

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
	

		try {
			readFile("WilmingtonTonerDatabase.csv");

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
		
    	PrintStream out = new PrintStream(new FileOutputStream("TestInventory.json"));


		String answer = "";
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
		printIndex(pInfo); // Just prints Index

		// This is for user input to search within file
		while(true) {
			
			System.out.println("\nEnter in a printer model to search: ");
			Scanner input = new Scanner(System.in);
			String model = input.next();
			boolean a = false;
			for(int i = 0; i < pInfo.size(); i++) {
		        System.setOut(out);

				if (model.equals(pInfo.get(i).getModel()) || model.equals(pInfo.get(i).getPrinterModel())) {
					System.out.printf("Current Stock: %s\n",pInfo.get(i).getCurStock());
					System.out.printf("Min Stock: %s\n",pInfo.get(i).getMinStock());
					System.out.printf("Order: %s\n",pInfo.get(i).getOrder());
					System.out.printf("Toner Needed: %s\n",pInfo.get(i).getTonerNeeded());
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
	public static void printIndex(ArrayList<Printer> toBeDisplayed) {

		int index = 0;

		for(int i = 1; i < toBeDisplayed.size(); i++)  {
			index++;
			System.out.println((index + " " + toBeDisplayed.get(i)).toString());
		}

	}
}
