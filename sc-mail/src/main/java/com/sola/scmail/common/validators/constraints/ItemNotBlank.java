package com.sola.scmail.common.validators.constraints;

import com.sola.scmail.common.validators.constraintvalidators.itemnotblank.ItemNotBlankValidatorForArray;
import com.sola.scmail.common.validators.constraintvalidators.itemnotblank.ItemNotBlankValidatorForArraysOfDouble;
import com.sola.scmail.common.validators.constraintvalidators.itemnotblank.ItemNotBlankValidatorForArraysOfInt;
import com.sola.scmail.common.validators.constraintvalidators.itemnotblank.ItemNotBlankValidatorForCollection;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author Sola
 * @date 2019/01/04
 */
@Documented
@Constraint(
        validatedBy = {
                ItemNotBlankValidatorForCollection.class,
                ItemNotBlankValidatorForArray.class
        }
)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItemNotBlank {

    String message() default "{Array or collection is null, or its item is empty!}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
