/*
*https://www.hackerrank.com/challenges/diagonal-difference
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiagonalDiff {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		int sum1 = 0;
		int sum2 = 0;
		int extra = 0;
		int result = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			for (int j = 0; j < N; j++){
				extra = Integer.parseInt(st.nextToken());
				if (i == j){
					sum1 += extra;
				}
				if (i+j == N-1){
					sum2 += extra;
				}
			}
		}
		result = Math.abs(sum1 - sum2);
		System.out.println(result);

	}

}
