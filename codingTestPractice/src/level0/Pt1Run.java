package level0;

import java.io.IOException;

public class Pt1Run {

	
	public static void main(String[] args) throws IOException {
		
			Practice1 p1 = new Practice1();
			
			try {
				
				//p1.prBuffered();
				p1.pt9();
				
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
	
	}
	
}
