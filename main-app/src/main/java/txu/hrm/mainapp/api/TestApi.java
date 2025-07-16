package txu.hrm.mainapp.api;

import org.springframework.web.bind.annotation.*;
import txu.common.exception.TxException;
import txu.hrm.mainapp.dao.DtoTest;
import txu.hrm.mainapp.dto.GetPostRequest;

@CrossOrigin(origins = "*", allowCredentials = "false", maxAge = 86400, allowedHeaders = "*")
@RestController
public class TestApi {
    @PostMapping(value = "/test")
    public DtoTest test() {
//        throw new TxException("test");
        DtoTest test = new DtoTest();
        test.setTest("Hello World");
        return test;
    }
}
