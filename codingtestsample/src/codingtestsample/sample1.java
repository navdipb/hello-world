package codingtestsample;
import java.util.*;


public class sample1 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++)
			primefactors(i);
		//for (int i = -1; i < 47; i++)
			//System.out.println(i + ":" + fibiter(i) + ":" + fibrec(i));
	//hanoimove(5, 1, 3);
		//charhanoi(7, 'a', 'b', 'x');
		System.out.println("Done!");
    }

	public static void charhanoi(int n, char start, char end, char mid)
	{
		if (n<=1)
		{
			System.out.println("move top disk from " + start + " to " + end);
			return;
		}
		
		charhanoi(n-1, start, mid, end);
		charhanoi(1, start, end, mid);
		charhanoi(n-1, mid, end, start);
	}
	
	public static void hanoimove(int n, int startPole, int endPole) {
		    if (n== 0){
		      return; 
		    }
		    int intermediatePole = 6 - startPole - endPole;
		    hanoimove(n-1, startPole, intermediatePole);
		    System.out.println("Move " +n + " from " + startPole + " to " +endPole);
		    hanoimove(n-1, intermediatePole, endPole);
		  }

	private static long fibrec(int n)
	{
		if (n < 1) return -1;
		if (n == 1 || n == 2)
			return 1;
		return fibrec(n-1)+fibrec(n-2);
	}
	
	private static long fibiter(int n)
	{
		if (n < 1) return -1;
		if (n == 1 || n == 2) return 1;
		int fib1 = 1;
		int fib2 = 1;
		for (int i = 2; i <n; i++)
		{
			int temp = fib1;
			fib1 = fib2;
			fib2 = fib2+ temp;
		}
			
		return fib2;	
	}
	
	private static String strRev(String s)
	{
		char [] arr = new char [ s.length()];
		arr = s.toCharArray();
		
		for (int i = 0, j= s.length() - 1; i < j; i++, j--)
		{
			char temp;
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	
		return new String(arr);
	}
	
	private static int primefactors(int num)
	{
		int i;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		i = 2;
		if (num < 3) {
			System.out.println(num+":");
			return -1;
		}
		System.out.print(num + ":");
		while (i < num) {
			if (num%i == 0)
			{
				System.out.print(i + ",");
				if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
				else hm.put(i, 1);
				num = num / i;
			}
			else
			{
				if (i==2) i = 3;
				else i += 2;
			}
		}
		System.out.print(i);
		if (hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
		else hm.put(i, 1);
		System.out.print(" Unique Factors: ");
		
		Iterator<Map.Entry<Integer, Integer>> j;
		j = hm.entrySet().iterator();
		while (j.hasNext())
		{
			Map.Entry<Integer, Integer> me = j.next();
			System.out.print(me.getKey() + "-" + me.getValue() + ";");
		}
		System.out.println();
		return i;
	}
	
	private static void findem()
	{
		Integer [][] values = {{1,2,3}, {4,3,2}, {1,2,3}, {2,4,3}};
		System.out.println("array:"+ Arrays.deepToString(values));
	}

	private static void bubblesort()
	{
	Integer[ ] values = { 30, 12, 18, 0, -5, 72, 424, 11, 32, 42, -6, 12 };         
    int size = values.length;         
    System.out.println("Before:" + Arrays.deepToString(values));           
    for (int pass = 0; pass < size - 1; pass++) {             
    	for (int i = 0; i < size - pass - 1; i++) {                 
    		// swap if i > i+1                 
    		if (values[i] > values[i + 1])                     
    			swap(values, i, i + 1);             
    	}
        System.out.println("pass" + Integer.toString(pass) + ":" + Arrays.deepToString(values));
    }           

    System.out.println("After:" + Arrays.deepToString(values)); 
	}
	
    private static void swap(Integer[ ] array, int i, int j) {         
    	int temp = array[i];         
    	array[i] = array[j];         
    	array[j] = temp;     
    	} 
}
