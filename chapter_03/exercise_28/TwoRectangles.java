package chapter_03.exercise_28;

import java.util.Scanner;

public class TwoRectangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the center(x , y) , width and height of rectangle r2");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Witdh = input.nextDouble();
		double r1Height = input.nextDouble();
		
		System.out.println("Enter the center(x , y) , width and height of rectangle r2");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
		if(Math.pow(Math.pow(r2y - r1y, 2), 0.5) + r2Height / 2 <= r1Height / 2 && r1Height / 2 + r2Height / 2 <= r1Height
			&& Math.pow(Math.pow(r2x - r1x, 2), 0.5) + r2Width / 2 <= r1Witdh / 2 &&  r1Witdh / 2 + r2Width / 2 <= r1Witdh){
			System.out.println("r2 r1'in icindedir.");
		}else if ((r1x + r1Witdh / 2 > r2x - r2Width) ||
				 (r1y + r1Height / 2 > r2y - r2Height))
			 System.out.println("r2 and r1 are intersect ");
			 else
			 System.out.println("r2 and r1 aren't intersect.");
			
		
		
	}
}
