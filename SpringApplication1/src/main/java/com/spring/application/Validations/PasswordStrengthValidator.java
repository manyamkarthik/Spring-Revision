package com.spring.application.Validations;


import com.spring.application.annotations.PasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class PasswordStrengthValidator implements ConstraintValidator<PasswordValidator,String> {

    List<String> WeakPasswords;
    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
        WeakPasswords=List.of("12345","qwerty","password");
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return (s != null && (!WeakPasswords.contains(s)));
    }
}
