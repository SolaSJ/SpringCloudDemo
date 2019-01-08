package com.sola.sccommon.validators.constraintvalidators.itemnotblank;

import com.sola.sccommon.validators.constraints.ItemNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;

/**
 * @author Sola
 * @date 2018/11/23
 */
public class ItemNotBlankValidatorForCollection extends AbstractItemNotBlankValidator implements ConstraintValidator<ItemNotBlank, Collection> {

    @Override
    public boolean isValid(Collection collection, ConstraintValidatorContext constraintValidatorContext) {
        return this.validate(collection);
    }

}
