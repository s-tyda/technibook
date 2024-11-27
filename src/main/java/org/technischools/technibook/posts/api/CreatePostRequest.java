package org.technischools.technibook.posts.api;

import lombok.Data;
import org.technischools.technibook.posts.model.PostVisibility;

@Data
public class CreatePostRequest {
    private String userUuid;
    private PostVisibility postVisibility;
    private String content;
}
