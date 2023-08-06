package sovedoc_arena.grand_arena_1;

import java.io.*;
import java.util.StringTokenizer;

public class Q_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for(int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        int m = Integer.parseInt(br.readLine());
        String[] answers = new String[m];

        for(int j = 0; j < m; j++) {
            String a = br.readLine();
            boolean hasWord = false;

            for(int o = 0; o < words.length; o++) {
                if(words[o].equals(a)) {
                    hasWord = true;

                    break;
                }
            }

            if(!hasWord) {
                answers[j] = a;
            } else {
                answers[j] = "";

            }
        }

        if(n == 1) {
            bw.write(answers[0]);
        } else {
            for(int k = 0; k < words.length; k++) {
                if(words[k].equals("?")) {
                    if(k == 0) {
                        String end = String.valueOf(words[k + 1].charAt(0));

                        for(int p = 0; p < answers.length; p++) {
                            if(answers[p].endsWith(end)) {
                                bw.write(answers[p]);

                                break;
                            }
                        }

                        break;
                    } else if(k == words.length - 1) {
                        String start = String.valueOf(words[k - 1].charAt(words[k - 1].length() - 1));

                        for(int p = 0; p < answers.length; p++) {
                            if(answers[p].startsWith(start)) {
                                bw.write(answers[p]);

                                break;
                            }
                        }

                        break;
                    } else {
                        String start = String.valueOf(words[k - 1].charAt(words[k - 1].length() - 1));
                        String end = String.valueOf(words[k + 1].charAt(0));

                        for(int p = 0; p < answers.length; p++) {
                            if(answers[p].startsWith(start) && answers[p].endsWith(end)) {
                                bw.write(answers[p]);

                                break;
                            }
                        }

                        break;
                    }
                }
            }
        }

        bw.close();
    }
}
