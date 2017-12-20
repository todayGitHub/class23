package IO;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		//����·��
		File f = new File("C:/2.txt");			
		File f2 = new File("C:/1");
		
		//·����Ϣ
		//f.deleteOnExit();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		//��·�������ɶ
		f.createNewFile();
		//f2.createNewFile();
		f2.mkdir();
		System.out.println(f2.mkdirs());
		//��Ķ����ܸ�ɶ
		System.out.println(f.canExecute());
		//java�е�File������Ͳ����ļ�����˼��·����
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
				
		//��Ķ����Ǹ�ɶ��
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.length());
			
		//��Ķ������滹��ɶ
		String sf[] = f2.list();
		for (String string : sf) {
			System.out.println(string);
		}		
		File sff[] = f2.listFiles();
		for (File file : sff) {
			System.out.println(file);
		}
		
		System.out.println("C:"+f.separator+"1.txt");
	}
	
}
