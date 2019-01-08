package com.sola.sccommon.validators.constraintvalidators.itemnotblank;

import com.sola.sccommon.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfDouble extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, double[]> {

    @Override
    public boolean isValid(double[] doubles, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(doubles);
    }

}
