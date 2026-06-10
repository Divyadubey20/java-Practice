import java.util.Scanner;
public class MaxOccuringChar {
     Scanner sc = new Scanner(System.in);
     String s=sc.nextLine();
     int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            arr[c-'a']++;
            }
        for(int i=0;i<26;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

    }
}                 