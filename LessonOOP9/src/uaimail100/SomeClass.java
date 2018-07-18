package uaimail100;

//public class SomeClass<T extends Number & Comparable<T>> {  // comma separated 
public class SomeClass<T extends Comparable<T>> {
	// private Object someField;
	private T someField;
	
	// private T someField2 = (T) new Object();  //

	public SomeClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SomeClass(T someField) {
		super();
		this.someField = someField;
	}

	public T getSomeField() {
		return someField;
	}

	public void setSomeField(T someField) {
		this.someField = someField;
	}

	@Override
	public String toString() {
		return "SomeClass [someField=" + someField + "]";
	}

}
