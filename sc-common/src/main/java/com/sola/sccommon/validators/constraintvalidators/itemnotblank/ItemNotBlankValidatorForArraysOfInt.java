package com.sola.sccommon.validators.constraintvalidators.itemnotblank;

import com.sola.sccommon.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfInt extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, int[]> {

    @Override
    public boolean isValid(int[] ints, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(ints);
    }

}
