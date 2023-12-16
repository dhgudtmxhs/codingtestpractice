package cd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> videoFiles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("동영상 파일 크기를 입력하세요. (0 입력 시 종료)");

        while (true) {
            try {
                int fileSize = scanner.nextInt();

                if (fileSize == 0) {
                    break;
                }

                if (fileSize > 650) {
                    System.out.println("파일크기는 650MB를 넘을 수 없습니다.");
                    continue;
                }

                videoFiles.add(fileSize);
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.next(); 
            }
        }

        int cdRomSize = 650;
        List<List<Integer>> result = insertVideoFiles(videoFiles, cdRomSize);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("CD" + (i + 1) + "에 들어간 동영상: " + result.get(i));
        }

        scanner.close();  
    }

    public static List<List<Integer>> insertVideoFiles(List<Integer> videoFiles, int cdRomSize) {

        List<List<Integer>> result = new ArrayList<>();

        Collections.sort(videoFiles, Collections.reverseOrder()); // 내림차순 정렬

        for (int videoSize : videoFiles) {
            boolean flag = false;

            // 이미 있는 CD롬에 넣을 수 있는지 확인
            for (List<Integer> cdRom : result) {
                int currentSize = 0;
                for (Integer size : cdRom) {
                    currentSize += size;
                }

                if (currentSize + videoSize <= cdRomSize) {
                    cdRom.add(videoSize);
                    flag = true;
                    break;
                }
            }

            // 못넣는다면 새로운 CD롬 생성 후 추가
            if (!flag) {
                List<Integer> newCdRom = new ArrayList<>();
                newCdRom.add(videoSize);
                result.add(newCdRom);
            }
        }

        return result;
    }
}