package assignment1;
import java.util.Scanner;

public class a1 {
	/* 
	Instructions - Assessed Exercise 1
	- This exercise tests the things you've learnt in the first week of the semester.
	- Add your code to this file, leaving the main method unchanged except to call your methods.
	- Add all of your methods *below* the main method, in question order.
	- Each of the tasks involves writing a single method. You do not need to add additional main methods.
	- The total number of marks is 22.
	- Read the instructions for each task *carefully*.
	- Submit a single .java file on moodle by the deadline (details on moodle).
	- Your java file must be called AE1_<yourguid>.java
	- You do not need to add any additional import lines.
	- Everything you need to do these tasks is covered in the week 1 lectures and slides.
	- You do not need to perform error checking unless explicitly requested in the task.
	*/
	
	/*
	Non task-specific marks:
	 - Add a comment with your name and GUID here - [1 mark]
	 - Clear code commenting [1 mark]
	 - Use of correct Java variable and method naming conventions [1 mark]
	*/
	



	public static void main(String[] args) {

		/*
		 * EXAMPLE TASK:
		 * 
		 * This code here demonstrates how you should answer the questions. You will be
		 * asked to create code to perform certain tasks. It is important that you leave
		 * this main method unmodified, except for where you need to call the methods
		 * that you create.
		 * 
		 * So, if I asked you to create a method called helloWorld that will print the
		 * following line: 'hello world!' you should do the following: create the method
		 * body below the main method as shown, and call it from main as below.
		 */
	
//		helloWorld();
	
		/*
		 *  Now, please make a start on the following tasks below:
		 *  Reminder, you are supposed to work on this assessment on your own, to test your
		 *  own understanding and to strengthen your problem solving skills.
		 */
		
		
		/*
		 * TASK 1: (2 marks)
		 * 
		 * Create a method called 'task1' to calculate the area of a rectangle and call it from main
		 * here. The method will not specify any input parameters. Within the method, use a scanner to 
		 * capture user input. The user should be prompted for both the length and width of the rectangle.
		 * 
		 * Note that the length and width of the rectangle can be specified to 2 decimal places.
		 * Once entered, calculate the area and print it to the screen.
		 * 
		 */
	
		/*
		 * TASK 2: (3 marks)
		 * 
		 * Create a method called 'task2' that will take two integer input parameters, max and number. The
		 * method should print out the total number of values (not the values themselves) 
		 * between 1 and max (inclusive) that satisfy the following conditions:
		 *  
		 * The value must be odd, and the value must be a factor of number.
		 * 
		 * Your main method must pass in max = 99. For example, if I passed in 
		 * the parameters task2(99, 39) the output should be 4.
		 */
	
		/*
		 * TASK 3: (3 marks)
		 * 
		 * Create a method called 'task3' that will take an int parameter and assign it to the variable
		 * 'challenge'. This method will play out a table top game at the console. The
		 * idea is that players roll a 20-sided dice and indicate what they got in the
		 * terminal. 
		 * 
		 * You are not being asked to program the dice roll, you can assume
		 * the user will simply input a number between 1 and 20.
		 * 
		 * The game plays out over a series of rounds. On each round, the player should
		 * be prompted for input specifying what they rolled. If the player rolls higher
		 * than the challenge, then they are successful in attacking the monster, and
		 * the monster will lose 1 hit point. If the player rolls less than or the value
		 * of challenge, they are not successful.
		 * 
		 * If the player is not successful, the monster will attack. When the player
		 * fails for the first time the monster will miss and the player will not lose a
		 * hit point. However, on the second failed attempt onwards, the monster will
		 * always be successful and the player will lose a hit point.
		 * 
		 * The game continues until either the player or the monster lose all their hit
		 * points. Both the player and the monster should start with 3 hit points.
		 * 
		 * You must use a while loop in this code. The input parameter (challenge) should 
		 * be set to 10.
		 */
	
		/*
		 * TASK 4: (6 marks)
		 * 
		 * Create a method 'task4' that will take an integer as an input parameter. This value will
		 * be used in a guessing game where the user is to input a series of guesses, to
		 * try and guess the number held by the method, which is the input parameter.
		 * 
		 * Each time the player guesses, they are to be prompted for input. An example
		 * of expected input can be seen below:
		 * 
		 * 16 97
		 * 
		 * Each time the player guesses, they are to input 2 numbers, separated by a
		 * single space. Your method should take both of these guesses, and determine
		 * which value is closer to the secret number. Your method should ensure that
		 * exactly 2 guesses are entered. If not, it should print an error message.
		 * 
		 * If either of the guesses are correct, then the player wins. Otherwise they
		 * are presented with some console output, telling them how far away they are,
		 * which is to be calculated based on which guess was the closest of the two.
		 * 
		 * The output the user should see must be formatted, with '0' being used as
		 * padding. The readout should be 3 characters long. Therefore, if the secret
		 * number is 364, and the user enters 4 300 as their guess, the readout must be
		 * exactly:
		 * 
		 * You are 064 away from the secret number!
		 */
		
		/*
		 * TASK 5: (5 marks)
		 * 
		 * Create a method 'task5' that will take 2 int parameters rows and columns. This method will create 
		 * a table on the console output, representing the game of mine sweeper. The aim of this task
		 * is to illustrate to the player where all the mines are on the board, such as what occurs in 
		 * the standard 'game over' screen for mine sweeper. 
		 * 
		 * The method should accept values between 5 and 10 for the rows and columns, however it is not
		 * required that the value of rows should match the value of columns.
		 * 
		 * The minimum value that must be entered for the rows and columns is 5, and the maximum is 10. Your method 
		 * should check this. If ok, then the method will continue, otherwise it should print out an error message.
		 * 
		 * The method should print a header for the table, labelling the columns, beneath, a separator as shown in the example.
		 * The method should then populate the table, using the character 'o' to represent clear cells and
		 * the character 'x' to represent mines. Each row should also be labelled as 1, 2, 3, etc.
		 * 
		 * The mines are to be specified with 2 int values, x,y such that x represents the row position, and 
		 * y represents the column position. Your method must specify three mines.
		 * 
		 * You are expected to use String.format() in this task, to format the table.
		 * The cells should be padded to a length of 3 with no unnecessary information to pad the cells.
		 * (i.e. no occurrences of for example, XoX or OoO)
		 * 
		 * If for example, the table was specified with having 10 rows and 6 columns, and
		 * the 3 mines were specified at 3,4 and 1,5 and 6,6 your table must look *exactly* like this:
		 * 
	
	|  1  2  3  4  5  6
	|  -  -  -  -  -  -
	1 |  o  o  o  o  x  o
	
	2 |  o  o  o  o  o  o
	
	3 |  o  o  o  x  o  o
	
	4 |  o  o  o  o  o  o
	
	5 |  o  o  o  o  o  o
	
	6 |  o  o  o  o  o  x
	
	7 |  o  o  o  o  o  o
	
	8 |  o  o  o  o  o  o
	
	9 |  o  o  o  o  o  o
	
	10 |  o  o  o  o  o  o
		 */
		
		/*
		 * PLACE YOUR METHOD CALLS HERE
		 */
//		task1();
//		task2(99,39);
//		task3(10);
//		task4(50);
		task5(10,6);
}


