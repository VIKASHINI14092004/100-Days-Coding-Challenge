/*
PROBLEM STATEMENT:
A positive integer N is passed as the input. If we print all the numbers from 1 to N continuously, the program must find the number of characters (digits) C printed and print the count C as the output.

Input Format:
The first line contains N.

Output Format:
The first line contains C.

Boundary Conditions:
1 <= N <= 9999999

Input:
2
Output:
2
Explanation:
We print 12 and hence the total number of characters is 2.

Input:
15 
Output:
21
Explanation:
We print 123456789101112131415 and hence the total number of characters is 21.
*/

//First Approach
import java.util.*;
public class Main
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
    int j=i;
    while(j>=1)
    {
        count++;
        j=j/10;
    }
}
System.out.println(count);
}
}

//Second Approach
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count += Integer.toString(i).length();  // Count digits in `i`
        }

        System.out.println(count);
    }
}

