package com.mark.blog;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import com.yammer.dropwizard.config.Configuration;

public class BlogConfiguration extends Configuration{
	
	@JsonProperty
	@NotEmpty
	public String mongohost = "localhost";
	
	@JsonProperty
	@Min(1)
	@Max(65535)
	public int mongoport = 27017;
	
	@JsonProperty
	@NotEmpty
	public String mongodb = "Blog";

}
