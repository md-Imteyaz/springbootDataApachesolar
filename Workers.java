package com.SpringbootApacheSolar.Model;

import javax.persistence.Id;

import org.apache.solr.client.solrj.beans.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SolrDocuments(collection = "Workers")
public class Workers {
	@Id
	@Field
	private long id;
	@Field
	private String name;
	@Field
	private String address;
}
