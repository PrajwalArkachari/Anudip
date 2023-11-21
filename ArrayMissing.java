package anudip;
import java.util.Scanner;
public class ArrayMissing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr =new int[n];
		int temp,miss;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
			System.out.println(i);
		for(int i=0;i<n-1;i++)
		{
			temp=arr[i];
//			System.out.println(temp);
			for(int j=i+1;j<n;j++)
			{
				if(temp+1==arr[j])
				{
					continue;
				}
				else
				{
					System.out.println("Missing letter "+(temp+1));
					System.exit(0);
				}
					
			}
			
		}
		
	}
}

