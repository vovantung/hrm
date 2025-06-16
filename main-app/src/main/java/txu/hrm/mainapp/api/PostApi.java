package txu.hrm.mainapp.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import txu.hrm.mainapp.base.AbstractApi;
import txu.hrm.mainapp.dto.CreateUpdatePostRequest;
import txu.hrm.mainapp.dto.GetPostRequest;
import txu.hrm.mainapp.entity.PostEntity;
import txu.hrm.mainapp.service.PostService;


import java.util.List;

@CrossOrigin(origins = "*", allowCredentials = "false", maxAge = 86400, allowedHeaders = "*")
@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostApi extends AbstractApi {

    private final PostService postService;

    @PostMapping(value = "/create-or-update", consumes = "application/json")
    public PostEntity createOrUpdate(@RequestBody CreateUpdatePostRequest request) {
        return postService.createOrUpdate(request.getPost());
    }

    @PostMapping(value = "/get-post", consumes = "application/json")
    public PostEntity getByUnsignedTitle(@RequestBody GetPostRequest request) {
        return postService.getByUnsignedTitle(request.getUnsignedTitle());

    }

    @PostMapping(value = "/get-all-post", consumes = "application/json")
    public List<PostEntity> getAllPost() {
        return postService.getAllPost();
    }
}
