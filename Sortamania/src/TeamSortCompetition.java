
public class TeamSortCompetition {
	public static void main (String[] args)
	{
		int [] newarray = {14,6,9,2,8,9,11,5,24,10};
		int [] inputTenThousand = new int[10000];              
	    for (int a = 0; a < inputTenThousand.length; a++) {
	       inputTenThousand [a] = (int) (Math.random () * 1000);
	    }
		long startTime = System.nanoTime();
		System.out.print(challengeOne(newarray));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Time Taken in nanoseconds: " + totalTime);
	}
	public static double challengeOne(int[] list1)
	{
		double median = 0;
		for(int i=0;i<list1.length;i++)
		{
			for (int j = i; j > 0; j--)	
			{
				if(list1[j] < list1[j-1])
				{
					swap(list1,j,j-1);
				}
			}
		}
		median = getmedian(list1);
		return median;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	public static double getmedian(int[] list1)
	{
		double median = 0;
		if (list1.length % 2 == 1)
		{
			median = (double)list1[list1.length/2];
		}
		else
		{
			median = ((double)list1[list1.length/2] + (double)list1[(list1.length/2)-1])/2;
		}
		return median;
	}
	public static int challengeTwo(String[] list1, String find)
	{
		boolean swapped=true;
		while(swapped)
		{
			int counter=0;
			for(int i=0;i<list1.length-1;i++)
			{ 
				if(list1[i].compareTo(list1[i+1])>0)
				{
					swapstring(list1,i+1,i);
					counter++;
				}
			}
			if(counter==0)
			{
				swapped=false;
			}
		}
	}
	public static void swapstring(String[]arr,int i,int j)
	{
		String x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
}
