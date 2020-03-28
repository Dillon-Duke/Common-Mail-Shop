package com.tencent.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author dillon
 * @Date 2020/3/22 14:15
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "swagger2")
public class SwaggerProperty {
    /** 需要扫描的包 */
    private String basePackage;
    /** 联系人姓名 */
    private String name;
    /** 联系人主页 */
    private String url;
    /** 联系人邮箱 */
    private String email;
    /** 项目标题 */
    private String title;
    /** 项目介绍 */
    private String destription;
    /** 项目服务团队 */
    private String termOfServiceUrl;
    /** 项目的授权信息 */
    private String license;

    public SwaggerProperty() {
    }

    public SwaggerProperty(String basePackage, String name, String url, String email, String title, String destription, String termOfServiceUrl, String license) {
        this.basePackage = basePackage;
        this.name = name;
        this.url = url;
        this.email = email;
        this.title = title;
        this.destription = destription;
        this.termOfServiceUrl = termOfServiceUrl;
        this.license = license;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDestription() {
        return destription;
    }

    public void setDestription(String destription) {
        this.destription = destription;
    }

    public String getTermOfServiceUrl() {
        return termOfServiceUrl;
    }

    public void setTermOfServiceUrl(String termOfServiceUrl) {
        this.termOfServiceUrl = termOfServiceUrl;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

}
