package com.example.JSFLab.utils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("xCordValidator")
public class XCordValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        UIInput input= (UIInput) uiComponent.getAttributes().get("pictureClick");
        String str = (String) input.getValue();
        double val = (Double) o;
        if (!"true".equals(str)) {
            if (val > 4 || val < -4) {
                throw new ValidatorException(new FacesMessage(((UIInput) uiComponent).getValidatorMessage()));
            }
        }
    }
}
