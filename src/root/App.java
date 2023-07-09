package root;

import polimophism.DefaultClass;
import polimophism.Employee;
import polimophism.SalesMan;

public class App {
	public static void main(String[] args) {

		int marks[][][] = new int[2][2][2];

		marks[0][0][0] = 1;
		marks[0][0][1] = 2;
		marks[0][1][0] = 3;
		marks[0][1][1] = 4;
		marks[1][0][0] = 5;
		marks[1][0][1] = 6;
		marks[1][1][0] = 7;
		marks[1][1][1] = 8;

		for (int row = 0; row < marks.length; row++) {
			for (int col = 0; col < marks[row].length; col++) {
				for (int cell = 0; cell < marks[row][col].length; cell++) {
					System.out.print(marks[row][col][cell]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
// Physics theory / practical
// Chemistry theory / practical
// Boilogy theory / practical