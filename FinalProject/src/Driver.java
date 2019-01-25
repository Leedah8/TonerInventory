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
public class Driver {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        TonerFile tonerStock = new TonerFile();
        PrinterFile printerFile = new PrinterFile();
        printerFile.readFile("printers.csv");
        System.out.print("\n ----------------------------------\n");
        tonerStock.readStockFile("WilmingtonTonerDatabase.csv");
        System.out.print("\n ----------------------------------\n");
        tonerStock.readFile("WilmingtonTonerDatabase.csv");

    }
}
