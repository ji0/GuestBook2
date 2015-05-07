package com.sds.icto.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDAO;
import com.sds.icto.guestbook.vo.GuestBookVO;
import com.sds.icto.web.Action;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, IOException,
			ServletException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");

		// 이메일을 등록합니다.
		// 인서트 끝났는데 결과 쟤한테 알아왕

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String message = request.getParameter("message");
		GuestBookVO vo = new GuestBookVO();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMessage(message);

		GuestBookDAO dao = new GuestBookDAO();
		dao.insert(vo);

		response.sendRedirect("/GuestBook2/GB");

	}

}
