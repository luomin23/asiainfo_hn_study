package com.asiainfo.chapter2.common.persistence.mybatis;

import com.asiainfo.chapter2.common.util.StringUtil;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.File;
import java.io.IOException;

/**
 * @author Luoo
 * @ClassName: TQSqlSessionFactoryBean
 * @Description: mybatis自动扫描别名路径（新增通配符匹配功能）
 * @date 2017-09-08 16:51
 */
public class TQSqlSessionFactoryBean extends SqlSessionFactoryBean {
    private static final String ROOT_PATH = "com.asiainfo.chapter2" + File.separator;
    private static final String ROOT_PATH_SPLIT = ",";
    private static final String[] PATH_REPLACE_ARRAY = {"]"};
    Logger logger = LoggerFactory.getLogger(getClass());

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        if (!StringUtil.isStringAvaliable(typeAliasesPackage)) {
            super.setTypeAliasesPackage(typeAliasesPackage);
            return;
        }
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        StringBuffer typeAliasesPackageStringBuffer = new StringBuffer();
        try {
            for (String location : typeAliasesPackage.split(",")) {
                if (!StringUtil.isStringAvaliable(location)) {
                    continue;
                }
                location = "classpath*:"
                        + location.trim().replace(".", File.separator);
                typeAliasesPackageStringBuffer.append(getResources(resolver,
                        location));
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        if ("".equals(typeAliasesPackageStringBuffer.toString())) {
            throw new RuntimeException("mybatis typeAliasesPackage 路径扫描错误！请检查applicationContext.xml@sqlSessionFactory配置！");
        }
        typeAliasesPackage = replaceResult(
                typeAliasesPackageStringBuffer.toString()).replace(
                File.separator, ".");
        super.setTypeAliasesPackage(typeAliasesPackage);
    }

    private String getResources(ResourcePatternResolver resolver,
                                String location) throws IOException {
        StringBuffer resourcePathStringBuffer = new StringBuffer();
        for (Resource resource : resolver.getResources(location)) {
            String description = resource == null ? "" : resource
                    .getDescription();
            if (!StringUtil.isStringAvaliable(resource.getDescription())
                    || description.indexOf(ROOT_PATH) == -1) {
                continue;
            }
            resourcePathStringBuffer.append(
                    description.substring(description.indexOf(ROOT_PATH)))
                    .append(ROOT_PATH_SPLIT);
        }
        return resourcePathStringBuffer.toString();
    }

    private String replaceResult(String resultStr) {
        for (String replaceStr : PATH_REPLACE_ARRAY) {
            resultStr = resultStr.replace(replaceStr, "");
        }
        return resultStr;
    }
}
