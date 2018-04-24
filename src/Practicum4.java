import java.util.Scanner;


public class Practicum4 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many fair coins have been flipped?");
		int n = input.nextInt();
		
		System.out.println("How many coins have resulted in heads?");
		int m = input.nextInt();
		
		System.out.println("How many coins are you curious about?");
		int k = input.nextInt();
		
		double[] coins = new double[n];
		
		for(int i = 0; i < n; i++){
			coins[i] = Math.random();
		}
		
		int countHeads = 0;
		
		for(int i = 0; i < n; i++){
			if(coins[i] < .5){
				coins[i] = 0;
			}
			else{
				coins[i] = 1;
				countHeads++;
			}
		}
		
		
	}
}
