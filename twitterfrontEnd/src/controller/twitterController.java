package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import twitterModel.twitters;

@ManagedBean(name = "TwitterController")
@SessionScoped 
public class twitterController {
	
	@ManagedProperty(value="#{twitter}")
	private twitters Twitters;
	
	public void Login() {
		System.out.println("Successful log in"); 
	}

	public twitters getTwitters() {
		return Twitters;
	}

	public void setTwitters(twitters twitters) {
		Twitters = twitters;
	}
	
	

}
