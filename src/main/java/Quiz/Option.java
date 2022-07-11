package Quiz;

public class Option {
private String option;
private boolean isRight;
public String getOption() {
	return option;
}
public void setOption(String option) {
	this.option = option;
}
public boolean isRight() {
	return isRight;
}
public void setRight(boolean isRight) {
	this.isRight = isRight;
}
public Option() {
	super();
	// TODO Auto-generated constructor stub
}
public Option(String option, boolean isRight) {
	super();
	this.option = option;
	this.isRight = isRight;
}
}
