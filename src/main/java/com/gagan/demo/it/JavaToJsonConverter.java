package com.gagan.demo.it;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaToJsonConverter {
	   
	  @GetMapping(value="/Ratha")
	  //produces= {"application/xml"}
      public Book Student() {
    	  Book b=new Book();
    	  b.setBookId(254);
    	  b.setBookName("Jay Jagannath");
    	  b.setBookPrice(989.0);
    	  return b;
      }
	

}
