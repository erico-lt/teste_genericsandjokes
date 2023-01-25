import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void copy(List<? extends Number> initial, List<? super Number> finali) {
        for(Number obj: initial) {
            finali.add(obj);
        }
    }

    public static void printList(List<?> list) {
        for(Object obj: list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(10, 20, 5);
        List<Double> myDoubls = Arrays.asList(20.5, 10.3, 2.2);
        List<Object> myObjs = new ArrayList<>();       
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubls, myObjs);
        printList(myObjs);       
       
        /*
         * String path = "C:\\Users\\premi\\OneDrive\\Documentos\\products.txt";
         * List<Products> list = new ArrayList<>();
         * 
         * try(BufferedReader br = new BufferedReader(new FileReader(path))) {
         * String line = br.readLine();
         * while(line != null){
         * String[] row = line.split(",");
         * list.add(new Products(row[0], Double.parseDouble(row[1])));
         * line = br.readLine();
         * }
         * 
         * for(Products product: list) {
         * System.out.println(product.toString());
         * }
         * System.out.println();
         * System.out.println("MOST EXPENSIVE");
         * Products mostExpen = CalculationService.max(list);
         * System.out.println(mostExpen.toString());
         * 
         * }catch (IOException e ) {
         * e.printStackTrace();
         * }
         * 
         * /*
         * Scanner sc = new Scanner(System.in);
         * PrintService<Integer> printService = new PrintService<>();
         * 
         * System.out.print("Quanto numeros quer digitar? ");
         * Integer quant = sc.nextInt();
         * 
         * for(int cont = 1; cont <= quant; cont ++) {
         * Integer item = sc.nextInt();
         * printService.addItem(item);
         * }
         * 
         * printService.print();
         * System.out.println();
         * System.out.println("First number: " + printService.first());
         * 
         * sc.close();
         */
    }
}
