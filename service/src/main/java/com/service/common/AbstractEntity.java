package com.service.common;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id")
	protected Long id;

	@Column(name="created_by", length=50)
	protected String createdBy;

	@Column(name="date_created")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateCreated;

	@Column(name="updated_by", length=50)
	protected String updatedBy;

	@Column(name="date_updated")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateUpdated;
}
