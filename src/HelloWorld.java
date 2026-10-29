/**
 * HelloWorld.java
 *
 * A first Java program: prints "Hello World" plus a short introduction.
 * Shows a class, the main entry point, a variable, a loop, and a method.
 */
public class HelloWorld {

    /** Entry point: the JVM starts running the program here. */
    public static void main(String[] args) {
        String name = "James"; // a String variable holding my name

        System.out.println("Hello World");
        System.out.println(greet(name));

        // A for loop that counts down before the final message
        for (int i = 3; i >= 1; i--) {
            System.out.println("Starting Java in " + i + "...");
        }
        System.out.println("Let's build something great!");
    }

    /**
     * Builds a greeting message for the given name.
     *
     * @param name the person to greet
     * @return the greeting text
     */
    static String greet(String name) {
        return "Hello from " + name + ", learning Java one program at a time!";
    }
}