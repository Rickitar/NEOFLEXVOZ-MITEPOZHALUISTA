import java.util.Scanner;
public class Koworking11 {


	public static void main(String... args)
	{ int str = new Scanner(System.in).nextInt();
	        Integer number = str;
	        
	        // Бинарный формат числа
	        String convert = Integer.toBinaryString(number);
	        System.out.println(convert);
	        
	        // Восьмиричная форма
	        convert = Integer.toOctalString(number);
	        System.out.println(convert);
	        
	        // Шеснадцатиричная форма
	        convert = Integer.toHexString(number);
	        System.out.println(convert);
	} }