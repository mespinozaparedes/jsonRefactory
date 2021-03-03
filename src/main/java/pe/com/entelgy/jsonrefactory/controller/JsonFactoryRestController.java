package pe.com.entelgy.jsonrefactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.entelgy.jsonrefactory.service.JsonFactoryService;

@RestController
@RequestMapping("/comments")
public class JsonFactoryRestController {
	
	@Autowired
	private JsonFactoryService jsonFactoryService;
	
	@GetMapping(value = "")
	public JsonFactoryResponse getComments(){
		return jsonFactoryService.transform();	
	}

}
