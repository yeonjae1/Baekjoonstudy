import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        산술평균 - 입력받을때마다 더해줌
        출력시 입력 값 n으로 나눔 + 반올림 해야함

        중앙값 - 정렬시 가운데값

        최빈값 - 카운팅정렬??

        범위 - max, min 수 찾아낸 후 범위 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; //저장
        int sum = 0; //산술평균
        int mid = 0; //중앙값
        int[] max_arr = new int[8001];
        int max = -4000, min = 4000; // 범위

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            sum += arr[i];
            max_arr[arr[i] + 4000]++;

            //범위
            if (N == 1) {
                max = 0;
                min = 0;
            } else {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }

        }

        //중앙값
        Arrays.sort(arr); //정렬 후
        mid = arr[N / 2]; //중앙값 구함

        //최빈값 -->와근데이거진짜 60퍼만이해함 아직도 모르겟음 머리아프니까 낼할래 ㅎ
        int max_cnt = 0;
        int result = 0;
        for(int i = 0; i < max_arr.length; i++) {
            if(max_cnt < max_arr[i]) {
                max_cnt = max_arr[i];
                result = i - 4000;
            }
        }
        int cnt = 0;
        for(int i = 0; i < max_arr.length; i++) {
            if(max_cnt == max_arr[i]) { // 최빈값이 중복일 경우
                result = i - 4000;
                if(cnt == 1) {
                    break;
                }
                cnt++;
            }
        }

        System.out.println((int) Math.round((double) sum / N)); // 산술평균
        System.out.println(mid); // 중앙값
        System.out.println(result); // 최빈값
        System.out.println(max - min); // 범위
        br.close();
    }
}