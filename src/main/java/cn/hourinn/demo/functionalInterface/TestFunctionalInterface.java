package cn.hourinn.demo.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;



//c测试函数
public class TestFunctionalInterface {
	
	//c测试java.util.Function接口
	@Test
	public void TestFunction() {
		//c方法引用实现,普通方法通过对象引用
		//Function<String,Boolean> function = "Hello"::startsWith;
		//lamda实现
		Function<String,Boolean> function = prefix -> "Hello".startsWith(prefix);
		System.out.println(function.apply("H"));
	}
	
	//c测试java.util.Consumer接口
	@Test
	public void TestConsumer() {
		//c方法引用实现
		//Consumer<String> consumer = System.out::print;
		//lamda实现
		Consumer<String> consumer = info -> System.out.print(info);
		consumer.accept("hello");
	}
	
	//c测试java.util.Supplier接口
	@Test
	public void TestSupplier() {
		//method reference 实现接口
		//Supplier<String> supplier = "hello"::toUpperCase;
		//lamda表达式实现接口
		Supplier<String> supplier = () -> "hello".toUpperCase();
		System.out.println(supplier.get());
	}
	
	//c测试java.util.Predicate接口
	@Test
	public void TestPredicate() {
		//c方法引用实现
		//Predicate<String> predicate = "hello"::equalsIgnoreCase;
		//lamda实现
		Predicate<String> predicate = info -> "hello".equalsIgnoreCase(info);
		System.out.println(predicate.test("HELLO"));
	
	}
}
