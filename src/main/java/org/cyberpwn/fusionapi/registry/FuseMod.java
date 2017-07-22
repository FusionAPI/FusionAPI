package org.cyberpwn.fusionapi.registry;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declare a class as a fuse mod
 * 
 * @author cyberpwn
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface FuseMod
{
	/**
	 * Define a source name
	 * 
	 * @return the source name
	 */
	public String source();
}
