// Package
package tech.satic.onlineshop.gateway;

// Librairie
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Classe principale de lancement de l'application.
 * @version     1.0.0
 * @since       02/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {

    /**
     * Methode principale de lancement de l'application.
     * @param       args tableau des arguments fournis sur la ligne de commande.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Methode d'exécution des traitements du microservice.
     * @return       CommandLineRunner : traitement à exécuter.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    @Bean
    CommandLineRunner start() {
        return args -> {
            System.out.println("==== SATIC ONLINE SHOP GATEWAY SERVICE ====");
        };
    }

    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,
                                                        DiscoveryLocatorProperties dlp) {
        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
    }

}

