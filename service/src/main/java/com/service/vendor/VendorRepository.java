package com.service.vendor;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by bhujabaa on 3/20/2016.
 */
@RepositoryRestResource
public interface VendorRepository extends PagingAndSortingRepository<Vendor, Long> {
    @RestResource(path = "by-name")
    List<Vendor> findByName(@Param("name") String name);
}
