package com.github.fd.common.util;

import com.github.fd.common.exception.FdException;
import com.google.common.base.Joiner;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * validator校验工具类
 *
 * @author mq
 */
public class ValidatorUtils {
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校验对象
     *
     * @param object 待校验对象
     * @param groups 待校验的组
     * @throws FdException 校验不通过，则报DemoException异常
     */
    public static void validateEntity(Object object, Class<?>... groups)
            throws FdException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
        if (!constraintViolations.isEmpty()) {
            List<String> list = new ArrayList<>();
            for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
                list.add(constraintViolation.getMessage());
            }
            throw new FdException(Joiner.on(", ").join(list));
        }
    }
}
