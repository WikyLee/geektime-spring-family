package geektime.spring.web.foo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

// 定义为切面
@Aspect
@Slf4j
public class FooAspect {
    // 定义通知及切入点，aop增强效果是在方法执行后增加日志“after hello”
    @AfterReturning("bean(testBean*)")
    public void printAfter() {
        log.info("after hello()");
    }
}
