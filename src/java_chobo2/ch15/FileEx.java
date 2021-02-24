package java_chobo2.ch15;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileEx {

	public static void main(String[] args) throws IOException {
//		File f = new File();
		File file = getSearchFile();
		
		String fileName = file.getName();
		int pos = fileName.lastIndexOf(".");

		System.out.println("경로를 제외한 파일 이름 - "+file.getName());
		System.out.println("확장자를 제외한 파일이름 - "+fileName.substring(0,pos+1));
		System.out.println("확장자 - "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일이름 - "+file.getPath());
		System.out.println("파일의 절대경로 - "+file.getAbsolutePath());
		System.out.println("파일의 정규경로 - "+file.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리 - "+file.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.separator"+File.separator);
		System.out.println("File.separatorChar"+File.separatorChar);
		System.out.println();
		System.out.println("user.dir = "+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = "+System.getProperty("sun.boot.class.path"));
		
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = file.listFiles();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].isDirectory() ? "[" + file.getName() + "]" : file.getName());
		}
	}
	
	public static File getSearchFile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		int res = jfc.showOpenDialog(null);
		File file = null;
		if (res == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
		return file;
	}

}
