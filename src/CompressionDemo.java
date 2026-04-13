import java.util.Scanner;

public class CompressionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compressor compressor = new Compressor();

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        String compressed = compressor.compress(input);
        String decompressed = compressor.decompress(compressed);

        System.out.println("\nOriginal String   : " + input);
        System.out.println("Compressed String : " + compressed);
        System.out.println("Decompressed String: " + decompressed);

        if (input.equals(decompressed)) {
            System.out.println("\nVerification: SUCCESS - Decompressed string matches original.");
        } else {
            System.out.println("\nVerification: FAILED - Strings do not match.");
        }

        scanner.close();
    }
}
