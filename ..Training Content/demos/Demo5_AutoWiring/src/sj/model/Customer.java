package sj.model;

public class Customer {
	
		private Person person;
		private int type;
		private String action;
		
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		/*In autodetect,if default constr not available then 
		 *  'byConsstructor' else 'byType'
		 * public Customer() {
			super();
			// TODO Auto-generated constructor stub
			System.out.println("Default called");
		}
      */
		public Customer(Person person) {
			super();
			this.person = person;
		}

		public Customer(Person person, int type, String action) {
			super();
			this.person = person;
			this.type = type;
			this.action = action;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		
	 
		//getter and setter methods
	 
	       @Override
		public String toString() {
			return "Customer [action=" + action + ", person=" + person + 
	                          ",type=" + type + "]";
		}
	 
	
}
