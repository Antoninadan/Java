// exceptions, my exceptions

package uaimail100;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*
		 * int a = 3; int b = 0; try { System.out.println(a / b); } catch
		 * (ArithmeticException e) { System.out.println("Division by zero"); } finally {
		 * System.out.println("But the program is still running"); }
		 * System.out.println("End");
		 */

		double a;
		for (;;) {

			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number")); // if cancel then NULL
				if (a < 0) {
					throw new NegativeValueException();
				}
				break; // exit
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Set default = 10");
				a = 10;
				break;
			} catch (NegativeValueException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			// } catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Exception");
			// }

		}
		System.out.println(a);
	}
}

// this is catch
// try ORDER!!!!!!!!!!!!!!!