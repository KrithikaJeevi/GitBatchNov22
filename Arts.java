package org.edu;


public class Arts extends Education{

@Override
public void ug() {
		System.out.println("Course name is B.E ECE");	
	}	
@Override
public void pg(String course) {
	System.out.println("Course name is "+course);   
}
private void bsc() {
	System.out.println("BSC");
}
private void bEd() {
System.out.println("B.ED");
}
private void bBa() {
System.out.println("BBA");
}
public static void main(String[] args) {
Arts a = new Arts();
a.ug();
a.pg("M.E");

	}

}
