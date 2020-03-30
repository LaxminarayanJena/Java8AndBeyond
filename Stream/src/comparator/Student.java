package comparator;

public class Student {

	//POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any class path. POJOs are used for increasing the readability and re-usability of a program.
	private String name;
	private int score;
	private int height;
	
	public Student(String name,int score ,int height)
	{
		this.name=name;
		this.score=score;
		this.height=height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", height=" + height + "]";
	}
	

}
