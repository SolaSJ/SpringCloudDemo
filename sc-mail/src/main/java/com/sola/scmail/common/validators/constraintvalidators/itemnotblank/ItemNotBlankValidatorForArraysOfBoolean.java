package com.sola.scmail.common.validators.constraintvalidators.itemnotblank;

import com.sola.scmail.common.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfBoolean extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, boolean[]> {

    @Override
    public boolean isValid(boolean[] booleans, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(booleans);
    }

}
