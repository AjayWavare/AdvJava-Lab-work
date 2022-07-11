package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questionbank {
	//map=keyvalue pair subject name=key ,question =value
private Map<String, List<Question>>Questionbank=new HashMap<>();

//these two methods are used to add questions to list
public void addNewSubject(String subject) {
	Questionbank.put(subject, new ArrayList<>());//this method list of subject
}

public void addNewQuestion(String subject,Question question) {
	List<Question> questions=Questionbank.get(subject);//question of that perticular subject
	questions.add(question);
}

public List<Question> fetchQuestionOn(String subject){
	return Questionbank.get(subject);//the questions available on subject in a map we are returning here
	//suppose we pass subject as java then return statement will give the all available quetions on java
}



}
