package uaimail100;

public class ExtraStudentInGroupException extends Exception {
		String who;
	
		public ExtraStudentInGroupException() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public ExtraStudentInGroupException(String who) {
			super();
			this.who = who;
		}


		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "Extra student for Group: " + who;
		}

		
	}