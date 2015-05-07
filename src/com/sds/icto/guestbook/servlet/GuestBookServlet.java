package com.sds.icto.guestbook.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.action.DeleteAction;
import com.sds.icto.action.IndexAction;
import com.sds.icto.action.InsertAction;
import com.sds.icto.web.Action;

/**
 * Servlet implementation class GuestBook2
 */
@WebServlet("/GB")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuestBookServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		try {
			request.setCharacterEncoding("utf-8");
			String a = request.getParameter("a");

			Action action = null;
			if ("delete".equals(a)) {
				action = new DeleteAction();
			} else if ("insert".equals(a)) {
				action = new InsertAction();
			} else {
				action = new IndexAction();
			}
			action.execute(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}

}
