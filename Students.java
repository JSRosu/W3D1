package week3.day1;

public class Students {

	public void getStudentInfo(int ID) {
		System.out.println("Students ID : " + ID);
		
}
	
	public void getStudentInfo(int studId, String name) {
		System.out.println("Students ID of methd 2  : " + studId);
		System.out.println("NAME of student : " + name);
		
}
	
	public void getStudentInfo(String email, long phnNum) {
		System.out.println("Mail address : " + email);
		System.out.println("Contact details : " + phnNum);
		
}
	public static void main(String[] args) {
		
		Students details = new Students();
		details.getStudentInfo(12);
		details.getStudentInfo(100, "Rosu");
		details.getStudentInfo("Fedo", 9008880);

	}

}
