package org.technischools.technibook.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischools.technibook.posts.api.CreatePostRequest;
import org.technischools.technibook.posts.model.Post;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(CreatePostRequest createPostRequest) {
        Post newPost = Post.builder()
                .createdDate(new Date())
                .uuid(UUID.randomUUID().toString())
                .userUuid(createPostRequest.getUserUuid())
                .content(createPostRequest.getContent())
                .visibility(createPostRequest.getPostVisibility())
                .build();
        return postRepository.save(newPost);
    }

    public Post getPost(String uuid) {
        return postRepository.findByUuid(uuid);
    }
}
