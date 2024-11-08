public class Main {
    public static void main(String[] args) {

//EXERCISES
        int Number = 12;

        if(Number < 0){
            System.out.println("Number is negative");
        }else if(Number > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is zero");
        }


        int a = 0;
        int b = 1;
        int sum = a + b;
        for (int i = 0; i < 10; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }


        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
}