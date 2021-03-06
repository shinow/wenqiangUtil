/**
 * 
 */
package springmvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.sun.org.glassfish.external.arc.Taxonomy;

/**
 * @author msa12
 *2018
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public   @interface WQRequestParam {
    String value() default "";
}
