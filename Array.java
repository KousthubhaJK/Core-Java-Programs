//array is used to represent multiple values with homogeneous datatype.
//Arrays are of fixed size.
//At a time we can store a huge amount of data.

package task;

public class Array {
		public static void main(String[] args) {
			int a[]={54,66,52,74};
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			String s[]={"kavya","sheeba"};
			
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s.length);
			System.out.println(s[0].length());
		}
			

		}


