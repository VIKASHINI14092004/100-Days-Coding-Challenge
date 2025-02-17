/*
PROBLEM STATEMENT
N integer values (positive, zero or negative) are passed as input to the program. The program must print the values of the integers (in the order of occurrence) which are greater than all the previous values. 

Input Format:
The first line will contain N.
The second line will contain the N integer values, with the values separated by a space.

Output Format:
The first line will contain the integer values which are greater than all the previous values separated by a space.

Boundary Conditions:
2 <= N <= 10000

Input:
4
3 -5 8 1

Output:
3 8

Explanation:
3 is the first number and printed. After that 8 is printed as it is greater than 3 and -5.

Input:
12
1 2 5 7 19 20 12 11 9 15 45 45

Output:
1 2 5 7 19 20 45
*/
import java.util.*;
public class Main
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
} 
for(int i=0;i<n;i++)
{
if(i==0)
{
System.out.print(arr[i]+" ");
}
else
{
int count=0;
for(int j=0;j<i;j++)
{

if(arr[i]<=arr[j])
count++;
}
if(count==0)
System.out.print(arr[i]+" ");
}
}
}
}

