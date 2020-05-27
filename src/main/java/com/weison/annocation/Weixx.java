package com.weison.annocation;

import java.lang.annotation.*;
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Weixx {
	String value() default "1";
}
