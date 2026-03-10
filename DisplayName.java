public class DisplayName {
    public static void main(String[] args) {
        // Check if arguments exist to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // Access the first argument and concatenate
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Default value if no name is provided
            System.out.println("Hello, World!");
        }
    }
}