package springesempio.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Indexcontroller {
	
	@RequestMapping(value="index")// si mappa la chiamata gestita dal cotroller
 public String getWelcom(Model mod) {
	 mod.addAttribute("intestazione", "benvenuti nel sito");
	 mod.addAttribute("saluti", "ciao");
	 return "index";
 }
	
	@RequestMapping(value="/")// si mappa la chiamata gestita dal cotroller
 public String getWelcom2(Model mod) {
	 mod.addAttribute("intestazione", "benvenuti nel sito");
	 mod.addAttribute("saluti", "ciao");
	 return "index";
 }
}
