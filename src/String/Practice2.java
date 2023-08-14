package String;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Nhập chuỗi và đếm số lần xuất hiện của chữ trong chuỗi ( không tính khoảng trắng)
public class Practice2 {
    public static void main(String [] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        a = sc.nextLine();
        System.out.println("Ket qua : " );
        Map<String, Integer> wordMap = countWord(a);
        for(String key : wordMap.keySet()) {
            System.out.println(key + " " + wordMap.get(key) + "\n");
        }

    }

    public static Map<String, Integer>countWord(String a) {
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if(a == null) {
            return wordMap;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != ' ' && a.charAt(i) != '\t' && a.charAt(i) != '\n' ) {
                sb.append(a.charAt(i));
            } else {
                addWord(wordMap,sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordMap,sb);
        return wordMap;

    }

    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if(word.length() == 0) {
            return;
        }
        if(wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word,count);
        } else {
            wordMap.put(word,1);
        }
    }
}
