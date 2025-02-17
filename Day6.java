/*
PROBLEM STATEMENT
An array of N numbers is passed as input. The program must print all the LEADERS in the array. A number is a LEADER if it is greater than all the numbers to it's right.
Note: The rightmost number is always a leader.

Input Format:
The first line contains N numbers, each separated by a space.

Output Format:
The first line contains the LEADERS, each separated by a space.

Boundary Conditions:
1 <= N <= 9999

Input:
10 17 4 3 5 2

Output:
17 5 2
*/

import java.util.*;
public class Main
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
String s =sc.nextLine();
String []ar=s.split(" ");
int arr[]=new int[ar.length];
int n=ar.length;
for(int k=0;k<n;k++)
{
arr[k]=Integer.parseInt(ar[k]);
}
for(int i=0;i<n;i++)
{
int count=0;
for(int j=i+1;j<n;j++)
{
if(arr[i]<arr[j])
{
count++;
break;
}
}
if(count==0)
{
System.out.print(arr[i]+" ");
}
}
}
}
