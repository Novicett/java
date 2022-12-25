package com.mini.mvc01;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MovieController {
	@Autowired
	MovieDAO dao;
	
	/*
	 * //@RequestMapping("insert") public void insert(MovieVO vo) { dao.insert(vo);
	 * }
	 */
	
	@RequestMapping("insert")
	public void uploadForm(MovieVO vo, HttpServletRequest request,  MultipartFile file, Model model) throws Exception {
		String s1 = request.getContextPath();
		System.out.println(s1);
		String uploadPath = request.getSession().getServletContext().getRealPath( "resources/upload");
		System.out.println("업로드 경로는 " + uploadPath); 
		String savedName = file.getOriginalFilename();
		System.out.println(uploadPath + "/" + savedName);
		File target = new File(uploadPath + "/" + savedName);
		if (!target.isDirectory()) {
			target.mkdir();
		}
		//FileCopyUtils.copy(file.getBytes(), target);
		file.transferTo(target);
		
		model.addAttribute("savedName", savedName);
		vo.setImg(savedName);
		dao.insert(vo);
	
}
}
