import java.util.Scanner;
public class Array {
    // 1st way
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,};
        System.out.println("a");

        for(int i=0;i<a.lenth;i++){
            System.out.println(a[i]+" ");
        }

        // 2nd way
        Scanner sc=new Scanner(System.in);
        int b[]=new int[5];
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt()
        }   
            
    }
    
}
