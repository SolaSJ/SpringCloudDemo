package com.sola.sccommon.validators.constraintvalidators.itemnotblank;

import com.sola.sccommon.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfShort extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, short[]> {

    @Override
    public boolean isValid(short[] shorts, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(shorts);
    }

}
