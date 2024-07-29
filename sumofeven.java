import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        int n=y.nextInt();
        int x[]=new int [n];
        int i;
        int sum=0;
        for(i=0;i<n;i++)
        {
            x[i]=y.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]>0)
            {
                if(x[i]%2==0)
                {
                    sum+=x[i];
                }
            }
        }
        if(sum>0)
        {
            System.out.println("Pappu, the Diary Milk is yours! The sum of even numbers in the array is "+sum+".");
        }
        else
        {
            System.out.println("Sorry Pappu, no Diary Milk this time. There are no even numbers in the array.");
        }
        
    }
}
