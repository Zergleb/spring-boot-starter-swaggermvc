package org.springframework.boot.autoconfigure.bootswaggermvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SwaggerMVCController {
	//TODO make this use properties for both the url and the template
	@RequestMapping(value= "/swagger", method=RequestMethod.GET)
	public String swaggerView() {
		return "index";
	}
}
