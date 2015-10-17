package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by liuzm on 2015/10/17.
 */
public final class StringUtil {

    public static final String SEPARATOR = String.valueOf((char) 29);

    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static String[] splitString(String str,String separator){
        return StringUtils.splitByWholeSeparator(str,separator);
    }

}
