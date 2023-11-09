package level0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Practice1 {
	
	public void prBuffered() throws IOException  { // static 키워드가 붙지 않은 메서드는 인스턴스 메서드이며, 객체를 생성한 후에 해당 객체를 통해 호출할 수 있다. static으로 만들던지, main에서 객체를 먼저 만들어줘야 호출 가능
		
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // input, outputStream으로 데이터를 입, 출력함 system.in -> 키보드로부터 사용자 입력을 읽음
	  BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out)); // bufferedReader 로 스트림을 버퍼링하여 모아서 한번에 처리함 -> 입출력 성능을 향상시킴
	  
	  int a = Integer.parseInt(br.readLine()); // bufferedReader를 통해 입력된 한 줄의 문자열을 읽음, 문자열을 정수로 변환함
	  int K = 0;
	  
	  for(int i = 0; i < a; i++) {
		  
		  String s= br.readLine();
		  String arr[]= s.split(" ");
		  
		  for(int j = 0; j < 2; j++) {
			   K= K+Integer.parseInt(arr[j]);
		  }
		  
		  bw.write(K+"\n");
		  
		  K=0; // 다음 줄 숫자들을 위함
	  
	  }
	
	bw.flush(); // 버퍼 남아있는 데이터 모두 출력
	bw.close(); // 출력 스트림 닫기
	
	}

	
	public void pt1() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <= T; i++) {
			
			int result = 0;
			
			String s = br.readLine();
			String arr[] = s.split(" ");
			
			for(int j=0; j<=1; j++) {
				
				result = result + Integer.parseInt(arr[j]);
				
			}
			
			bw.write("Case #" + i +": " + result + "\n");
			
		}
		
		bw.flush();
		bw.close();
	
	}
	
	public void pt2() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <= T; i++) {
			
			int result = 0;
			
			String s = br.readLine();
			String arr[] = s.split(" ");
			
			for(int j=0; j<=1; j++) {
				
				result = result + Integer.parseInt(arr[j]);
				
			}
			
			bw.write("Case #" + i +": " + arr[0] + " + " + arr[1] + " = " + result + "\n");
			
		}
		
		bw.flush();
		bw.close();
	
	}
	
	public void star1() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

	public void star2() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) {
				
				if(j <= N - i) System.out.print(" ");
				else System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}
		
	public void pt3() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
				
				int result = 0;
				
				String s = br.readLine();
				String arr[] = s.split(" ");
				
				for(int j = 0; j <= 1; j++) {
					
					result = result + Integer.parseInt(arr[j]); // BufferedReader, Writer는 줄 마다 입력이 누적되거나 하지 안ㅇ흠.
					
				}
				
				if(result ==0) break;
				// bw.write(result); BufferedWriter에 int 타입을 그대로 넣으면 해당 int의 아스키 코드에 해당하는 문자를 출력하게 된다.
				bw.write(result + "\n");
				
			}
			
			bw.flush(); // console에 띄워주는건 얘의 역할임. write가 sout이 아님
			bw.close();
		
	}
	
	
	public void eof() throws IOException{ // End of File은 모든 줄 입력을 마친 뒤, 줄에 아무것도 없는 상태에서 ctrl+D 또는 ctrl+Z 를 눌러야 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		
		while((s = br.readLine()) != null) { // EOF를 만날 때까지 계속해서 읽음

				int result = 0;
				String arr[] = s.split(" ");
				
				for(int j = 0; j <= 1; j++) {
					
					result = result + Integer.parseInt(arr[j]); // BufferedReader, Writer는 줄 마다 입력이 누적되거나 하지 안ㅇ흠.
					
				}
				
				bw.write(result + "\n");
				
			}
			
			bw.flush(); // console에 띄워주는건 얘의 역할임. write가 sout이 아님
			bw.close();
		
		
	}
	
	public void pt4() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 연속된 공백도 포함함
		
		for(int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int a = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) count++;
		}
		
		bw.write(count + "\n");
			
		bw.flush();
		br.close();
		
	}
	
	public void pt5() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // ," " 안하면 공백 하나 기준으로 나눔

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()); // 다른 tokenizer 생성
		
		for(int i = 0; i < N; i++) {
			
			A[i] = Integer.parseInt(st2.nextToken());
			
			if(A[i] < X) bw.write(A[i] + " "); 
			
		}
		
			
		bw.flush();
		br.close();
		
	}
	
	public void pt6() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		

		
		for(int i = 0; i < N; i++) {
			
			A[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int min = A[0];
		int max = A[0];
		
		for(int i = 1; i< A.length; i++) {
			
			if(min > A[i]) min = A[i];
			
			if(max < A[i]) max = A[i];
			
		}
		
		bw.write(min + " " + max);
		
			
		bw.flush();
		br.close();
		
	}
	
	public void pt7() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		int max = arr[0];
		int turn = 1;
		
		for(int i = 1; i < 9; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				turn = i + 1;
			}
			
		}
		
		bw.write(max + "\n" + turn);
			
		bw.flush();
		br.close();
		
	}
	
	public void pt8() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int bucket[] = new int[N];
		
		for(int i = 1; i <= M; i++) {
			
			st = new StringTokenizer(br.readLine()); // 새 토큰 생성
			
			int one = Integer.parseInt(st.nextToken()); // 번째 바구니부터
			int two = Integer.parseInt(st.nextToken()); // 번째 바구니까지
			int three = Integer.parseInt(st.nextToken()); // 번 공을 넣는다.
			
			for( int j = one; j <= two; j++) {
				bucket[j - 1] = three;
			}
			
			
		}
		
		for (int i = 0; i < N; i++) {
	        bw.write(Integer.toString(bucket[i]) + " ");

	    }
		
		bw.flush();
		br.close();
	
	}
	
	public void pt9() throws IOException{
		
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
			
			int one1 = bucket[one-1]; // 값을 담아놈 swap도 가능
			
			bucket[one-1] = bucket[two-1];
			bucket[two-1] = one1;
			
		}
		
		for (int i = 0; i < N; i++) {
	        bw.write(Integer.toString(bucket[i]) + " ");

	    }
		
		bw.flush();
		br.close();
	
	}

	public void pt10() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 

		int X = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int bucket[] = new int[30];
		
		for(int i = 0; i < bucket.length; i++) {
			
			bucket[i] = i + 1;
			
		}
		
		for(int i = 0; i < bucket.length; i++) {
			
			st = new StringTokenizer(br.readLine());
		}
		

	
	}
	
}
