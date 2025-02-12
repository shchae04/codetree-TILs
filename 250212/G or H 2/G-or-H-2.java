import java.util.*;
 
public class Main {
    static class Person {
        int pos;
        char letter;
 
        Person(int pos, char letter) {
            this.pos = pos;
            this.letter = letter;
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        Person[] persons = new Person[N];
 
        // 입력 받기
        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            char letter = sc.next().charAt(0);
            persons[i] = new Person(pos, letter);
        }
 
        // 위치에 따라 오름차순 정렬 (사진의 크기는 양쪽 끝 사람의 위치 차이로 정의)
        Arrays.sort(persons, Comparator.comparingInt(p -> p.pos));
 
        int maxSize = 0;
 
        // 모든 연속 구간(i ~ j)를 확인합니다.
        for (int i = 0; i < N; i++) {
            int countG = 0;
            int countH = 0;
 
            for (int j = i; j < N; j++) {
                // 구간에 포함되는 사람의 알파벳 개수를 업데이트
                if (persons[j].letter == 'G') {
                    countG++;
                } else {
                    countH++;
                }
 
                // 한 사람만 있는 경우는 사진 크기가 0으로 정의되므로 continue합니다.
                if (i == j) continue;
 
                // 조건 검사:
                // 1. 구간에 있는 사람이 모두 같은 알파벳인 경우
                // 2. 또는 G와 H의 개수가 같은 경우
                if (countG == 0 || countH == 0 || countG == countH) {
                    int size = persons[j].pos - persons[i].pos;
                    maxSize = Math.max(maxSize, size);
                }
            }
        }
 
        System.out.println(maxSize);
    }
}
