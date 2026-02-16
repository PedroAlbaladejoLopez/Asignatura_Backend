package es.mde.et.madoc.panacea_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import es.mde.et.madoc.panacea_backend.models.Recurso;
import es.mde.et.madoc.panacea_backend.models.RecursoHumano;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        //config.getExposureConfiguration().forDomainType(Recurso.class);
            
            //.withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE))
            
            //.withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.POST));
        
       // config.exposeIdsFor(Recurso.class, RecursoHumano.class);
    }
}
