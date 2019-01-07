package com.sola.scmail.common.validators.constraintvalidators.itemnotblank;

import org.apache.commons.lang.StringUtils;

import java.util.Collection;

/**
 * @author Sola
 * @date 2019/01/07
 */
public class AbstractItemNotBlankValidator {

    @SuppressWarnings("Duplicates")
    public boolean validate(Object[] objects) {
        if (objects == null) {
            return true;
        }
        for (Object o : objects) {
            if (this.validateNotBlank(o)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("Duplicates")
    public boolean validate(Collection collection) {
        if (collection == null) {
            return true;
        }
        for (Object o : collection) {
            if (this.validateNotBlank(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean validateNotBlank(Object o) {
        if (o == null) {
            return true;
        }
        if (o instanceof String && StringUtils.isBlank((String) o)) {
            return true;
        }
        return false;
    }

    public boolean validate(int[] ints) {
        return true;
    }

    public boolean validate(boolean[] booleans) {
        return true;
    }

    public boolean validate(double[] doubles) {
        return true;
    }

    public boolean validate(float[] floats) {
        return true;
    }

    public boolean validate(short[] shorts) {
        return true;
    }

    public boolean validate(long[] longs) {
        return true;
    }

    public boolean validate(char[] chars) {
        return true;
    }

    public boolean validate(byte[] bytes) {
        return true;
    }

}
