/*PROBLEM STATEMENT
Given an array and a threshold value find the output.
Input: {5,8,10,13,6,2}
Threshold = 3
Output count = 17

Explanation:
Number          Parts               Counts
5                {3,2}                 2
8               {3,3,2}                3
10             {3,3,3,1}               4
13            {3,3,3,3,1}              5
6                {3,3}                 2
2                 {2}                  1

Input Format
N - no of elements in an array
Array of elements
Threshold value

Output Format
Display the count

Sample Input 1
6
5 8 10 13 6 2
3

Sample Output 1
17*/

import java.util.*;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int arr[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int d;
int t=sc.nextInt();
for(int i=0;i<n;i++)
{
d=arr[i];
while(d>=t)
{
d=d-t;
count++;
}
if(d>0)
count++;
}
System.out.println(count);
}
}


