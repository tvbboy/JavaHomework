import java.util.*;
public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int intNumA=10;
       int intNumB=3;
      
       System.out.println(intNumA/intNumB);
       Scanner in = new Scanner(System.in);    //Scanner��
       System.out.println("Please input a float number:");
       int a = in.nextInt();    //����int����
       System.out.println(a);    //��������һ������String���ݣ����м��пո�Ͳ�����ʾ��Scanner�໹�������⹦��
       System.out.println("Please input a string: ");    //��������һ������String���ݣ����м��пո�Ͳ�����ʾ��Scanner�໹�������⹦��
      // Scanner str = new Scanner(System.in);
       System.out.println("The string is :" + in.next());
	}

}
