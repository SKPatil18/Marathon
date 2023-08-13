
public class SumOfSeries {
	public static void calculateSumOfSeries(int n)

	{
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum+(double)1/i; 
		}
		System.out.println(sum);
	}
	

}
