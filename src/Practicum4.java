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
		
		if(1 <= m && m <= k && k <= n){
			double[] coins = new double[n];
			
			for(int i = 0; i < coins.length; i++){
				coins[i] = Math.random();
			}
			
			int countHeads = 0;
			
			for(int i = 0; i < coins.length; i++){
				if(coins[i] < .5){
					coins[i] = 0;
				}
				else{
					coins[i] = 1;
					countHeads++;
				}
			}
			
			
			
		}
		else{
			System.out.println("invalid entry");
			
			
		}
		
		input.close();
		
	}
}
