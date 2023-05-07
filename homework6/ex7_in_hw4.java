import java.util.Arrays;
import java.util.Scanner;

public class ex7_in_hw4 {
    public static void main(String[] args) {
        try {
            int numOfOp;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter size Of Array :");
            int sizeOfArray = scan.nextInt();
            if (sizeOfArray < 0) {
                throw new Exception("Must be size > 0"); // throw
            }
            String[] elements = new String[sizeOfArray];
            while (true) {
                System.out.println("" +
                        "1-Accept elements of an array\n" +
                        "2-Display elements of an array\n" +
                        "3-Search the element within array\n" +
                        "4-Sort the array\n" +
                        "5-To Stop");

                numOfOp = scan.nextInt();
                if (numOfOp < 0 || numOfOp > 5) {
                    throw new Exception("must be select from menu"); //throw
                }
                System.out.println("_________________");
                if (numOfOp == 1) {
                    System.out.println("Enter element:");
                    for (int i = 0; i < elements.length; i++) {
                        System.out.println("Element " + i);
                        elements[i] = scan.next();

                    }

                }
                if (numOfOp == 2) {
                    for (String element : elements) {
                        System.out.println(element);
                    }

                }
                if (numOfOp == 3) {
                    System.out.println("Enter element you want search");
                    String serch = scan.next();
                    if (!serch.equals(serch.toLowerCase())) {
                        throw new Exception("all letter must be lower case"); //throw
                    }
                    boolean found = false;
                    for (String element : elements) {
                        if (element.equals(serch)) {
                            System.out.println("Found " + element);
                            found = true;
                            break;
                        }

                    }
                    if (!found) {
                        System.out.println("not found" + serch);
                    }
                }
                if (numOfOp == 4) {
                    Arrays.sort(elements);
                    System.out.println(Arrays.toString(elements));

                }
                if (numOfOp == 5) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("try again");
        }
    }

}