import java.util.*;
public class Linkedlist1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList a=new LinkedList();
System.out.print("Enter n value : ");
int n=sc.nextInt();
System.out.print("Enter "+n+" values : ");
for(int i=0;i<n;i++)
{
a.add(sc.nextInt());
}
System.out.println("List before deletion : "+a);
System.out.print("Enter element to be searched and deleted : ");
int b=sc.nextInt();
if(a.contains(b))
{
int c=a.indexOf(b);
a.remove(c);
System.out.println("List after deletion : "+a);
}
else
{
System.out.println("Element not found");
}
}
}

output:

Enter n value : 5
Enter 5 values : 10 20 30 40 50
List before deletion : [10, 20, 30, 40, 50]
Enter element to be searched and deleted : 30
List after deletion : [10, 20, 40, 50]

Enter n value : 5
Enter 5 values : 10 20 30 40 50
List before deletion : [10, 20, 30, 40, 50]
Enter element to be searched and deleted : 2
Element not found