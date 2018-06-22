package uaimail100;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}



	public double getSideA() {
		return sideA;
	}



	public void setSideA(double sideA) {
		this.sideA = sideA;
	}



	public double getSideB() {
		return sideB;
	}

	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	
	public double getSideC() {
		return sideC;
	}


	public void setSideC(double sideC) {
		this.sideC = sideC;
	}


	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}


	public double square() {
		double p = (sideA + sideB + sideC) / 2;

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
	
	public String toStringSquare() {
		
		return "Side of triangle (" + sideA + " , " + sideB + " , " + sideC + ") = " + this.square();
		}	
}
