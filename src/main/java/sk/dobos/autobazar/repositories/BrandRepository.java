package sk.dobos.autobazar.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.dobos.autobazar.models.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long> {
}
