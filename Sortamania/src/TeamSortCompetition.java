
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
	public static double challengeOne(int[] arr)
	{
		double median = 0;
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i; j > 0; j--)	
			{
				if(arr[j] < arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
		median = getmedian(arr);
		return median;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	public static double getmedian(int[] arr)
	{
		double median = 0;
		if (arr.length % 2 == 1)
		{
			median = (double)arr[arr.length/2];
		}
		else
		{
			median = ((double)arr[arr.length/2] + (double)arr[(arr.length/2)-1])/2;
		}
		return median;
	}
	public static int challengeTwo(String[] arr, String query)
	{
		boolean swapped=true;
		while(swapped)
		{
			int counter=0;
			for(int i=0;i<arr.length-1;i++)
			{ 
				if(arr[i].compareTo(arr[i+1])>0)
				{
					swapstring(arr,i+1,i);
					counter++;
				}
			}
			if(counter==0)
			{
				swapped=false;
			}
		}		
		return binarySearch(arr, query);
	}
	public static int binarySearch(String[] arr, String query) {
	    int low = 0;
	    int high = arr.length - 1;
	    int mid;

	    while (low <= high) {
	        mid = (low + high) / 2;

	        if (arr[mid].compareTo(query) < 0) {
	            low = mid + 1;
	        } else if (arr[mid].compareTo(query) > 0) {
	            high = mid - 1;
	        } else {
	            return mid;
	        }
	    }

	    return -1;
	}
	public static void swapstring(String[]arr,int i,int j)
	{
		String x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	
}
