package pkgMain;

import javax.swing.JOptionPane;

public class CMain {
	public static void main(String[] args) {
		int touchdowns = Integer.parseInt(JOptionPane.showInputDialog("How many touchdowns?"));
		int totalYards = Integer.parseInt(JOptionPane.showInputDialog("Total yards?"));
		int interceptions = Integer.parseInt(JOptionPane.showInputDialog("How many interceptions?"));
		int completions = Integer.parseInt(JOptionPane.showInputDialog("How many completions?"));
		int attemptedPasses = Integer.parseInt(JOptionPane.showInputDialog("How many attempted passes?"));

		if (attemptedPasses < 1)
			// Gotta prevent those divide-by-zero runtime errors
			attemptedPasses = 1;

		double a = ((completions / attemptedPasses) - .3) * 5;
		double b = ((totalYards / attemptedPasses) - .3) * .25;
		double c = (touchdowns / attemptedPasses) * 20;
		double d = 2.375 - ((interceptions / attemptedPasses) * 25);

		double finalRating = ((a + b + c + d) / 6) * 100;

		System.out.println("Final Rating: " + finalRating);

	}
}
