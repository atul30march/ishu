package Students;

import java.util.Scanner;

public class Student {
	String USN;
	String NAME;
	String BRANCH;
	String SEM;
	String AGE;
	String PHONE_NO;
	public Student(String usn,String name,String branch,String sem,String age,String phone_no){
		USN = usn;
		NAME =name;
		BRANCH = branch;
		SEM = sem;
		AGE = age;
		PHONE_NO = phone_no;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the totel number of Students:-");
		int n = in.nextInt();
		Student[] st = new Student[n];
		String usn,name,branch,sem,age,phone_no;
		
		for(int i =0;i<n;i++){
			System.out.println("\n Enter Details of Student:"+(i+1));
			System.out.print("USN:");
			usn = in.next();
			System.out.print("NAME:");
			name = in.next();
			System.out.print("BRANCH:");
			branch = in.next();
			System.out.print("SEM:");
			sem = in.next();
			System.out.print("AGE:");
			age = in.next();
			System.out.print("PHONE_NO:");
			phone_no = in.next();
			st[i] = new Student(usn,name,branch,sem,age,phone_no);
			
		}
		System.out.println("Student details");
		System.out.println("USN\t\t\tNAME\t\t\tBRANCH\t\t\tSEN\t\t\tAGE\t\t\tPHONE_NO");
		for(int i=0;i<n;i++){
			System.out.println(st[i].USN+"\t\t\t"+st[i].NAME+"\t\t\t"+st[i].BRANCH+"\t\t\t"+st[i].SEM+"\t\t\t"+st[i].AGE+"\t\tst[i]"+st[i].PHONE_NO);
		}
	}

}
