package com.sola.scmail.common.validators.constraintvalidators.itemnotblank;

import com.sola.scmail.common.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfChar extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, char[]> {

    @Override
    public boolean isValid(char[] chars, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(chars);
    }

}
