package com.tencent.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

//��ʾ���ӣ�ִ�� main ��������̨����ģ������س��Զ����ɶ�Ӧ��ĿĿ¼��
public class CodeGen {
	/**
     * <p>
    * ��ȡ����̨����
    * </p>
    */
   @SuppressWarnings("deprecation")
public static String scanner(String tip) {
       @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
       StringBuilder help = new StringBuilder();
       help.append("������" + tip + "��");
       System.out.println(help.toString());
       if (scanner.hasNext()) {
           String ipt = scanner.next();
           if (StringUtils.isNotEmpty(ipt)) {
               return ipt;
           }
       }
       throw new MybatisPlusException("��������ȷ��" + tip + "��");
   }

   public static void main(String[] args) {
       // ����������
       AutoGenerator mpg = new AutoGenerator();

       // ȫ������
       GlobalConfig gc = new GlobalConfig();
       String projectPath = System.getProperty("user.dir");  //��ǰ�Ŀ
       gc.setOutputDir(projectPath + "/src/main/java");  		//����Ŀ·��
       gc.setAuthor("jinpeng");													//��������
       gc.setOpen(true);																//����֮���Ƿ���_
       gc.setServiceName("%sService");
       gc.setIdType(IdType.AUTO);
       gc.setSwagger2(true); 														//ʵ������ Swagger2 ע��
       mpg.setGlobalConfig(gc);

       // ����Դ����
       DataSourceConfig dsc = new DataSourceConfig();
       dsc.setUrl("jdbc:mysql://localhost:3306/mail-shop?serverTimezone=UTC&characterEncoding=utf-8");
       // dsc.setSchemaName("public");
       dsc.setDriverName("com.mysql.jdbc.Driver");
       dsc.setUsername("root");
       dsc.setPassword("root");
       mpg.setDataSource(dsc);

       // ������
       PackageConfig pc = new PackageConfig();
//       pc.setModuleName(scanner("ģ����"));
       pc.setParent("com.tencent");
       mpg.setPackageInfo(pc);

       // �Զ�������
       InjectionConfig cfg = new InjectionConfig() {
           @Override
           public void initMap() {
               // to do nothing
           }
       };

       // ���ģ�������� freemarker
       String templatePath = "/templates/mapper.xml.ftl";
       // ���ģ�������� velocity
       // String templatePath = "/templates/mapper.xml.vm";

       // �Զ����������
       List<FileOutConfig> focList = new ArrayList<>();
       // �Զ������ûᱻ�������
       focList.add(new FileOutConfig(templatePath) {
           @Override
           public String outputFile(TableInfo tableInfo) {
               // �Զ�������ļ��� �� ����� Entity ������ǰ��׺���˴�ע�� xml �����ƻ���ŷ����仯����
               return projectPath + "/src/main/resources/mapper/" 
                       + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
           }
       });
       /*
       cfg.setFileCreate(new IFileCreate() {
           @Override
           public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
               // �ж��Զ����ļ����Ƿ���Ҫ����
               checkDir("����Ĭ�Ϸ���������Ŀ¼");
               return false;
           }
       });
       */
       cfg.setFileOutConfigList(focList);
       mpg.setCfg(cfg);

       // ����ģ��
       TemplateConfig templateConfig = new TemplateConfig();

       // �����Զ������ģ��
       //ָ���Զ���ģ��·����ע�ⲻҪ����.ftl/.vm, �����ʹ�õ�ģ�������Զ�ʶ��
       // templateConfig.setEntity("templates/entity2.java");
       // templateConfig.setService();
       // templateConfig.setController();

       templateConfig.setXml(null);
       mpg.setTemplate(templateConfig);

       // ��������
       StrategyConfig strategy = new StrategyConfig();
       strategy.setNaming(NamingStrategy.underline_to_camel);
       strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//       strategy.setSuperEntityClass("���Լ��ĸ���ʵ��,û�оͲ�������!");
       strategy.setEntityLombokModel(true);
       strategy.setRestControllerStyle(true);
       // ��������
       strategy.setSuperControllerClass("���Լ��ĸ��������,û�оͲ�������!");
       // д�ڸ����еĹ����ֶ�
//       strategy.setSuperEntityColumns("id");
//       strategy.setInclude(scanner("���������Ӣ�Ķ��ŷָ�").split(","));   ���� ���a����
       strategy.setControllerMappingHyphenStyle(true);
       strategy.setTablePrefix(pc.getModuleName() + "_");
       mpg.setStrategy(strategy);
       mpg.setTemplateEngine(new FreemarkerTemplateEngine());
       mpg.execute();
   }

}
