package caffrey.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ContextConfigurationע�����spring����
 * @RunWithע��ʹ����Spring��SpringJUnit4ClassRunner���Ա��ڲ��Կ�ʼ��ʱ���Զ�����Spring��Ӧ��������
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
