import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException { //예외처리

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //공백 단위로 값을 입력받음
        ArrayList<Integer> arr = new ArrayList<>(); //배열 선언

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr); //메소드sort 사용(오름차순 정렬) -> 이거 사용할때는 리스트 사용


        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i) + "\n"); //append 호출 ,
        }


        System.out.println(sb);
    }
}