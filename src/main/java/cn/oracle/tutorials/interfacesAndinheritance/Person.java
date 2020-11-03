package cn.oracle.tutorials.interfacesAndinheritance;

class Person implements Comparable{
	
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Comparable o) {
		// TODO Auto-generated method stub
		Person oPerson = (Person)o;
		if(this.age > oPerson.age) return 1;
		else if(this.age == oPerson.age) return 0;
		else return -1;
	}

	
	public static void main(String[] args) {
		Comparable nancy = new Person("Nancy",25);
		Person jelly = new Person("jelly",28);
		
		System.out.println(nancy.compareTo(jelly));
	}

	
}
