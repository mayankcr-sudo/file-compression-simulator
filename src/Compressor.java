public class Compressor {

    public String compress(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char current = input.charAt(i);
            int count = 1;

            while (i + count < input.length() && input.charAt(i + count) == current) {
                count++;
            }

            result.append(current).append(count);
            i += count;
        }

        return result.toString();
    }

    public String decompress(String compressed) {
        if (compressed == null || compressed.isEmpty()) {
            return compressed;
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < compressed.length()) {
            char ch = compressed.charAt(i);
            i++;

            StringBuilder numStr = new StringBuilder();
            while (i < compressed.length() && Character.isDigit(compressed.charAt(i))) {
                numStr.append(compressed.charAt(i));
                i++;
            }

            int count = Integer.parseInt(numStr.toString());
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
