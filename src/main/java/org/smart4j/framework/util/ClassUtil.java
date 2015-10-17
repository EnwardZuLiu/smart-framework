package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by liuzm on 2015/10/17.
 */
public final class ClassUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    /**
     * 用来用户当前线程的类加载器
     *
     * @return 类加载器
     */
    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    /**
     * 加载类
     *
     * @param className
     * @param isInitialized
     * @return
     */
    public static Class<?> loadClass(String className, boolean isInitialized) {
        try {
            Class<?> cls = Class.forName(className, isInitialized, getClassLoader());
            return cls;
        } catch (ClassNotFoundException e) {
            LOGGER.error("载入类失败", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 默认初始化类
     *
     * @param className
     * @return
     */
    public static Class<?> loadClass(String className) {
        return loadClass(className, true);
    }

    /**
     * 获取指定包名下的所有的类
     *
     * @param packageName
     * @return
     */
    public static Set<Class<?>> getClassSet(String packageName) {
        //TODO
        return null;
    }

    private static void addClass(Set<Class<?>> classSet, String packagePath, String packageName) {
        //TODO
    }

    private static void doAddClass(Set<Class<?>> classSet, String className) {
        //TODO
    }

}
