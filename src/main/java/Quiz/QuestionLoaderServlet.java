package Quiz;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet act as controller and it  will send 1 question to the jsp file for viewing on screen
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	int qNo = 0;// this variable wont reset to 0 as servlet loads only once on browser,as well as declared at class level
	//broweser me run servlet ko krna hai...

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> questions = qbLoader.loadQuestionsOnJava();
		
		if(qNo < questions.size()) {
			Question question = questions.get(qNo++);
			
			HttpSession session = request.getSession();
			session.setAttribute("currentQs", question);
			
			response.sendRedirect("viewQuestion.jsp");
		}
		else
			response.sendRedirect("viewScore.jsp");
	}

	

}
