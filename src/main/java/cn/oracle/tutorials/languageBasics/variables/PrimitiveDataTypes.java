package cn.oracle.tutorials.languageBasics.variables;

public class PrimitiveDataTypes {
	
	static byte byteDefault;
	static short shortDefault;
	static int intDefault;
	static long longDefault;
	static float floatDefault;
	static double doubleDefault;
	static boolean booleanDefault;
	static char charDefault;
	
	
	public static void main(String[] args) {
		
		//minimum and maximum value of the primitive types
		System.out.println("----------------------minimum and maximum value--------------------------");
		bytePrint();
		shortPrint();
		intPrint();
		longPrint();
		charPrint();
		
		System.out.println("----------------------float-point literals--------------------------");
		floatPointLiterals();
		
		System.out.println("----------------------default value--------------------------");
		//default value of the primitive types
		printDefaultValue();
		
		System.out.println("----------------------float-point literals--------------------------");
		floatPointLiterals();
		
	}
	
	static void printDefaultValue() {
		
		// the compiler never assigns a default value to an uninitialized local variable Accessing an uninitialized local variable will result in a compile-time error.
		byte a;
		short  b;
		int c;
		long d = 100;
		float e = 0.0f;
		double f = 0.0D;
		char g ;
		boolean h;
		
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
//		System.out.println(h);
		
		System.out.println("Byte: " + byteDefault);                    	//0
		System.out.println("short: " + shortDefault);					//0
		System.out.println("int: " + intDefault);						//0
		System.out.println("long: " + longDefault);						//0L
		System.out.println("float: " + floatDefault);                   //0.0f
		System.out.println("double: " + doubleDefault);					//0.0d
		System.out.println("boolean: " + booleanDefault);				//false
		System.out.println("char: " + charDefault);						//'\u0000'
	}
	
	static void bytePrint() {
		
		byte byteMinD = -128;
		byte byteMaxD =  127;
		
		byte byteMinH = -0x80;
		byte byteMaxH =  0x7f;
		
		byte byteMinO = -0200;
		byte byteMaxO =  0177;
		
		byte byteMinB = -0b10000000;
		byte byteMaxB =  0b01111111;
		
		System.out.println("byte:");
		System.out.println("minimum of byte:"+ byteMinD + " && maximum of byte:" + byteMaxD);
		System.out.println("minimum of byte:"+ byteMinH + " && maximum of byte:" + byteMaxH);
		System.out.println("minimum of byte:"+ byteMinO + " && maximum of byte:" + byteMaxO);
		System.out.println("minimum of byte:"+ byteMinB + " && maximum of byte:" + byteMaxB);
		System.out.println();
	}
	
	static void shortPrint() {
		short shortMinD = -32768;
		short shortMaxD =  32767;
		
		short shortMinH = -0x8000;
		short shortMaxH =  0x7fff;
		
		short shortMinO = -0100000;
		short shortMaxO =  077777;
		
		short shortMinB = -0b1000000000000000;
		short shortMaxB =  0b0111111111111111;
		
		System.out.println("short:");
		System.out.println("minimum of short:"+ shortMinD + " && maximum of short:" + shortMaxD);
		System.out.println("minimum of short:"+ shortMinH + " && maximum of short:" + shortMaxH);
		System.out.println("minimum of short:"+ shortMinO + " && maximum of short:" + shortMaxO);
		System.out.println("minimum of short:"+ shortMinB + " && maximum of short:" + shortMaxB);
		System.out.println();
	}
	
	static void intPrint() {
		int intMinD = -2147483648;
		int intMaxD =  2147483647;
		
		int intMinH = -0x80000000;
		int intMaxH =  0x7fffffff;
		
		int intMinO = -020000000000;
		int intMaxO =  017777777777;
		
		int intMinB = -0b10000000000000000000000000000000;
		int intMaxB =  0b01111111111111111111111111111111;
		
		System.out.println("int:");
		System.out.println("minimum of int:"+ intMinD + " && maximum of int:" + intMaxD);
		System.out.println("minimum of int:"+ intMinH + " && maximum of int:" + intMaxH);
		System.out.println("minimum of int:"+ intMinO + " && maximum of int:" + intMaxO);
		System.out.println("minimum of int:"+ intMinB + " && maximum of int:" + intMaxB);
		System.out.println();
	}
	
