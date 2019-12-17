package emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Test {
public static void main(String[] args) {
	
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	
	MetadataSources mds=new MetadataSources(registry);
	
	Metadata md=mds.getMetadataBuilder().build();
	
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	
	Session session=sf.openSession();
	
	/*Employee em=new Employee();
	em.setEid(4);
	em.setName("AAAAAAB");
	em.setAddr("BBBBB");
	
	session.save(em);*/
	
	
	/*Employee em1=new Employee();
	em1.setEid(3);
	em1.setName("CCCCC");
	em1.setAddr("DDDDDD");
	
	session.save(em1);*/
	
	Employee em=session.load(Employee.class,2);//2 is a rollno which data show
	System.out.println(em.getEid());
	System.out.println(em.getName());
	System.out.println(em.getAddr());
	
	session.save(em);
	System.out.println("Done");
	
	session.beginTransaction().commit();
	{
		
		
		}
	}
}

