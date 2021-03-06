package net.famunity.csihome.spring.cloud.microservices.foo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

	@Value("${foo.service.message:Hello default - foo}")
	private String message;

	@RequestMapping("/foo")
	String getMessage() {
		return this.message;
	}
}
