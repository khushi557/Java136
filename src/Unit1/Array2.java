package Unit1;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int a[]=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Element at "+i+" "+a[i]);
        }
    }
}