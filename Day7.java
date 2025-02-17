/*
PROBLEM STATEMENT
Based on the input value of N, the program must print the pattern described below.

Input Format:
First line will contain the value of N.

Output Format:
N lines will contain the number pattern as described below with each value separated by a single space.

Boundary Conditions:
1 <= N <= 50

Input:
5

Output:
1 6 10 13 15
2 7 11 14
3 8 12
4 9
5

Input:
3

Output:
1 4 6
2 5
3
*/
import java.util.*;
public class Main{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print(i+" ");
int k=i;
int m=n;
for(int j=m;j>i;j--)
{
k=k+j;
System.out.print(k+" ");
}
System.out.println();

}
}
}
