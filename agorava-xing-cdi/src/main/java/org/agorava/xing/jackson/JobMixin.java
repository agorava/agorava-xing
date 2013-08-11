package org.agorava.xing.jackson;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Company;
import org.agorava.xing.model.Contact;
import org.agorava.xing.model.Job.Industry;
import org.agorava.xing.model.Job.Level;
import org.agorava.xing.model.Location;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class JobMixin {

	@JsonCreator
	JobMixin(@JsonProperty("id") String id) {
	}

	@JsonProperty("location")
	Location location;

	@JsonProperty("title")
	String title;

	@JsonProperty("level")
	Level level;

	@JsonProperty("job_type")
	String jobType;

	@JsonProperty("industry")
	Industry industry;

	@JsonProperty("company")
	Company company;

	@JsonProperty("skills")
	List<String> skills;

	@JsonProperty("description")
	String description;

	@JsonProperty("tags")
	List<String> tags;

	@JsonProperty("published_at")
	String publishedAt;

	@JsonProperty("links")
	Map<String, String> links;

	@JsonProperty("contact")
	Contact contact;
}
