package txu.hrm.mainapp.dto;

import lombok.Getter;
import lombok.Setter;
import txu.hrm.mainapp.entity.PostEntity;

@Getter
@Setter
public class CreateUpdatePostRequest {
    PostEntity post;
}
