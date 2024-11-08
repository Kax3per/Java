//OPERACTION AND VARIABLES

public class Main {
    public static void main(String[] args) {

//EXERCISES
        int firstProduct = 12;
        int secondProduct = 17;
        int equal = firstProduct + secondProduct;
        System.out.println("Cost equal: " + equal);

        if (firstProduct == secondProduct) {
            System.out.println("These product is the same cost");
        } else {
            System.out.println("These product is not the same cost");
        }

        if (firstProduct % 2 == 0) {
            System.out.println("First product is even");
        }else{
            System.out.println("First product is odd");
        }

        if (secondProduct % 2 == 0) {
            System.out.println("Second product is even");
        }else{
            System.out.println("Second product is odd");
        }
    }
}