package pe.com.entelgy.jsonrefactory.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/comments")
    List<Map<String, Object>> getComments();

}
