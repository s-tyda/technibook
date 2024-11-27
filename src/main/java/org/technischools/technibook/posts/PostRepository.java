package org.technischools.technibook.posts;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.technischools.technibook.posts.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    Post findByUuid(String uuid);
}
