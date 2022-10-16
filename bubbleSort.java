import java.util.Scanner;
class bubbleSortArr
{
    Scanner sc=new Scanner(System.in);
    public void bubbleSorta1()
    {
        int i,j,n,temp;
        System.out.println("Enter the  no of Elements ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for (i=0;i<n-1;i++)
        {
              boolean exch=false;
            for (j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    exch=true;
                }

            }
            if(exch==false)
            {
                break;
            }
        }

        System.out.println("Sorted array list");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
}




public class bubbleSort {
    public static void main(String args[])
    {
        bubbleSortArr objArr=new bubbleSortArr();
        objArr.bubbleSorta1();
    }
}
