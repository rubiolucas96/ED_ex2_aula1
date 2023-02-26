package controller;

public class controller {
public controller(){
	super();
	
}
public int resto(int A,int B) {
	if (A < B) {
		return A;
		
	}
	else {
	
	return resto (A - B, B);
}
}
}
