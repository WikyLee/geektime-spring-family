package geektime.spring.web.foo;

import geektime.spring.web.context.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
// 开启aop代理
@EnableAspectJAutoProxy
public class FooConfig {
    @Bean
    public TestBean testBeanX() {
        return new TestBean("foo");
    }

    @Bean
    public TestBean testBeanY() {
        return new TestBean("foo");
    }

    // 切面定义在Parent Context中
    // 如果只有父类开启aop代理，则只有父类的bean被增强
    // 如果只有子类开启aop代理，则只有子类的bean被增强
    // 如果两者都开启aop代理，则两者的bean都被增强
    @Bean
    public FooAspect fooAspect() {
        return new FooAspect();
    }
}
