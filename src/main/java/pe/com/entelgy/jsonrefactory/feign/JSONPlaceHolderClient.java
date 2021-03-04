package pe.com.entelgy.jsonrefactory.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
@FeignClient(value = "jplaceholder", url = "${consume}")
public interface JSONPlaceHolderClient {
	
	@GetMapping(path = "${urlpath}")
    List<Map<String, Object>> getComments();

}
