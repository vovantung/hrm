package txu.hrm.mainapp.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import txu.hrm.mainapp.base.AbstractApi;
import txu.hrm.mainapp.dto.CreateUpdateCommentRequest;
import txu.hrm.mainapp.dto.GetCommentsOfPostRequest;
import txu.hrm.mainapp.dto.GetPostRequest;
import txu.hrm.mainapp.entity.CommentEntity;
import txu.hrm.mainapp.service.CommentService;


import java.util.List;


@CrossOrigin(origins = "*", allowCredentials = "false", maxAge = 86400, allowedHeaders = "*")
@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentApi extends AbstractApi {

    private final CommentService commentService;

    @PostMapping(value = "/create-or-update", consumes = "application/json")
    public CommentEntity createOrUpdate(@RequestBody CreateUpdateCommentRequest request) {
        return commentService.createOrUpdate(request.getComment());
    }

    @PostMapping(value = "/get-comment", consumes = "application/json")
    public CommentEntity getAComment(@RequestBody GetPostRequest request) {
        return commentService.getComment(request.getUnsignedTitle());
    }

    @PostMapping(value = "/get-comments-of-post", consumes = "application/json")
    public List<CommentEntity> getACommentOfPost(@RequestBody GetCommentsOfPostRequest request) {
        return commentService.getCommentOfPost(request.getPostId());
    }


    @PostMapping(value = "/get-all-comment", consumes = "application/json")
    public List<CommentEntity> getAllComment() {
        return commentService.getAllComment();
    }
}
