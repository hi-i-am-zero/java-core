package buoi4.BTVN;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        String text = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // Convert to lowercase and split into words
        String[] words = text.toLowerCase().replaceAll("[.,:]", "").split("\\s+");

        // Count occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print word count
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Capitalize first letter of each word
        StringBuilder capitalizedText = new StringBuilder();
        for (String word : text.split(" ")) {
            if (!word.isEmpty()) {
                capitalizedText.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        System.out.println("\nText with Capitalized Words:");
        System.out.println(capitalizedText.toString().trim());

        // Remove vowels from text
        String textWithoutVowels = text.replaceAll("[aeiouAEIOUáéíóúàèìòùâêîôûãõäëïöüåæç]", "");

        System.out.println("\nText Without Vowels:");
        System.out.println(textWithoutVowels);
    }
}

