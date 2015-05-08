/*
 * @author Kisha Tarog  
 */

public class Stats{
	private double[] arr;

	public Stats(double[] array){
		arr = array;
	}

	public double mean(){
		if (arr.length == 0)
			return 0.0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum / arr.length;
	}

	public double stdDev(){
		return Math.sqrt(variance());
	}

	public double variance(){
		if (arr.length == 0)
			return 0.0;
		double[] r = new double[arr.length];
		double mean = mean();
		for(int i = 0; i < arr.length; i++)
			r[i] = Math.pow((arr[i] - mean), 2);
		return new Stats(r).mean();
	}

}