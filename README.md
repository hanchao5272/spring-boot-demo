# Spring Boot Demo

Spring Boot版本: `1.5.2.RELEASE`

## Spring Boot初识
### hello world

访问路径：http://localhost:8080/hello/david

打包命令：(根目录) `mvn clean package`

运行命令：`java -jar spring-boot-demo-0.0.1-SNAPSHOT.jar`

运行命令：(使用外部配置文件) `java -jar spring-boot-demo-0.0.1-SNAPSHOT.jar -Dspring.config.location=application.yml`

### 默认加载Bean

默认加载了112个(Spring Boot版本: `1.5.2.RELEASE`)

### JUnit 4测试

- 指定Spring测试：@RunWith(SpringRunner.class)
- 指定运行端口号：@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
- 测试端口号：@LocalServerPort
- 通过@Autowired引入TestRestTemplate进行Restful测试
- 通过before方法设置URL
- 注意引入：import static org.junit.Assert.assertThat;
- 注意引入：import org.hamcrest.Matchers;

## 配置文件
### 字段获取配置属性

- 通过@Value获取配置文件的值

### 实体获取配置属性

- 通过@Componet标识实体为bean
- 需要引入`spring-boot-configuration-processor`组件
- 通过@ConfigurationProperties(prefix = "person")将配置注入到bean中
- 通过@PropertySource("classpath:company.properties")指定配置文件

### 不同环境的配置文件

- 环境：dev,test,prod
- 设置当前文件的环境：application.profile = dev
- 设置当前采用的环境：application.profile.active = dev
- yml可以通过`---`来实现文件分割，减少文件个数

## MyBatis

### mybatis基本配置
- 参考：https://blog.csdn.net/Winter_chen001/article/details/77249029
- 组件：web、mybatis、mysql、jackson、PageHelper、druid、mgb
- 数据源配置：spring.datasource.**
- mybatis配置：mybatis.mappler-locations/type-aliases-package

### 分页配置
- pagehelper分页插件

### mgb配置
- 修改mgb配置文件generatorConfig.xml
- 使用mgb：mvn项目---mybatis-generator:generate -e
- 生成：Mapper、Entity、Mapper.xml
- 启动类添加@MapperScan("pers...mapper"),进行Mapper类的自动加载

## Swagger API文档

- 添加依赖
- 添加配置类Swagger2
- 对需要生成文档的类添加注释
    - @Api：修饰整个类，描述Controller的作用
    - @ApiOperation：描述一个类的一个方法，或者说一个接口
    - @ApiParam：单个参数描述
    - @ApiModel：用对象来接收参数
    - @ApiProperty：用对象接收参数时，描述对象的一个字段
    - @ApiResponse：HTTP响应其中1个描述
    - @ApiResponses：HTTP响应整体描述
    - @ApiIgnore：使用该注解忽略这个API
    - @ApiError ：发生错误返回的信息
    - @ApiParamImplicitL：一个请求参数
    - @ApiParamsImplicit 多个请求参数
- 访问地址：http://localhost:8080/swagger-ui.html