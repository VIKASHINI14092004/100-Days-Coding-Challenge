/*
PROBLEM STATEMENT
Given a number, convert it into corresponding alphabet.

Input                 Output
1                        A
26                       Z
27                       AA
676                      YZ

Input Format
Input is an integer

Output Format
Print the alphabets

Constraints
1 <= num <= 4294967295

Sample Input 1
26

Sample Output 1
Z
*/

import java.util.*;
public class Main
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
long n=sc.nextLong();
StringBuilder ans = new StringBuilder();
while(n>0)
{   
    int var1=(int)n%26;
    ans.append((char)(64+var1));
    n=n/26;
}
System.out.println(ans.reverse().toString());
}
}
