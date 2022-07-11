package Quiz;

import java.util.List;

public class Question {
private String  question;
private List<Option>option;
public Question(String question) {
	super();
	this.question = question;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Option> getOption() {
	return option;
}
public void setOption(List<Option> option) {
	this.option = option;
}

}
