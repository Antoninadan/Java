package uaimail100;

public class Main {

	public static void main(String[] args) {

		Vector3d v1 = new Vector3d(1, 2, 3);
		Vector3d v2 = new Vector3d(-2, 0, 4);

		Vector3d v3 = new Vector3d(6, 7, 10);
		Vector3d v4 = new Vector3d(8, 5, 9);

		Vector3d vAdd = new Vector3d();
		Vector3d vscalarMultiplication = new Vector3d();
		Vector3d vVectorMultiplication = new Vector3d();

		System.out.println("v1 + v2 = " + vAdd.add(v1, v2).toString());
		System.out.println("(v1, v2) = " + vscalarMultiplication.scalarMultiplication(v1, v2));
		System.out.println("[v1, v2] = " + vVectorMultiplication.vectorMultiplication(v1, v2).toString());

		System.out.println();

		System.out.println("v3 + v4 = " + vAdd.add(v3, v4).toString());
		System.out.println("(v3, v4) = " + vscalarMultiplication.scalarMultiplication(v3, v4));
		System.out.println("[v3, v4] = " + vVectorMultiplication.vectorMultiplication(v3, v4).toString());

	}

}
