
public class Matrix {
		//Initialize Main Function
	      public static void main(String[] args) {
	    	  //Define Vars, Arrays, ETC.
	    	  PWM pwm = new PWM();
	      
	    	  char [][] sequenceIn = {						//Array with training sequences
	    		   {'A','G','T','G','T','A','A','G','T'},
	    		   {'T','T','C','G','T','A','A','G','T'},
	    		   {'A','G','G','G','T','A','A','G','A'},
	    		   {'C','A','G','G','T','G','G','G','G'},
	    		   {'G','A','G','G','T','G','A','G','T'},
	    		   {'A','C','G','G','T','A','A','C','T'},
	    		   {'C','T','C','G','T','A','A','G','T'},
	    		   {'T','A','A','G','T','A','A','G','C'},
	    		   {'C','T','G','G','T','G','G','G','T'},
	    		   {'C','A','G','G','T','G','A','G','G'}
	       		};
	    	  
	    	  //Call Processing from the PWM class
	    	  pwm.Freq(sequenceIn);							//Process the frequency of bases
	    	  pwm.PWMatrix(sequenceIn);						//Process the values of base in new matrix
	    	  pwm.printPWM();								//Print the weight matrix
	    	  System.out.println("\n");						//Space for reading ease
	    	  pwm.LogOdd();									//Process the log-odd scores
	       
	    	  pwm.getScore("CGTGAGGAA");					//Compute and print the score of this sequence
	    	  pwm.getScore("ACCGTCGAC");					//Compute and print the score of this sequence
	}
}
