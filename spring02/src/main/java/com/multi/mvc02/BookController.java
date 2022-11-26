package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤으로 만들어주고, 스프링에 컨트롤러 역할을 하도록 등록!
public class BookController {
	
	@Autowired
	BookDAO dao; // 주소가 들어가 있을 것 이다
	
	
	@RequestMapping("list.multi")
	public void list(Model model) {
		ArrayList<BookDTO> list = dao.list();
		// views/list.jsp를 호출, 결과는 list를 전달해야함.
		// 전달하기 객체필요(Model)
		// 전달하고 싶으면, model 객체의 속성으로 추가하자.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		BookDTO dto = dao.one(id); // orm에 의해 dto로 return!
		// model의 속성으로 지정하면, views아래까지 전달이 된다.!!
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		dao.delete(id);
		// 결과는 views아래 delete3.jsp를 호출해서 클라이언트에 보냄!
	}
	
	@RequestMapping("insert3.multi")
	public void insert(BookDTO dto) {
		// 1. 데이터를 받아서 dto를 만들어서 집어 넣어라.!
		System.out.println(dto);
		
		// 2. dao에 dto를 주고 insert해달라고 요청해라!
		dao.insert(dto);
		
		// 3. 결과를 알려주는 페이지를 호출(insert3.jsp를 호출함: 자동으로!!)
		// 스프링 프로그램이 컨트롤러에 있는 메서드의 마지막은 무조건!!! insert3.jsp를 호출!
	}
	
}
