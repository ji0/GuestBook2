package com.sds.icto.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDAO;
import com.sds.icto.guestbook.vo.GuestBookVO;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException, ClassNotFoundException, ServletException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");

		//이메일을 등록합니다.
		//인서트 끝났는데 결과 쟤한테 알아왕

		String no = request.getParameter("no");
		System.out.println(no);
		
		Long lNo = Long.parseLong(no);
		String password = request.getParameter("password");

		System.out.println(no + ", " + password);

		GuestBookDAO dao = new GuestBookDAO();
		dao.delete(lNo, password);
		System.out.println("여기 되닝");

		response.sendRedirect("/GuestBook2/GB");
		
		
		
		
	}

}
