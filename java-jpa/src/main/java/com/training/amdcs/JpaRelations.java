package com.training.amdcs;

public class JpaRelations {
	
	
	
	public static void main(String args[]) {
		CrudOperations op = new CrudOperations();
		//op.insertEntity();
		//op.updateEntity();
		//op.findGrade("B+");
		//op.removeEntity();
		op.removeStudentWithGrade("D");
	}

}