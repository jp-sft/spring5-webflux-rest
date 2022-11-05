package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by virru on 05/11/2022
 */
@Repository
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
