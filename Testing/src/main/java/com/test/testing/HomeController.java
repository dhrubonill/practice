package com.test.testing;

import java.text.DateFormat;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/newpage")
	public String newpage(Model model) {
		int x=1;
		int y=2;
		int z=x+y;
		model.addAttribute("Add",z);
		
		return "newpage";
	}
	@RequestMapping(value = "/anotherone")
	public String anotherone(Model model) {
		  HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
	      // Get a set of the entries
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	       //  System.out.print(me.getKey() + ": ");
	        // System.out.println(me.getValue());
	      }
	     // System.out.println();
	      // Deposit 1000 into Zara's account
	   //   double balance = ((Double)hm.get("Zara")).doubleValue();
	   //   hm.put("Zara", new Double(balance + 1000));
	    //  System.out.println("Zara's new balance: " +
	     // hm.get("Zara");
	      model.addAttribute("ADD",set);
	      return "anotherone";
	}
	
}
