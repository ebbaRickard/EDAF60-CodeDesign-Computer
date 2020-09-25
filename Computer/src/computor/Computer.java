package src.computor;
public class Computer {
	private Program p;
	private Memory m;
	
	public Computer(Memory m) {
		this.m = m;
	}
	public void load(Program p) {
		this.p = p;
	}
	public void run() {
		
	}
}
