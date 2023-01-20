package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter a number");
			int add1 = kb.nextInt();
			System.out.println("Enter a number");
			int add2 = kb.nextInt();
			System.out.println(add1 + " + " + add2 + " = " + (add1+add2));
		});
		randNumber.addActionListener((e) -> {
			Random rand = new Random();
			System.out.println(rand.nextInt());
		});
		tellAJoke.addActionListener((e) -> {
			System.out.println("Chicken");
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
}
