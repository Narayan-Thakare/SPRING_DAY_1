package pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	
	
	
	public static void main(String[] args) {
		Resource r=new ClassPathResource("appContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Student s=(Student)factory.getBean("obj");  
System.out.println(s);        
        
	}

	


}
