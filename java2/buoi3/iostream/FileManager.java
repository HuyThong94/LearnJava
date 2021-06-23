package buoi3.iostream;

import java.io.File;

public class FileManager {

	public static void main(String[] args) {
		// lay duong dan thu muc hien thoi -> thu muc project
		String rootPath = System.getProperty("user.dir");
		File rootDir = new File(rootPath);
		/*
		if (rootDir.isDirectory()) {
			File[] list = rootDir.listFiles();
			for (File f : list) {
				System.out.println((f.isDirectory()?"Dir:":"File:") + f.getAbsolutePath());
			}
		}
		*/
		// space:""
		travelDirectory(rootDir, "");
	}
	public static void travelDirectory(File rootDir, String space) {
		if (rootDir.isDirectory()) {
			System.out.println("+" + space + rootDir.getAbsolutePath());
			File[] list = rootDir.listFiles();
			String newspace = space + "   ";
			for (File f : list) {
				travelDirectory(f, newspace);
			}
		} else {
			// khi la file thi dung
			System.out.println("-"+ space + rootDir.getAbsolutePath());
		}
	}

}
