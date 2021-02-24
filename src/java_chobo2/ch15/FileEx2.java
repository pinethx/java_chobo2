package java_chobo2.ch15;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		File f = FileEx.getSearchFile();

		System.out.println(f.getName());

		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}

	}

}
