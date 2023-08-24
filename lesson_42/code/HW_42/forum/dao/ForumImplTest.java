package HW_42.forum.dao;

import HW_42.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    Forum forum;
    LocalDateTime now = LocalDateTime.now();
    Post[]posts;

    @BeforeEach
    void setUp() {
        forum = new ForumImpl(10);
        posts[0] = new Post(1,"Weather","Antonina","Today is very nice weather");
        posts[1] = new Post(2,"Cats","Susann","I have 2 Cats");
        posts[2] = new Post(3,"Cars","John","I like fast cars");
        posts[3] = new Post(4,"Autos","Anna","I like Tesla");
       for (int i = 0; i < posts.length; i++) {
          forum.addPost(posts[i]);
        }
   }

    @Test
    void addPost() {
        forum.size();
     //   posts[4] = new Post(5,"Autos","Anna","I like Tesla");
       // assertTrue(forum.addPost(posts[4]));
    }

    @Test
    void removePost() {
    }

    @Test
    void updatePost() {
    }

    @Test
    void getPostById() {
    }

    @Test
    void getPostByAuthor() {
    }

    @Test
    void testGetPostByAuthor() {
    }

    @Test
    void size() {
    }
}