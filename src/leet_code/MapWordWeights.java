package leet_code;

public class MapWordWeights {

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
            }

            int rem = sum % 26;
            char mappedChar = (char) ('z' - rem);

            result.append(mappedChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"abcd", "def", "xyz"};

        int[] weights = {
            5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7,
            8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2
        };

        MapWordWeights obj = new MapWordWeights();
        System.out.println(obj.mapWordWeights(words, weights));
    }
}