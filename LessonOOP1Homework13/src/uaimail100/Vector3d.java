package uaimail100;

public class Vector3d {
	private double x1;
	private double x2;
	private double x3;

	public Vector3d() {
		super();
	}

	public Vector3d(double x1, double x2, double x3) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public static double scalarMultiplication(Vector3d v1, Vector3d v2) {
		return (v1.getX1() * v2.getX1() + v1.getX2() * v2.getX2() + v1.getX3() * v2.getX3());
	}

	public Vector3d add(Vector3d v1, Vector3d v2) {
		Vector3d result = new Vector3d(v1.getX1() + v2.getX1(), v1.getX2() + v2.getX2(), v1.getX3() + v2.getX3());
		return result;
	}

	public Vector3d vectorMultiplication(Vector3d v1, Vector3d v2) {
		double r11 = v1.getX2() * v2.getX3();
		double r21 = v2.getX2() * v1.getX3();

		double r12 = v1.getX1() * v2.getX3();
		double r22 = v2.getX1() * v1.getX3();

		double r13 = v1.getX1() * v2.getX2();
		double r23 = v2.getX1() * v1.getX2();

		Vector3d result = new Vector3d(r11 - r21, -r12 + r22, r13 - r23);
		return result;
	}

	@Override
	public String toString() {
		return "[" + x1 + ", " + x2 + ", " + x3 + "]";
	}

}
