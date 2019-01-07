package com.sola.scmail.common.validators.constraintvalidators.itemnotblank;

import com.sola.scmail.common.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class ItemNotBlankValidatorForArraysOfFloat extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, float[]> {

    @Override
    public boolean isValid(float[] floats, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(floats);
    }

}
