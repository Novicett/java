package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤으로 만들어주고, 스프링에 컨트롤러 역할을 하도록 등록!
public class BbsController {
	
	@Autowired
	BbsDAO dao; // 주소가 들어가 있을 것 이다
	
	@RequestMapping("insert2.multi")
	public void insert(BbsDTO dto) {
		// 1. 데이터를 받아서 dto를 만들어서 집어 넣어라.!
		System.out.println(dto);
		
		// 2. dao에 dto를 주고 insert해달라고 요청해라!
		dao.insert(dto);
		
		// 3. 결과를 알려주는 페이지를 호출(insert2.jsp를 호출함: 자동으로!!)
	}
	
	@RequestMapping("delete2.multi")
	public void delete(String id) {
		dao.delete(id);
		
	}
}
