package cn.oracle.tutorials.classesAndObjects.nested_classes;

interface SayHello{
	public void great();
	public void greatSomeone(String someone);
}

class EnglishSayHello implements SayHello{
	private String greetings;
	
	
	@Override
	public void great() {
		System.out.println("hello!");
	}

	@Override
	public void greatSomeone(String someone) {
		greetings = "hi " + someone + ". how are things";
		System.out.println(greetings);
	}
}

class JapaneseSayHello implements SayHello{
    private String greetings;
	@Override
	public void great() {
		System.out.println("こんにちは");
	}

	@Override
	public void greatSomeone(String someone) {
		greetings = "久しぶり、" + someone + "、元気だった？"; 
		System.out.println(greetings);
	}
}



public class AnonymousClass {
	public static void main(String[] args) {
		/*
		 * AnonymousClass sayHello= new AnonymousClass(); AnonymousClass.EnglishSayHello
		 * englishSayHello = sayHello.new EnglishSayHello();
		 * 
		 * englishSayHello.great(); englishSayHello.greatSomeone("nancy");
		 * 
		 * System.out.println("-----------------------------------------");
		 * 
		 * AnonymousClass.JapaneseSayHello japaneseSayHello = sayHello.new
		 * JapaneseSayHello();
		 * 
		 * japaneseSayHello.great(); japaneseSayHello.greatSomeone("なおちゃん");
		 */
		
		SayHello englishSayHello = new EnglishSayHello();
		
		englishSayHello.great();
		englishSayHello.greatSomeone("nancy");
		
		System.out.println("-----------------------------------------");
		
		SayHello japaneseSayHello = new JapaneseSayHello();
		
		japaneseSayHello.great();
		japaneseSayHello.greatSomeone("なおちゃん");
		
		String greatingPre = "好久不见， ";
				
		SayHello chineseSayHello = new SayHello() {
			private String greetings;
			@Override
			public void greatSomeone(String someone) {
				greetings = greatingPre + someone + "，最近还好吗？";
				System.out.println(greetings);
			}
			
			@Override
			public void great() {
				System.out.println("你好");
			}
		};
		
		System.out.println("-----------------------------------------");
		
		chineseSayHello.great();
		chineseSayHello.greatSomeone("nancy");
		
	}
}
