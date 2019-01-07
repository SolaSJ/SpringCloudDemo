package com.sola.scmail.common.validators.constraintvalidators.itemnotblank;

import com.sola.scmail.common.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfLong extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, long[]> {

    @Override
    public boolean isValid(long[] longs, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(longs);
    }

}