	/*
	 * EXAMPLE METHOD
	 */
	private static void helloWorld() {
		System.out.println("hello world!");
	}
	
	/*
	 * PLACE YOUR METHODS HERE
	 */
	public static void task1() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Task 1");
		System.out.println("Enter Height: ");
		double height=s.nextDouble();//input height
		s.nextLine();
		System.out.println("Enter width: ");
		double width=s.nextDouble();//input width
		s.nextLine();
		System.out.printf("Area for task 1= %.2f\n",height*width);//print area
//		s.close();
	}
	
	public static void task2(int max, int number) {
		System.out.println("Task 2");
		int count=0;
		for(int i=1; i<=max;i++) {
			if((i%2!=0) &&(number%i==0)) count++;//increasing count
		}
		System.out.println("Count for task2 is:"+ count);
	}
	
	public static void task3(int para) {
		System.out.println("Task 3");
		int challenge=para;//declare challenge
		int monsterPoint=3, playerPoint=3;//initialize points
		Scanner a=new Scanner(System.in);
		System.out.println("Enter number between 1 and 20");
		int side=a.nextInt();//take input
		a.nextLine();
		if(side<1 || side >20) {
			System.out.print("Error, Enter number between 1 and 20");
			side=a.nextInt();//take input
			a.nextLine();
		}
		if(side>challenge) {//initial round
			monsterPoint--;
			System.out.println("Monster hit");
			System.out.println("Monster hit point: " +monsterPoint);
			System.out.println("Player hit point: " +playerPoint);
		}
		else {
			System.out.println("Monster missed");
			System.out.println("Monster hit point: " +monsterPoint);
			System.out.println("Player hit point: " +playerPoint);
		}
		while((monsterPoint >0) && (playerPoint>0)) {//round 2 onwards
			System.out.println("Enter number");
			side=a.nextInt();
			a.nextLine();
			if(side<1 || side >20) {
				System.out.print("enter number between 1 and 20");
				continue;
			}
			if(side>challenge) {
				monsterPoint--;
				System.out.println("monster hit");
				System.out.println("Monster hit point: " +monsterPoint);
				System.out.println("Player hit point: " +playerPoint);
			}
			else {
				playerPoint--;
				System.out.println("Player hit");
				System.out.println("Monster hit point: " +monsterPoint);
				System.out.println("Player hit point: " +playerPoint);
			}
		}
		if(monsterPoint==0) System.out.println("You Won!");//print if win
		else System.out.println("Game Over! You Lost");//print if lose
//		a.close();
	}
	
	public static void task4(int number) {
		System.out.println("Task 4");
		int held=number;//initialize number held by computer
		int guess1,guess2;// declare guesses
		boolean correct=false;
		Scanner s=new Scanner(System.in);
		while(!correct) {
			System.out.println("Enter 2 guesses");
			guess1=s.nextInt();
			guess2=s.nextInt();
			String A=s.nextLine();
//			System.out.println("A: "+ A);
			if(A!="") {//if not entering exactly 2 guesses
				System.out.println("Error");
				continue;
			}
			if(guess1==held || guess2==held) {//check guesses
				System.out.println("Win");
				break;
			}
			if((guess1-held) > (guess2-held)) {
				System.out.printf("You are %03d away from the secret number!\n", Math.abs(guess2-held));//display difference
			}
			else System.out.printf("You are %03d away from the secret number!\n", Math.abs(guess1-held));//display difference
		}
//		s.close();
	}
	
	public static void task5(int row, int coloumn) {
		System.out.println("Task 5");
		boolean correct=true;
		
		
		if((row<5) ||(coloumn<5)) {
			System.out.println("Error");//check whether row or column are less than 5 and print error
			correct=false;
			if((row>10) || (coloumn>10)) {
				System.out.println("Error");
				correct=false;
			}
		}

		while(correct) {
			header(coloumn);//creating header
			for(int i=1;i<=row;i++) {
				System.out.printf("%d | ",i);// creating label
				for(int j=1;j<=coloumn;j++) {
					check(i,j);//checking to put mines at x,y coordinates
				}
				System.out.print("\n\n");
			}
			correct=false;
		}
	}
	public static void header(int coloumn) {
		System.out.print("|  ");
		for(int i=1;i<=coloumn;i++) {
			System.out.printf(" %d ",i);
		}
		System.out.print("\n");
		System.out.print("|  ");
		for(int i=1;i<=coloumn;i++) {
			System.out.printf(" - ");
		}
		System.out.print("\n");
	}
	public static void check(int row, int coloumn) {
		int m1x,m2x,m3x;
		int m1y,m2y,m3y;
		m1x=1;
		m1y=5;
		m2x=3;
		m2y=4;
		m3x=6;
		m3y=6;
		String mine="x";
		String Nmine="o";
		if(row==m1x) {
			if(coloumn==m1y) System.out.printf("%3s",mine);
			else System.out.printf("%3s",Nmine);
		}
		else if (row==m2x) {
			if(coloumn==m2y) System.out.printf("%3s",mine);
			else System.out.printf("%3s",Nmine);
		}
		else if (row==m3x) {
			if(coloumn==m3y) System.out.printf("%3s",mine);
			else System.out.printf("%3s",Nmine);
		}
		else System.out.printf("%3s",Nmine);
	}
	
}
	
	
	