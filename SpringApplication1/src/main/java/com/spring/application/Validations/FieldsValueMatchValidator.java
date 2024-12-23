package com.spring.application.Validations;

import com.spring.application.annotations.FieldMatchValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldMatchValidator,Object> {
    private String field;
    private String fieldMatch;
    @Override
    public void initialize(FieldMatchValidator constraintAnnotation) {
        this.field=constraintAnnotation.field();
        this.fieldMatch= constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Object fieldValue=new BeanWrapperImpl(o).getPropertyValue(field);
        Object fieldMatchValue= new BeanWrapperImpl(o).getPropertyValue(fieldMatch);

        return fieldValue!=null?fieldMatchValue.equals(fieldValue):false;

    }
}
