package es.mde.et.madoc.panacea_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;
import es.mde.et.madoc.panacea_backend.models.Activacion;
import es.mde.et.madoc.panacea_backend.models.Recurso;

@SpringBootApplication
public class PanaceaBackendApplication {

	public static void main(String[] args) {
		
		//0. Creación de un objeto con new
		//SpringApplication.run(PanaceaBackendApplication.class, args);
		//Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1", "Cid Campeador",
        //"Castilla y León", "Burgos", "Burgos", "20000",
        //"Serv. San 1", "Sin_observaciones");
		//System.out.println(recurso);
		
		
		
		//----------------------------- OPCION 1 - XML -----------------------------------------//   (primero crear applicationContext.xml en resources)

		//SpringApplication.run(PanaceaBackendApplication.class, args);
		//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		//Recurso recurso = contexto.getBean("recurso", Recurso.class);
		//System.out.println(recurso);
		//Activacion activacion = contexto.getBean("activacion", Activacion.class);
		//System.out.println(activacion);
		
		
		//----------------------------OPCION 2 - JAVA CONFIG----------------------------------//     (primero crear AppConfig)
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		Recurso recurso = contexto.getBean(Recurso.class);
		System.out.println(recurso);
		        
		   
		
		
	}
}
