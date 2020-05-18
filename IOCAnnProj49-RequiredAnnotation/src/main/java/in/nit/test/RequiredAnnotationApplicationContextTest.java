package in.nit.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Student;

public class RequiredAnnotationApplicationContextTest {

	private static Logger log=Logger.getLogger(RequiredAnnotationApplicationContextTest.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Student st=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/config.xml");
		
		st=ctx.getBean("st",Student.class);
		
		log.info("info"+st);
		log.debug("debug"+st);
		log.warn("warn"+st);
		log.error("error"+st);
		log.fatal("fatal"+st);
		
		
		((AbstractApplicationContext) ctx).close();
	}
}
