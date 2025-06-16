package txu.hrm.mainapp.dto;

import lombok.Getter;
import lombok.Setter;
import txu.hrm.mainapp.entity.CommentEntity;

@Getter
@Setter
public class CreateUpdateCommentRequest {
    CommentEntity comment;
}
