package level0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main { // 백준 제출용
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		List<Integer> students = new ArrayList<>(); // 학생 수 
		
		for(int i = 0; i < 30; i++) {
			
			students.add(i+1); // 출석번호
			
		}
		
		int submitStudents[] = new int[28];
		
		for(int i = 0; i < 28; i++) { // 제출한 수
			
			submitStudents[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int i = 0; i < 28; i++) {
			students.remove(submitStudents[i]);
		}
		
		bw.write(students.get(0) + "\n" + students.get(1));
	
		bw.flush();
		bw.close();
		br.close();
	}
		
}


