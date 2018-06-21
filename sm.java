import java.util.scanner;
class demo

{

 public static void main(String…s)

 {

  int i,n,large,small;

  Scanner sc=new Scanner(System.in); //used to read from keyboard


  System.out.print(“Enter number of elements:”);

  n=sc.nextInt();

  int a[]=new int[n];


  System.out.print(“nEnter elements of Array:”);

  for(i=0;i<n;++i)

   a[i]=sc.nextInt();


  large=small=a[0];

  for(i=1;i<n;++i)

  {

   if(a[i]>large)

    large=a[i];

   if(a[i]<small)

    small=a[i];

  }


  System.out.print(“nSmallest Element:”+small);

  System.out.println(“nLargest Element:”+large);

 }

}

