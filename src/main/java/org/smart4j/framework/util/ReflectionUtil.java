package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by liuzm on 2015/10/18.
 */
public final class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    public static Object newInstance(Class<?> cls){
        try{
            Object instance = cls.newInstance();
            return instance;
        }catch (Exception e){
            LOGGER.error("创建对象失败", e);
            throw new RuntimeException(e);
        }
    }

    public static Object newInstance(String className){
        Class<?> cls = ClassUtil.loadClass(className);
        return newInstance(cls);
    }

    public static Object invokeMethod(Object obj,Method method,Object... args){
        try{
            method.setAccessible(true);
            return method.invoke(obj,args);
        }catch (Exception e){
            LOGGER.error("调用方法失败", e);
            throw new RuntimeException(e);
        }
    }

    public static void setField(Object obj,Field field,Object value){
        try {
            field.setAccessible(true);
            field.set(obj,value);
        }catch (Exception e){
            LOGGER.error("给属性赋值失败", e);
            throw new RuntimeException(e);
        }
    }

}
