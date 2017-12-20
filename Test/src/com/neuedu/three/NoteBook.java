package com.neuedu.three;

public class NoteBook {
	String color;
	int cpu;
	public NoteBook(String color, int cpu) {
		this.color = color;
		this.cpu = cpu;
	}
	
	public NoteBook() {
	}
	
	void printNoteBook(){
		System.out.println(this.color+" , "+this.cpu);
	}
	
	public static void main(String[] args) {
		NoteBook nb = new NoteBook("red",7);
		nb.printNoteBook();
	}
}
