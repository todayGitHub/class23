package IO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestCtrlF {
	static ArrayList<File> al = new ArrayList<File>(); 
	public static void main(String[] args) {
		String filename = "x3";
		String parentName = "D:/haha";
		printDir(parentName);
		for (File ls : al) {
			if(ls.getName().contains(filename)){
				System.out.println("·����Ϊ��"+ls.getName()+" "+"Ŀ¼�ṹΪ��"+ls.getParent()+"    �ļ���СΪ��"+ls.length()+"  �ļ����ͣ�"+getfiletype(ls));
			}
		}
	}	
	static String  getfiletype(File f){
		if(f.isDirectory()){
			return "�ļ���";
		}
		String filename[] = f.getName().split("\\.");
		if(filename[filename.length-1].equals("txt")){
			return "�ı��ļ�";
		}else if(filename[filename.length-1].equals("doc")){
			return "word";
		}else if(filename[filename.length-1].equals("rar")){
			return "ѹ���ļ�";
		}else if(filename[filename.length-1].equals("xlsx")){
			return "excel";
		}else {
			return "δ֪�ļ�";
		}
	}	
	static void printDir(String parentName){
		File f = new File(parentName);
		File fl [] = f.listFiles();
		for (File file : fl) {
			if(file.isDirectory()){
				printDir(file.getAbsolutePath());
			}
			al.add(file);				
		}
	}
}