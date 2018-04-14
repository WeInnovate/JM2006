package com.jm2006.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestChangeListener implements ServletRequestAttributeListener {

    public RequestChangeListener() {
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Attribute remove "+srae.getValue());
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  {
    	System.out.println("Attribute added "+srae.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Attribute replaced "+srae.getValue());
    }
	
}
