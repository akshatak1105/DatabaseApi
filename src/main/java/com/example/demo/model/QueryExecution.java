package com.example.demo.model;

import lombok.*;

@Getter
@Setter
public class QueryExecution {
	

	private String uiud;
	private String query;
	private String queryType;

	QueryExecution(String uiud, String query, String queryType) {
		this.uiud = uiud;
		this.query = query;
		this.queryType = queryType;
	}

	public String getUiud() {
		return uiud;
	}

	public void setUiud(String uiud) {
		this.uiud = uiud;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	
}
 
