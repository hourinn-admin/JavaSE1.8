package cn.oracle.tutorials.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Repeatable(simpleAnnotaionContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD})
@interface simpleAnnotation {
	int value() default 50;
	String name() default "simple annotaion";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD})
@interface simpleAnnotaionContainer { simpleAnnotation[] value();}

@simpleAnnotation(name = "class annotation 01")
@simpleAnnotation(name = "class annotation 02")
public class BasicAnnotation {
	
	@simpleAnnotation(name = "field annotation 01")
	@simpleAnnotation(name = "field annotation 02")
	public String someField;
	
	@simpleAnnotation(name = "constructor annotation 01")
	@simpleAnnotation(name = "constructor annotation 02")
	public BasicAnnotation() {}
	
	@simpleAnnotation(name = "main annotation 02")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Annotation [] annos;
		BasicAnnotation basicAnnotation = new BasicAnnotation();
		annos = BasicAnnotation.class.getAnnotations();
		for (Annotation annotation : annos) {System.out.println(annotation);}
		
		try {annos = BasicAnnotation.class.getConstructor().getAnnotations();} catch (Exception e) {};
		for (Annotation annotation : annos) {System.out.println(annotation);}
		
		try {annos = basicAnnotation.getClass().getField("someField").getAnnotations();} catch (Exception e) {};
		for (Annotation annotation : annos) {System.out.println(annotation);}
		
		try {annos = BasicAnnotation.class.getMethod("main", String[].class).getAnnotations();} catch (Exception e) {};
		for (Annotation annotation : annos) {System.out.println(annotation);}
		
		simpleAnnotation sa = null ;
		try {sa = basicAnnotation.getClass().getMethod("main", String[].class).getAnnotation(simpleAnnotation.class);} catch (Exception e) {};
		System.out.println(sa.name());
	}
}
