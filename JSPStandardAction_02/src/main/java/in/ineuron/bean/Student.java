package in.ineuron.bean;

public class Student {
	
	static {
		System.out.println("Student .class file is loading....");
	}
	
	public Student() {
		System.out.println("Student object is created...");
	}

		private Integer sId;
		private String sName;
		private String sAddress;
		private Integer sAge;
		public Integer getsId() {
			System.out.println("getsId");
			return sId;
		}
		public void setsId(Integer sId) {
			System.out.println("setsId");
			this.sId = sId;
		}
		public String getsName() {
			System.out.println("getsName");
			return sName;
		}
		public void setsName(String sName) {
			System.out.println("setsName");
			this.sName = sName;
		}
		public String getsAddress() {
			System.out.println("getsAddress");
			return sAddress;
		}
		public void setsAddress(String sAddress) {
			System.out.println("setsAddress");
			this.sAddress = sAddress;
		}
		public Integer getsAge() {
			System.out.println("getsAge");
			return sAge;
		}
		public void setsAge(Integer sAge) {
			System.out.println("setsAge");
			this.sAge = sAge;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Student: id:"+sId+",Name:"+sName+",Address:"+sAddress+",Age:"+sAge+"";
		}
		
		
}
