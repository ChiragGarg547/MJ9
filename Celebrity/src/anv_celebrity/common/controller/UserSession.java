package common.controller;

import javax.servlet.http.HttpSession;

public class UserSession {
	private HttpSession session;

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}
	public UserSession(HttpSession session) {
		setSession(session);
	} 
	
	public void setUser_name(String user_name)
	{
		if(user_name!=null){
			getSession().setAttribute("user_name", user_name);
		}else{
			getSession().setAttribute("user_name", "");
		}
	}
	public String getUser_name(){
		if(getSession().getAttribute("user_name")!=null)
			return (String) getSession().getAttribute("user_name");
		else
			return "";
	}
	
	public void setUser_id(int user_id)
	{
		
		if(user_id!=0)
		{
			getSession().setAttribute("user_id", user_id);
		}
		else
		{
			getSession().setAttribute("user_id", 0);
		}
	}
	public int getUser_id()
	{
		if(getSession().getAttribute("user_id")!=null)
			return (int)getSession().getAttribute("user_id");
		else
			return 0;
		//return Integer.parseInt((String)getSession().getAttribute("user_id"));
	}
	public void setRole_id(int role_id)
	{
		if(role_id!=0)
		{
			getSession().setAttribute("role_id", role_id);
		}
		else
		{
			getSession().setAttribute("role_id", 0);
		}
	}
	public int getRole_id()
	{
		if(getSession().getAttribute("role_id")!=null)
			return Integer.parseInt(getSession().getAttribute("role_id").toString());
		else
			return 0;
	}
	
	public void setUser_first_name(String user_first_name)
	{
		if(user_first_name!=null){
			getSession().setAttribute("user_first_name", user_first_name);
		}else{
			getSession().setAttribute("user_first_name", "");
		}
	}
	public String getUser_first_name(){
		if(getSession().getAttribute("user_first_name")!=null)
			return (String) getSession().getAttribute("user_first_name");
		else
			return "";
	}
}
