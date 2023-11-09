package level0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { // 백준 제출용
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int bucket[] = new int[N];
		
		for(int i = 0; i < bucket.length; i++) {
			
			
			bucket[i] = i + 1; // 바구니들의 초기값
		}
		
		
		for(int i = 1; i <= M; i++) {
			
			st = new StringTokenizer(br.readLine()); // 새 토큰 생성
			
			int one = Integer.parseInt(st.nextToken()); // 번째 바구니와
			int two = Integer.parseInt(st.nextToken()); // 번째 바구니
			
			int one1 = bucket[one-1]; // 값을 담아놈
			
			bucket[one-1] = bucket[two-1];
			bucket[two-1] = one1;
			
		}
		
		for (int i = 0; i < N; i++) {
	        bw.write(Integer.toString(bucket[i]) + " ");

	    }
		
		bw.flush();
		br.close();
	
	}
		
}


