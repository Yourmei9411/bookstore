package caffrey.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ContextConfiguration注解加载spring容器
 * @RunWith注解使用了Spring的SpringJUnit4ClassRunner，以便在测试开始的时候自动创建Spring的应用上下文
 * @author Administrator
 *
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
	
	@Autowired
	ServiceTest serviceTest;
	
	@org.junit.Test
	public void testSpring() {
		serviceTest.test();
	}
}
