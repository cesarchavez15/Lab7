//Version 1.0.0
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Lab7 {

    public static void main(String[] args){
        double[] unitPrice = new double[2820];
        int[] quantity = new int[2820];
        double[] discount = new double[2820];
        int[] orderID = new int[2820];
        double totalPrice;

        try{

            File readFile = new File("orderDetails.txt");
            Scanner in = new Scanner(readFile);
            PrintWriter outFile = new PrintWriter("price.txt");

            for(int i = 0; i < 2820; i++){
                String str = in.nextLine();
                String[] arrOfString = str.split(",", 5);
                unitPrice[i] = Double.parseDouble(arrOfString[1]);
                quantity[i] = Integer.parseInt(arrOfString[0]);
                discount[i] = Double.parseDouble(arrOfString[4]);
                orderID[i] = Integer.parseInt(arrOfString[2]);
                totalPrice = unitPrice[i] * quantity[i] - discount[i] * 
                             quantity[i] * unitPrice[i];
                outFile.println(totalPrice);
            }
            outFile.close();
        } catch(Exception e) {

        }
    }
}