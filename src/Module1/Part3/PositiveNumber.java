package Module1.Part3;


public class PositiveNumber {
    public static void main(String[] args){
        int i = 0, j;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (j = 1; j<=10; j+=2) {
            System.out.println(j);
            if (j == 7){
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
