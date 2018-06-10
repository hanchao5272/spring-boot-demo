package pers.hanchao.springbootdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	/**
	 * 查看默认加载的bean
	 */
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
		    System.out.println("查看Spring Boot默认加载的Bean：");
		    //获取所有Bean的定义名称
		    String[] beans = ctx.getBeanDefinitionNames();
		    //进行排序-快速排序
            Arrays.sort(beans);
            //打印所有的Bean名称
            for (int i = 0; i < beans.length; i++) {
                System.out.println(i + "-->" + beans[i]);
            }
        };
	}
}
