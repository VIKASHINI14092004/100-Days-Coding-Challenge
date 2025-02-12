/*
PROBLEM STATEMENT
Given a number N, the program must print if N is a step number or not. (A step number is a number which has a digit which is either 1 more or 1 less than the previous digit).

Input Format:
The first line contains N.

Output Format:
The first line contains yes or no

Boundary Conditions:
10 <= N <= 99999999

Input:
1212343
Output:
yes

Input:
342345
Output:
no

Explanation:
The difference between 2 and 4 is NOT 1.
*/
import java.util.*;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String str =sc.nextLine(); //getting the no as a string
int n= str.length();    
int digits[]=new int[n];  // defining an array to put the digits of the no as individual integers
int ans=0;
for(int i=0;i<n;i++)
{
digits[i]=str.charAt(i)-'0';  // using for loop to access each element of the no and storing in arr as integer after removing '0' (string null)
}
for(int i=0;i<n-1;i++) // since to no of comparisions is 1 less than n
{
if((digits[i]==digits[i+1]-1)||(digits[i]==digits[i+1]+1)) // a digit should be 1 greater than or 1 less than the previous . using 2nd elementfor comparision to avoid out of bound array err
{
ans++;
}
else
{
ans--;
}
}
if(ans==n-1)
System.out.println("yes");
else
System.out.println("no");
}
}
