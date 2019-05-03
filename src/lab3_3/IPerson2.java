package lab3_3;

public interface IPerson2 {
	default void myDefault() {
		System.out.println("From default method2.");
	}
	static void myStatic() {
		System.out.println("From static method2.");
	}
	abstract void myAbstract();
}
