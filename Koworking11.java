import java.util.Scanner;
public class Koworking11 {


	public static void main(String... args)
	{ int str = new Scanner(System.in).nextInt();
	        Integer number = str;
	        
	        // �������� ������ �����
	        String convert = Integer.toBinaryString(number);
	        System.out.println(convert);
	        
	        // ������������ �����
	        convert = Integer.toOctalString(number);
	        System.out.println(convert);
	        
	        // ���������������� �����
	        convert = Integer.toHexString(number);
	        System.out.println(convert);
	} }