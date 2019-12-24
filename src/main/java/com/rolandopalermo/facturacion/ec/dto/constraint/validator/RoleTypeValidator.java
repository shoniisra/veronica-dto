package com.rolandopalermo.facturacion.ec.dto.constraint.validator;

import com.rolandopalermo.facturacion.ec.common.types.RoleEnum;
import com.rolandopalermo.facturacion.ec.dto.constraint.RoleType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RoleTypeValidator implements ConstraintValidator<RoleType, String> {

    @Override
    public void initialize(RoleType constraintAnnotation) {
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintValidatorContext) {
        if (object == null) {
            return false;
        }
        return RoleEnum.getFromRole(object).isPresent();

    }

}