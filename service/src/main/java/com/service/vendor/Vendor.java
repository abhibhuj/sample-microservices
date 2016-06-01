package com.service.vendor;

import com.service.common.AbstractEntity;
import com.service.common.ListToStringConverter;
import com.service.service.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by bhujabaa on 3/20/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vendor extends AbstractEntity {

    private String name;

    //private Address address;

    @Convert(converter = ListToStringConverter.class)
    private List<String> serviceAreas;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "vendor_service",
            joinColumns = { @JoinColumn(name = "vendor_id") },
            inverseJoinColumns = { @JoinColumn(name = "service_id") })
    private List<Service> services;
}
