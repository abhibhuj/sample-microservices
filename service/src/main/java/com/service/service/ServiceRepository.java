package com.service.service;

import com.service.vendor.Vendor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;
import java.util.List;

/**
 * Created by bhujabaa on 3/20/2016.
 */
@RepositoryRestResource
public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {
    @RestResource(path = "by-name")
    Collection<Service> findByName(@Param("name") String name);
}
