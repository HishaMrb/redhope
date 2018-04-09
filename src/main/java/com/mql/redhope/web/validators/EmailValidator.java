package com.mql.redhope.web.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class EmailValidator implements Validator {

	public static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		private Pattern pattern;
		private Matcher matcher;
		
		@Override
		public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
			pattern = Pattern.compile(EMAIL_PATTERN);	
			matcher = pattern.matcher(value.toString());
			
			if(!matcher.matches()) {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email is invalid", "");
				throw new ValidatorException(message);
			}
  }
}