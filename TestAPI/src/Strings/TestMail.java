package Strings;

public class TestMail {
	/**
	 * Ҫ��ʵ������ע�Ṧ��
	 * @param args
	 * 1.������.com ����.cn ��β
	 * 2.�������@�����Ҳ��ܿ�ͷ���ܽ�β�����ҽ���һ�� 
	 * 3.@֮ǰֻ������ĸ�������ֻ���_ - . ���
	 * 4.����ĸ��������ĸ��
	 * 5.������ʹ��360����
	 */
	public static void main(String[] args) {
		//String mail ="123123asdasdas";
		String mail  = "ͺ¿�ſ��ҵĵ���123_-..s@3d.cn.com";
		if(!(mail.endsWith(".com")||mail.endsWith(".cn"))){
			System.out.println("���ˣ�û����.com����.cn��β");
		}
		if(!mail.contains("@")){
			System.out.println("���뺬��һ��@");		
		}else{
			if(mail.indexOf("@")!=mail.lastIndexOf("@")){
				System.out.println("@����1��");
			}else if(mail.indexOf("@")==0||mail.indexOf("@")==mail.length()-1){
				System.out.println("@���ǿ�ͷ���ǽ�β��");
			}
			
			String mails[] = mail.split("@");
			char c[] = mails[0].toCharArray();
			if(!Character.isLetter(c[0])){
				System.out.println("����ĸ��������ĸ");
			}
			for (int i = 0; i < c.length; i++) {
				
				if(!(c[i]=='_' ||c[i]=='-'||c[i]=='.'||Character.isLetter(c[i])||Character.isDigit(c[i]))){
					System.out.println("@����ǰ�зǷ��ַ�");
					break;
				}
			}

			if(mails[1].substring(0,4).equals("360.")){
				System.out.println("360��ȥ");
			}

		}
		
		
	}

}