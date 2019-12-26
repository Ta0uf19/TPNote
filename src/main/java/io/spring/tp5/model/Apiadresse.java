package io.spring.tp5.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Apiadresse {
	
    @JsonProperty("features")
	public List<Feature> features = new ArrayList<Feature>();
    @JsonProperty("type")
	public String type;


	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "Apiadresse [features=" + features + ", type=" + type + "]\n";
	}


	
}