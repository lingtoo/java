package com.ivaga.annotation;

import com.ivaga.annotation.Gender.GenderEnum;  
  
/** 
 * 以注解标识的类 
 * @author liuyazhuang 
 * 
 */  
@Info(name="tom", age = 18, hobby = {"Java", "C", "Python", "Go"})  
public class User {  
      
    @Gender(gender = GenderEnum.GIRL)  
    private String sex;  
  
    public String getSex() {  
        return sex;  
    }  
  
    public void setSex(String sex) {  
    	System.out.println("set sex::"+sex);
        this.sex = sex;  
    }  
    
    public static void main(String[] args) {
    	
    }
      
}  