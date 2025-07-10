package txu.hrm.mainapp.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import txu.common.exception.TxException;

@CrossOrigin(origins = "*", allowCredentials = "false", maxAge = 86400, allowedHeaders = "*")
@RestController
public class TestApi {
    @GetMapping(value = "/test")
    public String test() {
//        throw new TxException("test");
        return "test";
    }
}
