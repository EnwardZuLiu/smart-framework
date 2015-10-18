package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.util.ClassUtil;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by liuzm on 2015/10/18.
 */
public final class ClassHelper {

    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * @return
     */
    public static Set<Class<?>> getClassSet(){
        return CLASS_SET;
    }

    /**
     * 获取所有的service类
     * @return
     */
    public static Set<Class<?>> getServiceClassSet(){
        Set<Class<?>> classSet = new HashSet<>();
        CLASS_SET.stream().filter(
                cls -> cls.isAnnotationPresent(Service.class)
        ).forEach(
                cls -> classSet.add(cls)
        );
        return classSet;
    }

    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet = new HashSet<>();
        CLASS_SET.stream().filter(
                cls -> cls.isAnnotationPresent(Controller.class)
        ).forEach(
                cls -> classSet.add(cls)
        );
        return classSet;
    }

    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> beanClassSet = new HashSet<>();
        beanClassSet.addAll(getControllerClassSet());
        beanClassSet.addAll(getServiceClassSet());
        return beanClassSet;
    }

    public static Set<Class<?>> getClassSetBySuper(Class<?> superClass){
        Set<Class<?>> classSet = new HashSet<>();
        CLASS_SET.stream().filter(
                cls -> superClass.isAssignableFrom(cls) && !superClass.equals(cls)
        ).forEach(cls -> classSet.add(cls));
        return classSet;
    }

    public static Set<Class<?>> getClassSetByAnnotation(Class<? extends Annotation> annotationClass){
        Set<Class<?>> classSet = new HashSet<>();
        CLASS_SET.stream().filter(cls -> cls.isAnnotationPresent(annotationClass))
                .forEach(cls -> classSet.add(cls));
        return classSet;
    }

}
