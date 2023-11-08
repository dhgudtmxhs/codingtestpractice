package level0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { // 백준 제출용
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		
		while((s = bf.readLine()) != null) { // EOF를 만날 때까지 계속해서 읽음

				int result = 0;
				String arr[] = s.split(" ");
				
				for(int j = 0; j <= 1; j++) {
					
					result = result + Integer.parseInt(arr[j]); // BufferedReader, Writer는 줄 마다 입력이 누적되거나 하지 않음.
					
				}
				
				bw.write(result + "\n");
				
			}
			
			bw.flush(); // console에 띄워주는건 얘의 역할임. write가 sout이 아님
			bw.close();
		
		}
		
		
}


