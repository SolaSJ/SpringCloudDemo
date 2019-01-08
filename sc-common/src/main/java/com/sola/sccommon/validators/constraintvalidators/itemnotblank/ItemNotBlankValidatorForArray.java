package com.sola.sccommon.validators.constraintvalidators.itemnotblank;

import com.sola.sccommon.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Sola
 * @date 2018/11/23
 */
public class ItemNotBlankValidatorForArray extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, Object[]> {

    @Override
    public boolean isValid(Object[] objects, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(objects);
    }

}
