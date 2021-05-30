import java.util.*;
import java.lang.*;

class Main{       
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        Integer a = null;
        Integer b = null;
        Integer c = null;
        for (int i=0;i<n;i++){
            if (a==null){
                a = arr[i];
            }else if (b==null){
                if (a!=arr[i]){
                    b = arr[i];
                }
            }else if (c==null){
                if (a!=arr[i] && b!=arr[i]){
                    c = arr[i];
                }
            }else{
                if ((arr[i]>a || arr[i]>b || arr[i]>c) && (arr[i]!=a && arr[i]!=b && arr[i]!=c)){
                    if (a<b && a<c){
                        a = arr[i];
                    }else if (b<a && b<c){
                        b = arr[i];
                    }else{
                        c = arr[i];
                    }
                }
            }
        }
        if (a==null || b==null || c==null){
            if (a==null){
                if (b==null){
                    System.out.println(c);
                }else if (c==null){
                    System.out.println(b);
                }else{
                    System.out.println(Math.max(b,c));
                }
            }else if (b==null){
                if (c==null){
                    System.out.println(a);
                }else{
                    System.out.println(Math.max(a,c));
                }
            }else{
                System.out.println(Math.max(a,b));
            }
        }else{
            System.out.println(Math.min(Math.min(a,b),c));
        }
    }           
}
