import java .util.*;
public class Prefix_and_Suffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        String T=sc.next();
        String s=sc.next();
        boolean pref=true;
        boolean suff=true;
        for (int i=0;i<M;i++){
            if(T.charAt(i)!=s.charAt(i)){
                pref=false;
                break;
            }
            else if(T.charAt(M-N+i)!=s.charAt(M-1-i)){
                suff=false;
                break;
            }
            else{
                continue;
            }

        }
        if(pref && suff){
            System.out.print("0 ");
        }
        else if(pref){
            System.out.print("1 ");
        }
        else if(suff){
            System.out.print("2 ");
        }
        else{
            System.out.print("3 ");
        }
    }
}