/*PROBLEM STATEMENT:

Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.

Input Format
Input contains the array size, no of elements and the window size

Output Format
Print the maximum of numbers

Constraints
1 <= size <= 1000                        

Sample Input 1
8
1 3 5 2 1 8 6 9
3

Sample Output 1
5 5 5 8 8 9
*/




import java.util.*;
public class Main{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int n = sc.nextInt(); //array size
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();  // arr as input
}
int k=sc.nextInt();   // window size
int i=0;             // initial index of window
while(i<n-k+1)       // each time window moves the i will increase but upto last move,
{                   // it would have icreased upto only n-k+1 indexes 
int Max=0;          // for each move max is 0
int j=i;            
while(j<k+i)        // for each slide k(size)which is used as last index of each slide will increament a 
{                   // value equal to i(k=k+i)
if(arr[j]>=Max)
{
Max=arr[j];         // max value of each slide is found 
}
j++;
}
System.out.print(Max+" ");
i=i+1;              // initial index is incremented (if it increases by 1 then k is also same by 1 so k=k+i)
}
}
}
