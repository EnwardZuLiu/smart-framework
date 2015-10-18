package org.smart4j.framework.helper;

import org.smart4j.framework.util.CollectionUtil;

import java.util.Map;

/**
 * Created by liuzm on 2015/10/18.
 */
public final class IocHelper {

    static {
        Map<Class<?> ,Object> beanMap = BeanHelper.getBeanMap();
        if(CollectionUtil.isNotEmpty(beanMap)){

        }
    }

}
