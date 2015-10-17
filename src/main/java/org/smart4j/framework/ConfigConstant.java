package org.smart4j.framework;

/**
 * Created by liuzm on 2015/10/17.
 *
 * 该接口用来提供配文件的常量
 * 文件名、jdbc的驱动、数据库用户名、密码
 * 基础包名、jsp路径、静态文件路径、文件上传限制
 *
 */
public interface ConfigConstant {

    String CONFIG_FILE = "smart.properties";

    String JDBC_DRIVER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";

    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    String APP_JSP_PATH = "smart.framework.app.jsp_path";
    String APP_ASSET_PATH = "smart.framework.app.asset_path";
    String APP_UPLOAD_LIMIT = "smart.framework.app.upload_limit";

}
