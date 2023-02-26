package View;

import controller.controller;

public class Principal {
public static void main (String args[]) {
	controller div = new controller();
	int A = 23;
	int B = 5;
	int resto = div.resto(A, B);
	System.out.println(resto);
	
}
}
