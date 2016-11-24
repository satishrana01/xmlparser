package com.fenintechnologies.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class FenintechnoClient {

	public static String getResponse(String serviveName) {
		Client client = Client.create();
		WebResource resource = client.resource(serviveName);
		String response = resource.get(String.class);
		return response;
	}
}
