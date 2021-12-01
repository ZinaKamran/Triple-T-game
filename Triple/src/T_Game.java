import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class T_Game {

public static void main(String args[]) {
	
	Scanner input=new Scanner(System.in);
	JOptionPane.showMessageDialog(null, "WELCOME TO THIS GAME PLAYERS ");

	// set player 1 
	String player1;
	System.out.print("First player please Enter your name: ");
	
	player1= JOptionPane.showInputDialog(null, "First player please Enter your name: ");
	System.out.print(player1);
	if(player1.equals("")) {
		player1= JOptionPane.showInputDialog(null, "First player please" +"\n"+"Enter your name Again: ");
		JOptionPane.showMessageDialog(null, "First player Your name is : "+player1);

	}
	if(player1.equals("")) {
		System.out.println("player1");
		JOptionPane.showMessageDialog(null, "First player Your name is : player1");

	}
	else {
	System.out.println();
	}	
	
	// player 2
	String player2;
	System.out.print("Second player please Enter your name: ");
	player2= JOptionPane.showInputDialog(null,"Second player please Enter your name: ");

	System.out.print(player2);
	
    if (player2.equals("")) {
    	player2= JOptionPane.showInputDialog(null,"Second player please " +"\n"+ "Enter your name Again: ");	
    	System.out.println(player2);
    	JOptionPane.showMessageDialog(null, "Second player Your name is : " +player2);

    	if (player2.equals("")) {
    		JOptionPane.showMessageDialog(null, "First player Your name is : player");

    }
    }
    else {
	System.out.println();
	}

    // Rolling
    
    
    JOptionPane.showMessageDialog(null, "NOW ROLL YOUR DICES"
    +"\n"+
    "And let's see"
    +"\n"+
    "Who Is gonna take the first turn");
    JOptionPane.showMessageDialog(null, player1+" , select OK in order to roll!");
    int first_roll= (int)(12*Math.random()+1);
	System.out.println("first player rolled: " + first_roll);
	
    JOptionPane.showMessageDialog(null, player2+" , select OK in order to roll!");
	int second_roll=(int)(12*Math.random()+1);
	System.out.println("second player rolled: " + second_roll);
	
	if (first_roll>=second_roll) {
		System.out.println("It is "+player1+" who is gonna start the game.");
		JOptionPane.showMessageDialog(null, player1+" X is Your Symbol" +
		"\n"+player2+ " O is Your Symbol");
		}
	else{ 	
		System.out.println("It is "+player2+" who is gonna start the game.");
	    JOptionPane.showMessageDialog(null, player1+" X is Your Symbol" +
			"\n"+player2+ " O is Your Symbol");
	}
	
	
	
	
	
    print_Board_Game();
	
    }



	public static void print_Board_Game() {
	
	System.out.print("Enter the size of your Game Board: ");
	Scanner input=new Scanner(System.in);

	int p=input.nextInt();
		
	
	String[][] arr = new String[p][p];
	String width="+----";
	String rep=width.repeat(p);
	int count= 1;
	for (int i=0; i<p; i++) {
	System.out.println(rep);
	
    for (int j=0; j< p;j++) {
    System.out.format("| %2d " , count++); 
    if (j==p-1) { 
	System.out.print("|");
	arr[i][j] = ""+count;
	}
    }
    System.out.println("");
    if (i==p-1) {
    System.out.println(rep);
    }
    }
	JOptionPane.showMessageDialog(null," Enjoy Your Playing");
	}
	
	
    }
