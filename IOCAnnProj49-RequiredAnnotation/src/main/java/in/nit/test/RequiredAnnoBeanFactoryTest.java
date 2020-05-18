package in.nit.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.model.Student;

public class RequiredAnnoBeanFactoryTest {
	public static final Logger logger=Logger.getLogger(RequiredAnnoBeanFactoryTest.class.getName());
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student st=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/config.xml");
		st=factory.getBean("st",Student.class);
       logger.info(st);
		
		
	}

}
