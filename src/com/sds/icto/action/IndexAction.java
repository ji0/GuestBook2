package com.sds.icto.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.guestbook.dao.GuestBookDAO;
import com.sds.icto.guestbook.vo.GuestBookVO;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, IOException, ServletException{
		// TODO Auto-generated method stub
		
		GuestBookDAO dao = new GuestBookDAO();
		List<GuestBookVO> list = dao.fetchList();
	
		request.setAttribute("list", list);
		
		WebUtil.forward("/View/index.jsp", request, response);
		
	}

	
}
