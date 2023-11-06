package FullStack;

public class BankStatementDetails {
	
	
	public static void main(String args[]) {
		BankStatement myObj=new BankStatement();
		myObj.setPassword(1234);
		System.out.println("NAME :"+myObj.Name);
		System.out.println("ACCOUNT NUMBER :"+myObj.Accno);
		System.out.println("IFSC CODE :"+myObj.Ifsccode);
		System.out.println("PASSWORD :"+myObj.getPassword());
		System.out.println("BRANCH :"+myObj.Branch);
		System.out.println("YEAR OF BIRTH :"+myObj.Dob);
	}
}
