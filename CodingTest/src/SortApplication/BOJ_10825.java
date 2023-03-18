package SortApplication;

import java.util.*;
import java.io.*;

public class BOJ_10825 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static class student implements Comparable<student> {

        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(student other) {
            if (korean != other.korean) return other.korean - korean;
            if (english != other.english) return english - other.english;
            if (math != other.math) return other.math - math;
            return name.compareTo(other.name);
        }
    }

    static int N;
    static student[] stu;

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        stu = new student[N];

        for (int i = 0; i < N; i++) {
            stu[i] = new student();
            st = new StringTokenizer(br.readLine(), " ");
            stu[i].name = st.nextToken();
            stu[i].korean = Integer.parseInt(st.nextToken());
            stu[i].english = Integer.parseInt(st.nextToken());
            stu[i].math = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        Arrays.sort(stu);
        for (int i = 0; i < N; i++) {
            sb.append(stu[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
