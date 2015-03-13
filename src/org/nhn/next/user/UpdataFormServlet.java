package org.nhn.next.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nhn.next.AbstractHttpServlet;
import org.nhn.next.db.Database;

@WebServlet("/users/updateform")
public class UpdataFormServlet extends AbstractHttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession session = req.getSession();	// 엄청 삽질했던 부분. req.getAttribute();로 해서
		String userId = (String) session.getAttribute("userId");
		
		User dbUser = Database.getUser(userId);
		
		req.setAttribute("dbUser", dbUser);
		forward(req, resp, "/updateForm.jsp");
	}
}
