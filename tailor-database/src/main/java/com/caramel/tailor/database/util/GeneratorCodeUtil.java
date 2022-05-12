package com.caramel.tailor.database.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * GeneratorCodeUtil
 * <p>
 * Mybatis-Plus 代码自动生成器（现已经有最新版本，占时不更新）
 *
 * @author Fitminf
 * @since 2022-01-25 17:53
 */
public class GeneratorCodeUtil {

    private static final String URL = "jdbc:mysql://39.108.152.104:3306/personal_tailor";
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        generator();
    }

    /**
     * 生成代码
     */
    public static void generator() {
        AutoGenerator generator = new AutoGenerator();
        generator.setDataSource(getDataSourceConfig())
                .setStrategy(getStrategyConfig())
                .setPackageInfo(getPackageConfig())
                .setGlobalConfig(getGlobalConfig());
        generator.execute();
    }

    /**
     * 基本配置：数据源配置
     */
    private static DataSourceConfig getDataSourceConfig() {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        // 数据库类型
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(URL)
                .setDriverName(DRIVER_NAME)
                .setUsername(USER_NAME)
                .setPassword(PASSWORD);

        // 以下为非必填项，MP 自动配置

        // 选择数据库信息查询类，默认由 dbType 类型决定选择对应数据库内置实现
        // dataSourceConfig.setDbQuery(new MySqlQuery());

        // 数据库 schema name，例如 PostgreSQL 可指定为 public
        // dataSourceConfig.setSchemaName("public");

        // 类型转换，默认由 dbType 类型决定选择对应数据库内置实现
        // dataSourceConfig.setTypeConvert(new MySqlTypeConvert());
        return dataSourceConfig;
    }

    /**
     * 数据库表配置
     */
    private static StrategyConfig getStrategyConfig() {
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(false)                            // 是否大写命名，默认 false
                .setSkipView(false)                                     // 是否跳过视图，默认 false
                .setNaming(NamingStrategy.underline_to_camel)           // 表名映射下划线转驼峰
                .setColumnNaming(NamingStrategy.underline_to_camel)     // 字段名映射下划线转驼峰
                //.setTablePrefix("")                                   // 表前缀
                //.setFieldPrefix("")                                   // 字段前缀
                //.setSuperEntityClass(Father.class.getName())          // 自定义继承的 Entity 类全称，带包名
                //.setSuperEntityColumns("id","age")                    // 自定义基础的 Entity 类公共字段
                //.setSuperMapperClass(Mother.class.getName())          // 自定义继承的 Mapper 类全称，带包名
                //.setSuperServiceClass("")                             // 自定义继承的 Service 类全称，带包名
                //.setSuperServiceImplClass("")                         // 自定义继承的 ServiceImpl 类全称，带包名
                //.setSuperControllerClass("")                          // 自定义继承的 Controller 类全称，带包名
                //.setEnableSqlFilter(false)                            // 默认激活进行 sql 模糊表名匹配关闭之后 likeTable 与 notLikeTable 将失效，include 和 exclude 将使用内存过滤如果有 sql 语法兼容性问题的话，请手动设置为 false
                .setInclude("user")                                     // 需要包含的表名，当 enableSqlFilter 为 false 时，允许正则表达式（与 exclude 二选一配置）
                //.setLikeTable(null)                                   // 自 3.3.0 起，模糊匹配表名（与 notLikeTable 二选一配置）
                //.setExclude("")                                       // 需要排除的表名，当 enableSqlFilter 为 false 时，允许正则表达式
                //.setNotLikeTable(null)                                // 自 3.3.0 起，模糊排除表名
                //.setEntityColumnConstant(false)                       //【实体】是否生成字段常量（默认 false）
                .setChainModel(true)                                    //【实体】是否为链式模型（默认 false）
                .setEntityLombokModel(true)                             //【实体】是否为lombok模型（默认 false）3.3.2 以下版本默认生成了链式模型，3.3.2 以后，默认不生成，如有需要，请开启 chainModel
                //.setEntityBooleanColumnRemoveIsPrefix(false)          // Boolean 类型字段是否移除 is 前缀（默认 false）
                .setRestControllerStyle(true)                           // 生成 @RestController 控制器
                //.setControllerMappingHyphenStyle(false)               // 驼峰转连字符
                .setEntityTableFieldAnnotationEnable(true);             // 是否生成实体时，生成字段注解
        //.setVersionFieldName("version")                               // 乐观锁属性名称
        //.setLogicDeleteFieldName("")                                  // 逻辑删除属性名称
        //.setTableFillList(null);                                      // 表填充字段
        return strategyConfig;
    }

    /**
     * 包名配置
     */
    private static PackageConfig getPackageConfig() {
        PackageConfig packageConfig = new PackageConfig();
        // packageConfig.setParent("com.fitminf.project.tailor");                  // 父包名。如果为空，将下面子包名必须写全部，否则就只需写子包名
        // packageConfig.setModuleName("tailor-engineering");                      // 父包模块名
        // packageConfig.setEntity("common.entity");                               // Entity 包名
        // packageConfig.setService("engineering.service");                        // Service 包名
        // packageConfig.setServiceImpl("engineering.service.impl");               // Service Impl 包名
        // packageConfig.setMapper("common.mapper");                               // Mapper 包名
        // packageConfig.setXml("mapper.xml");                                     // Mapper XML包名
        // packageConfig.setController("engineering.controller");                  // Controller 包名
        // packageConfig.setPathInfo("");                                          // 路径配置信息
        packageConfig.setParent("com.fitminf.project.tailor.common.test");
        return packageConfig;
    }

    /**
     * 模板配置
     * - <dependency>
     * -    <groupId>org.apache.velocity</groupId>
     * -    <artifactId>velocity-engine-core</artifactId>
     * -    <version>2.3</version>
     * - </dependency>
     * <p>
     * 使用默认，暂时不配置
     */
    private static TemplateConfig getTemplateConfig() {
        return new TemplateConfig();
    }

    /**
     * 全局策略配置
     */
    private static GlobalConfig getGlobalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java"); // 生成文件的输出目录
        globalConfig.setFileOverride(true);                                           // 是否覆盖已有文件
        globalConfig.setOpen(false);                                                  // 是否打开输出目录
        globalConfig.setEnableCache(false);                                           // 是否在 xml 中添加二级缓存配置
        globalConfig.setAuthor("Fitminf");                                            // 开发人员
        //globalConfig.setKotlin(false);                                              // 开启 Kotlin 模式
        //globalConfig.setSwagger2(true);                                             // 开启 swagger2 模式
        globalConfig.setActiveRecord(false);                                          // 开启 ActiveRecord 模式
        globalConfig.setBaseResultMap(true);                                          // 开启 BaseResultMap
        globalConfig.setBaseColumnList(true);                                         // 开启 baseColumnList
        globalConfig.setDateType(DateType.ONLY_DATE);                                 // 时间类型对应策略 默认值：TIME_PACK
        //globalConfig.setEntityName("");                                             // 实体命名方式
        //globalConfig.setMapperName("");                                             // mapper 命名方式
        //globalConfig.setXmlName("");                                                // Mapper xml 命名方式
        //globalConfig.setServiceName("");                                            // service 命名方式
        //globalConfig.setServiceImplName("");                                        // service impl 命名方式
        //globalConfig.setControllerName("");                                         // controller 命名方式
        globalConfig.setIdType(IdType.ASSIGN_UUID);                                   // 指定生成的主键的 ID 类型

        return globalConfig;
    }

    /**
     * 注入配置
     */
    private static InjectionConfig getInjectionConfig() {
        return null;
    }
}
