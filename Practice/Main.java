import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance you want to count vovels in: ");
        String v = sc.nextLine();
        int count = 0;
        
        for(int i = 0; i<v.length(); i++){       v = v.toUpperCase();
            if(v.charAt(i)=='A' || v.charAt(i)=='E' || v.charAt(i)=='I' || v.charAt(i)=='O' || v.charAt(i)=='U'){
                count++;
            }
        }System.out.println(count);
    }
}

