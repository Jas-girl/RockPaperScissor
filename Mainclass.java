package com.RockPaperScissor;

import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rounds");
		int rounds = sc.nextInt();
		int num = 0;
		int computer = 0;
		int compCount = 0;
		int userCount = 0;
		int i = 0;
		while (i < rounds) {
			System.out.println("Enter the 1:Paper 2:Scissor 3:Rock");
			num = sc.nextInt();
			computer = (int) (Math.random() * 3) + 1;
			System.out.println(computer);
			if (num > 3) {
				System.out.println("Invalid number");
			}

			else if (num == 1 && computer == 2 || num == 2 && computer == 3 || num == 3 && computer == 1) {
				compCount = compCount + 1;
				System.out.println("Computer win by:" + compCount + " from User:" + userCount);
			} else if (num == 1 && computer == 3 || num == 2 && computer == 1 || num == 3 && computer == 2) {
				userCount = userCount + 1;
				System.out.println("User wins" + userCount + " from Comp:" + compCount);
			} else {
				System.out.println("Draw");
			}
			i++;
		}
		;
		if (compCount > userCount) {
			System.out.println("Computer is winner");
		} else {
			System.out.println("User is the winner");
		}
	}
}
