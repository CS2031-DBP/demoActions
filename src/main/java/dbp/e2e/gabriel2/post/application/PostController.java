package dbp.e2e.gabriel2.post.application;

import dbp.e2e.gabriel2.author.domain.Author;
import dbp.e2e.gabriel2.post.domain.Post;
import dbp.e2e.gabriel2.post.domain.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> posts(){
        return ResponseEntity.ok(postService.getAll());
    }

    @PostMapping
    public ResponseEntity<Post> newAuthor(@RequestBody Post post){
        Post post1 = postService.createPost(post);
        return ResponseEntity.ok(post1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

}
