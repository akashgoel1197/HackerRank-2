import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n; n=sc.nextInt();
        BigInteger f=new BigInteger("1");
           
        for(int i=1;i<=n;i++)
            { f=f.multiply(BigInteger.valueOf(i));
            
        }
        System.out.print(f);
    }
}
