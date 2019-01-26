package com.ivaga;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
/**
 * 解析Info注解和Gender注解
 * @author liuyazhuang
 *
 */
public class AnnotationProcessor{
	/**
	 * 解析clazz实例中的指定注解
	 * @param clazz：要传入的clazz对象
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void parseAnnotation(Class<?> clazz) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//clazz是以Info注解修饰
		if(clazz.isAnnotationPresent(Info.class)){
			//获取Info注解
			Info annotation = clazz.getAnnotation(Info.class);
			System.out.println(annotation);
			System.out.println(annotation.name());
			System.out.println(annotation.age());
			String[] bobby = annotation.hobby();
			for(String str : bobby){
				System.out.println(str);
			}
		}
		Field[] fields = clazz.getDeclaredFields();
		if(fields != null && fields.length > 0){
			for(Field field : fields){
				if(field.isAnnotationPresent(Gender.class)){
					Gender annotation = field.getAnnotation(Gender.class);
					System.out.println(annotation);
					System.out.println(annotation.gender());
					
					
					Method method = clazz.getMethod("setSex", String.class);

//			        //通过该方法得到注解上的具体信息
//			        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
//			        String username = annotation.username();
//			        int age = annotation.age();

			        //将注解上的信息注入到方法上
			        Object o = clazz.newInstance();
			        method.invoke(o, annotation.gender().toString());
			        User user= (User)o;
			        String sex =user.getSex();
			        System.out.println("sex::"+sex);
				}
			}
		}
	}
}

