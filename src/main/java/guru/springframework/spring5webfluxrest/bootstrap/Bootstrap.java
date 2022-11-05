package guru.springframework.spring5webfluxrest.bootstrap;

import guru.springframework.spring5webfluxrest.Spring5WebfluxRestApplication;
import guru.springframework.spring5webfluxrest.domain.Category;
import guru.springframework.spring5webfluxrest.domain.Vendor;
import guru.springframework.spring5webfluxrest.repositories.CategoryRepository;
import guru.springframework.spring5webfluxrest.repositories.VendorRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by virru on 05/11/2022
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;
    ch.qos.logback.classic.Logger logging = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        if (categoryRepository.count().block() == 0) {
            logging.info("####### Loading data  category #######");
            categoryRepository.save(Category.builder().description("Fruit").build()).block();
            categoryRepository.save(Category.builder().description("CArksl").build()).block();
            categoryRepository.save(Category.builder().description("Is,").build()).block();
            categoryRepository.save(Category.builder().description("LSfd").build()).block();
            logging.info("###### " +categoryRepository.count().block() + " categories Loaded ############" );
            vendorRepository.save(Vendor.builder().firstName("Ben").lastName("Doe").build()).block();
            logging.info("###### " +vendorRepository.count().block() + " vendors Loaded ###########" );

        }
    }
}
