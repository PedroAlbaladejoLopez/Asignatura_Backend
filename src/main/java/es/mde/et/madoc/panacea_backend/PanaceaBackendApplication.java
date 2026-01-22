package es.mde.et.madoc.panacea_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.mde.et.madoc.panacea_backend.models.Recurso;

@SpringBootApplication
public class PanaceaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanaceaBackendApplication.class, args);
		System.out.println("Aplicación arrancada");
		
		Recurso recurso = new Recurso("nas", "RING 1", "FUTER", "MING", "RING 1", "Cid Campeador",
      "Castilla y León", "Burgos", "Burgos", "20000",
      "Serv. San 1", "Sin_observaciones");
		System.out.println(recurso);
	}

}
