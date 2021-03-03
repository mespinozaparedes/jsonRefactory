package pe.com.entelgy.jsonrefactory.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.entelgy.jsonrefactory.controller.JsonFactoryResponse;
import pe.com.entelgy.jsonrefactory.feign.JSONPlaceHolderClient;
import pe.com.entelgy.jsonrefactory.service.JsonFactoryService;

@Service
public class JsonFactoryServiceImpl implements JsonFactoryService {
	@Autowired
	private JSONPlaceHolderClient jSONPlaceHolderClient;

	@Override
	public JsonFactoryResponse transform() {
		List<Map<String, Object>> comments = jSONPlaceHolderClient.getComments();
		JsonFactoryResponse result = new JsonFactoryResponse();
		List<String> keys = Arrays.asList("postId", "id", "email");
		List<String> data = comments.stream()
				.map(value -> value.keySet().stream().filter(e -> keys.contains(e)).collect(Collectors.joining("|")))
				.collect(Collectors.toList());

		result.setData(data);

		return result;
	}

}
