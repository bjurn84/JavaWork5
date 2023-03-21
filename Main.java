import java.util.*;

public class Main {

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */


        public static void main(String[] args) {
                String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
                collectStats(text);
        }

        static void collectStats(String text) {
                String[] splitText = text.split(" ");
                Map<Integer, List<String>> stats = new HashMap<>();
                for (String s : splitText) {
                        if (!stats.containsKey(s.length())) {
                                stats.put(s.length(), new ArrayList<>());
                        }
                        stats.get(s.length()).add(s);
                }
                for (List<String> s : stats.values()) {
                        System.out.println(s);
                }
        }
}
