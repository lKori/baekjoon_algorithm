package Silver;

import java.io.*;
import java.util.*;

public class Q_1181 {
    // 첫번째 풀이법
    public static void bubbleSort(ArrayList<String> words) {
        Collections.sort(words);

        int count = words.size() - 1;

        while(true) {
            int changed = 0;

            for(int i = 0; i < count; i++) {
                String currentWord = words.get(i);
                String nextWord = words.get(i + 1);

                // 현재 단어가 다음 단어보다 길다면 자리 바꾸기
                if(currentWord.length() > nextWord.length()) {
                    Collections.swap(words, i, i + 1);
                    changed++;
                }
            }

            // 만약 바뀐 요소가 없다면 정렬 완료이므로 while문 탈출
            if(changed == 0 || count == 1) {
                return;
            } else {
                count--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            bw.write(br.readLine());
            bw.close();
        } else {
            // Set으로 받아 중복요소 없애기
            Set<String> setWords = new HashSet<>();

            for(int i = 0; i < n; i++) {
                setWords.add(br.readLine());
            }
            // Set -> ArrayList로 변환
            ArrayList<String> words = new ArrayList<>(setWords);

            bubbleSort(words);

            for(int k = 0; k < words.size(); k++) {
                bw.write(words.get(k) + "\n");
            }

            bw.close();
        }
    }

// 두번째 풀이(Arrays.sort() lambda 사용
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        String[] words = new String[n];
//
//        for(int i = 0; i < n; i++) {
//            words[i] = br.readLine();
//        }
//
//        Arrays.sort(words, (word1, word2) -> {
//            // 만약 길이가 같다면 사전순으로 비교
//            if(word1.length() == word2.length()) {
//                return word1.compareTo(word2);
//            } else {
//                // 양수일 경우에만 자리가 바뀌므로 word1이 짧으면 음수 반환, 길면 양수 반환
//                return word1.length() - word2.length();
//            }
//        });
//
//        for(int i = 0; i < words.length - 1; i++) {
//            if(!words[i].equals(words[i + 1])) {
//                bw.write(words[i] + "\n");
//            }
//        }
//
//        bw.write(words[words.length - 1]);
//
//        bw.close();
//    }
}
