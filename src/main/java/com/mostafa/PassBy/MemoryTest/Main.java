package com.mostafa.PassBy.MemoryTest;

public class Main {

	public static void main(String args[]) {
		start();
	}
	
	public static void start() {
		String last = "Z";

		//"A" will be initial in initial variable.
		Container container = new Container();

		//"C" will be new value for initial variable. "A" will be Garbage.
		container.setInitial("C");

		another(container,last);
		System.out.print(container.getInitial()); //B
	}
	
	public static void another(Container initialHolder, String newInitial) {
		// newInitial value will be "Z" instead of "z". Because of not assigned.
		newInitial.toLowerCase();

		//for initial variable's new value will be "B". "C" will be garbage.
		initialHolder.setInitial("B");

		// "A" will be initial value for initial variable of new container instance.
		Container initial2 = new Container();

		// initialHolder will reference initial2. So, initialHolder's initial value will be "A".
		// But original container's initial variables value remain same "B"
		initialHolder=initial2;

		System.out.print(initialHolder.getInitial()); //A
		System.out.print(newInitial); //Z
	}
	//AZB
}