	static void longPrint() {
		long longMinD = -9223372036854775808L;
		long longMaxD =  9223372036854775807L;
		
		long longMinH = -0x8000000000000000L;
		long longMaxH =  0x7fffffffffffffffL;
		
		long longMinO = -01000000000000000000000L;
		long longMaxO =  0777777777777777777777L;
		
		long longMinB = -0b1000000000000000000000000000000000000000000000000000000000000000L;
		long longMaxB =  0b0111111111111111111111111111111111111111111111111111111111111111L;
		
		System.out.println("long:");
		System.out.println("minimum of long:"+ longMinD + " && maximum of long:" + longMaxD);
		System.out.println("minimum of long:"+ longMinH + " && maximum of long:" + longMaxH);
		System.out.println("minimum of long:"+ longMinO + " && maximum of long:" + longMaxO);
		System.out.println("minimum of long:"+ longMinB + " && maximum of long:" + longMaxB);
		System.out.println();
	}
	
	static void charPrint() {
		char charMinUE = '\u0000';
		char charMaxUE = '\uffff';
		
		char charMinD = 0;
		char charMaxD = 65535;
		char charMinH = 0x0;
		char charMaxH = 0xffff;
		char charMinO = 00;
		char charMaxO = 0177777;
		char charMinB = 0b0;
		char charMaxB = 0b1111111111111111;
		
		char tab = '\t';
		char lineFeed = '\n';
		char carriageReturn = '\r';
		char singleQuote = '\'';
		char doubleQuote = '\"';
		char backslash = '\\';
		
		
		System.out.println("char:");
		System.out.println("minimum of char:"+ (int)charMinUE + " && maximum of char:" + (int)charMaxUE);
		System.out.println("minimum of char:"+ (int)charMinD + " && maximum of char:" + (int)charMaxD);
		System.out.println("minimum of char:"+ (int)charMinH + " && maximum of char:" + (int)charMaxH);
		System.out.println("minimum of char:"+ (int)charMinO + " && maximum of char:" + (int)charMaxO);
		System.out.println("minimum of char:"+ (int)charMinB + " && maximum of char:" + (int)charMaxB);
		
		System.out.println("tab t:"+ (int)tab);
		System.out.println("lineFeed n:"+ (int)lineFeed);
		System.out.println("carriageReturn r:"+ (int)carriageReturn);
		System.out.println("singleQuote \':"+ (int)singleQuote);
		System.out.println("doubleQuote \":"+ (int)doubleQuote);
		System.out.println("backslash \\:"+ (int)backslash);
		System.out.println();
	}
	
	static void floatPointLiterals() {
		double d1 = 123.4;
		double d2 = 1.234e-2;
		float f1 = 123.4f;
		float f2 = 1.234e2f;
		System.out.println("float literal:" + f1 +" , " + f2 + "; double literal:" + d1 + " , " + d2);
	}
	
	static void wideningConversions() {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1L;
		char c = 1;
		float f = 1.0f;
		double d = 1.0d;
		
		//byte to short,int,long,float,double
		s = b;i = b;l = b;f = b;d = b;
		//short to int ,long ,float ,double
		i = s;l = s;f = s;d = s;
		//char to int,long,float,double
		i = c;l = c;f = c;d = c;
		//int to long,float,double
		l = i;f = i;d = i;
		//long to float ,double
		f = l;d = l;
		//float to double
		d = f;
	}
	
	static void NarrowingConversions() {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1L;
		char c = 1;
		float f = 1.0f;
		double d = 1.0d;
		
		//short to char,byte
		c = (char)s;b = (byte)s;
		//char to byte,short
		b = (byte)c;s = (short)c;
		//int to byte,char,short
		b = (byte)i;c = (char)i;s = (short)i;
		//long to byte,char,short,int 
		b = (byte)l;c = (char)l;s = (short)l;i = (int)l;
		//float to byte ,char,short,int,long
	    b = (byte)f;c = (char)f;s = (short)f;i = (int)f;l = (long)f;
	    //double to byte,char,short,int,long,float
	    b = (byte)d;c = (char)d;s = (short)d;i = (int)d;l = (long)d;f = (float)d;
	}
	
	
	static void testUnderscore() {
		
		int intMinD = -2147483648;
		int intMaxD =  2147483647;
		
		int intMinH = -0x80000000;
		int intMaxH =  0x7fffffff;
		
		int intMinO = -020000000000;
		int intMaxO =  017777777777;
		
		int intMinB = -0b10000000000000000000000000000000;
		int intMaxB =  0b01111111111111111111111111111111;
		
		
		long longMinD = -9223372036854775808L;
		long longMaxD =  9223372036854775807L;
		
		float f2 = 1.234e2f;
		
		
		
		
	}
	
	
}
