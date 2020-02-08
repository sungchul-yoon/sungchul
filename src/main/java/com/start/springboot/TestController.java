package com.start.springboot;

import org.springframework.ui.Model;

public class TestController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "data..");
		DataObject data = new DataObject(123, "start");
		model.addAttribute("object", data);
		return "index";
	}
	
	class DataObject{
		public int id;
		public String name;
		
		public DataObject(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	}
}
