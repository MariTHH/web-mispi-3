package com.example.JSFLab.utils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("yCordValidator")
public class YCordValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        UIInput input= (UIInput) component.getAttributes().get("pictureClick");
        String str = (String) input.getValue();
        double val = (Double) value;
        if (!"true".equals(str)) {
            if (val > 3 || val < -5) {
                throw new ValidatorException(new FacesMessage(((UIInput) component).getValidatorMessage()));
            }
        }
    }
}
