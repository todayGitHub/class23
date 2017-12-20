package com.neuedu.oop;

public class Outer implements A{
		private static int a = 2;
		int s = 1;
		void haha(){
			new Inner().hehe();
			//new X().b
		}
		
		void geta(){
			 final int a = 3;
			class X{
				int b = s;
				void xixi(){
					System.out.println(a);
				}
				
			}
			X x = new X();
//			a = 2;
			 x.xixi();
		}
		
		class Inner implements B {
		
			//int a = 1;
			int b = a;
			void hehe(){
				//int a = 3;
				System.out.println(a);
			}
			@Override
			public int xixi() {
				// TODO Auto-generated method stub
				return a;
			}
		}

		@Override
		public void xixi() {
			// TODO Auto-generated method stub
			System.out.println(a);
		}
}

