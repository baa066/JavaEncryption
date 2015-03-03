
public class PWM {
	//Initialize the new tables
	private double [][] pTable ;												//Probability table
	private double [][] oTable;													//Log-odds table
	
	public PWM() {																//Weight matrix table
		this(4,9) ;
			
	}
	
	public PWM(int row , int column) {											//Initialize Prob and Odds table
		pTable = new double [row][column];
		oTable = new double [row][column] ;
	}
	
	public void Freq(char[][] list)	{
		for(int pRow = 0 ; pRow < pTable.length ; pRow++) {					//Runs through probability table
			for(int listCol = 0 ; listCol < list[0].length ; listCol++)	{		//Runs through new list
				for(int listRow = 0 ; listRow < list.length ; listRow++) {		//Runs through new list
					if(pRow == 0 && list[listRow][listCol] == 'A') {				//Runs through probability of base A
						pTable[pRow][listCol]++ ;
					}
					if(pRow == 1 && list[listRow][listCol] == 'C') {				//Runs through probability of base C
						pTable[pRow][listCol]++ ;
					}
					if(pRow == 2 && list[listRow][listCol] == 'G') {				//Runs through probability of base G
						pTable[pRow][listCol]++ ;
					}
					if(pRow == 3 && list[listRow][listCol] == 'T') {				//Runs through probability of base T
						pTable[pRow][listCol]++ ;
					}
				}
			}
		}
	}
	
	public void PWMatrix(char[][] list)	{													//Stores new list into weight matrix
		for(int row = 0 ; row < pTable.length ; row++) {
			for(int col = 0 ; col < pTable[0].length ; col++) {
				pTable[row][col] = ((pTable[row][col] +.1 )/(list.length + .4)) ;
			}
		}
		this.logOdd(list) ;
	}
	
	private void logOdd(char[][] list) {														//Calculates Log-Odds
		for(int row = 0 ; row < oTable.length ; row++) {
			for(int col = 0 ; col < oTable[0].length ; col++) {
				oTable[row][col] = Math.log( pTable[row][col] / .25 ) / Math.log(2)  ;
			}
		}
	}
	
	public void getScore(String seq) {									//Compute score of the two sequences
		double score = 0.0 ; 
		char base ;
		for(int i = 0 ; i < seq.length() ;i++) {
			base = seq.charAt(i);
			if(base == 'A') {
				score += oTable[0][i];
			}
			else if( base == 'C') {
				score += oTable[1][i];
			}
			else if( base == 'G') {
				score += oTable[2][i];
			}
			else {
				score += oTable[3][i];
			}
		}
		
		System.out.printf("\n%s%7.3f\n","The score of sequence: " + seq + " is equal to: ",score) ;
	}
	
	public void printPWM() {													//Print weight table
		for(int row = 0 ; row < pTable.length ; row++) {
			System.out.print("(");
			for(int col = 0 ; col < pTable[row].length ; col++) {
				System.out.printf("%7.3f ",pTable[row][col]);
			}
			System.out.print(")\n");
		}
	}
	
	public void LogOdd() {													//Print Log-Odds table
		for(int row = 0 ; row < oTable.length ; row++){
			System.out.print("(");
			for(int col = 0 ; col < oTable[row].length ; col++){
				System.out.printf("%7.3f", oTable[row][col]);
			}
			System.out.print(")\n");
		}
	}
			
}
