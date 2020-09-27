package src.computor;

import src.words.*;

public class Main {

	public static void main(String[] args) {
		
		WordFactory bwf = new ByteWordFactory();
        //run("factorial(5) med ByteWord", new Factorial("5", bwf), bwf);
        run("sum(5) med ByteWord", new Sum("5", bwf), bwf);
		
        
        //Test så memory fungerar
		Memory smallMemory = new Memory(1024, new ByteWordFactory());
		Address a0 = new Address(0);
		Address a1025 = new Address(1025);
		System.out.println(smallMemory.read(a0));
		//System.out.println(smallMemory.read(a1025));  // Toppen denna fungerar inte.
		
	}
	
	static void run(String message, Program program, WordFactory wf) {
        System.out.println("================================");
        System.out.println(message);
        System.out.println(program);
        Computer computer = new Computer(new Memory(1024, wf));
        computer.load(program);
        computer.run();
    }

}
