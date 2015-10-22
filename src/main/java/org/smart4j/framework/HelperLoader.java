package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

import java.util.Arrays;

/**
 * Created by liuzm on 2015/10/22.
 */
public final class HelperLoader {

    public static void init(){
        Class<?> [] classeList = {
                ClassHelper.class,
                BeanHelper.class,
                //AopHelper.class,
                IocHelper.class,
                ControllerHelper.class

        };
        Arrays.asList(classeList).stream().forEach(cls -> {
            ClassUtil.loadClass(cls.getName());
        });
    }

}
