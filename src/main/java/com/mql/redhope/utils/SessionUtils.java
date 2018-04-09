package com.mql.redhope.utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.mql.redhope.models.User;

public class SessionUtils {
	
	public static HttpSession getSession() {
		return (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}
	
	public static User getUserSession() {
		if (getSession() != null) {
			return (User)getSession().getAttribute("user");
		}
		return null;
	}
}
