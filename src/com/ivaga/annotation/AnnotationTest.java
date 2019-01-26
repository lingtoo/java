package com.ivaga.annotation;



import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
 
/**
 * 测试自定义注解
 * @author liuyazhuang
 *
 */
public class AnnotationTest {
	
	@Test
	public void testAnnotation() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		AnnotationProcessor.parseAnnotation(User.class);
	}
}

