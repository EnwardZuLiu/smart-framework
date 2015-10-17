package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by liuzm on 2015/10/17.
 */
public final class PropsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 用来加载属性配置文件
     *
     * @param fileName 属性配置文件文件名
     * @return
     */
    public static Properties loadProps(String fileName) {
        //TODO
        try (InputStream is = ClassUtil.getClassLoader().getResourceAsStream(fileName)) {
            //TODO
        } catch (IOException e) {
            LOGGER.error("载入配置文件失败", e);
        }
        return null;
    }

    /**
     * 获取String类型的属性（默认值为空字符串）
     *
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key) {
        //TODO
        return null;
    }

    /**
     * 获取String类型的属性值（可指定默认值）
     *
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties props, String key, String defaultValue) {
        //TODO
        return null;
    }

    public static int getInt(Properties props, String key) {
        //TODO
        return 0;
    }

    public static int getInt(Properties props, String key, int defaultValue) {
        //TODO
        return 0;
    }

    public static boolean getBoolean(Properties props, String key) {
        //TODO
        return false;
    }

    public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        //TODO
        return false;
    }


}
