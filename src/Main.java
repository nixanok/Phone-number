import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] numbers = new String[4];
        for(int i = 0; i < numbers.length; i+= 1) {
            numbers[i] = scanner.nextLine();
        }

        for(int i = 0; i < numbers.length; i+= 1) {
            numbers[i] = numbers[i].replaceAll("[+()-]", "");

            if(numbers[i].length() > 10) {
                numbers[i] = numbers[i].substring(1, 11);
            }

            if(numbers[i].length() == 7){
                numbers[i] = "495" + numbers[i];
            }
        }

        for(int i = 1; i < numbers.length; i+= 1) {
            if(numbers[0].equals(numbers[i])) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }

}
