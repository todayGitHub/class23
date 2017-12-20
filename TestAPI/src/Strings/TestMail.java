package Strings;

public class TestMail {
	/**
	 * 要求实现邮箱注册功能
	 * @param args
	 * 1.必须以.com 或者.cn 结尾
	 * 2.必须包含@，而且不能开头不能结尾，有且仅有一个 
	 * 3.@之前只能由字母或者数字或者_ - . 组成
	 * 4.首字母必须是字母、
	 * 5.不允许使用360邮箱
	 */
	public static void main(String[] args) {
		//String mail ="123123asdasdas";
		String mail  = "秃驴放开我的道姑123_-..s@3d.cn.com";
		if(!(mail.endsWith(".com")||mail.endsWith(".cn"))){
			System.out.println("错了，没有以.com或者.cn结尾");
		}
		if(!mail.contains("@")){
			System.out.println("必须含有一个@");		
		}else{
			if(mail.indexOf("@")!=mail.lastIndexOf("@")){
				System.out.println("@超过1个");
			}else if(mail.indexOf("@")==0||mail.indexOf("@")==mail.length()-1){
				System.out.println("@不是开头就是结尾了");
			}
			
			String mails[] = mail.split("@");
			char c[] = mails[0].toCharArray();
			if(!Character.isLetter(c[0])){
				System.out.println("首字母必须是字母");
			}
			for (int i = 0; i < c.length; i++) {
				
				if(!(c[i]=='_' ||c[i]=='-'||c[i]=='.'||Character.isLetter(c[i])||Character.isDigit(c[i]))){
					System.out.println("@符号前有非法字符");
					break;
				}
			}

			if(mails[1].substring(0,4).equals("360.")){
				System.out.println("360死去");
			}

		}
		
		
	}

}
