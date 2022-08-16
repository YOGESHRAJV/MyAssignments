package assignment4;

public class Students {
				public void getStudentInfo(int id) {
			System.out.println(id);
		}
	public void getStudentInfo(String name) {
			System.out.println(name);
		}
	public void getStudentInfo1(String email) {
		System.out.println(email);
	}
	public void getStudentInfo(long phonenumber) {
		System.out.println(phonenumber);
	}
	
	public void getStudentInfo(int id,String name,String email,long phonenumber) {
		System.out.println(id+ name+email+phonenumber);
	}
		public static void main(String[] args) {
		Students student=new Students();
		student.getStudentInfo(8044);
		student.getStudentInfo("JEES");	
		student.getStudentInfo("jees@gmail.com");
		student.getStudentInfo(9876543210l);	
		student.getStudentInfo( 8044,"JEES","jees@gmail.com",9876543210l);
	}
		

	}


