package array;

public class Test1 {
	public static void main(String[] args) {
		 int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 		
		double sum = 0, avg = 0;
		int length = 0;
		for(int[] subArr : array) {
			length += subArr.length;
			for(int intVal : subArr) {
				sum += intVal;
			}
		}
		
		avg = sum / length;

		System.out.printf("합계 : %.1f\n", sum);
		System.out.printf("평균 : %.3f\n", avg);
	}
}
