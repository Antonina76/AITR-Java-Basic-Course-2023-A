package HW_42.forum.dao;

import HW_42.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    ForumImpl forum;
    Post[]posts;
    LocalDateTime now = LocalDateTime.now();


 @BeforeEach
    void setUp() {
      forum = new ForumImpl(10);
      posts = new Post[7];
      posts[0] = new Post(1,"Weather","Antonina","Con",LocalDateTime.of(now.minusDays(2).toLocalDate(),LocalTime.MAX),2);
      posts[1] = new Post(2,"Cats","Susann","I have 2 Cats");
      posts[2] = new Post(3,"Cars","John","I like fast cars");
      posts[3] = new Post(4,"Autos","Anna","I like Tesla");
      posts[4] = new Post(5,"titel","Jonn","con",LocalDateTime.of(now.minusDays(3).toLocalDate(),LocalTime.MAX),1);
      posts[5] = new Post(6,"Tit","Antonina","Con",LocalDateTime.of(now.minusDays(2).toLocalDate(),LocalTime.MAX),2);

      for (int i = 0; i < posts.length; i++) {
         forum.addPost(posts[i]);
     }

       }


    @Test
    void addPost() {
        assertEquals(4,forum.size());
        Post post= new Post(5,"Autos","Anna","I like Tesla");
       assertTrue(forum.addPost(post));
       assertEquals(5,forum.size());
       assertFalse(forum.addPost(null));

    }

    @Test
    void removePost() {
    assertTrue(forum.removePost(3));
    assertEquals(3,forum.size());

    }

    @Test
    void updatePost() {
     assertTrue(forum.updatePost(4,"I like Tesla"));
     assertEquals("I like Tesla",forum.getPostById(4).getContent());
    }

    @Test
    void getPostById() {
     assertEquals(posts[0],forum.getPostById(1));
    }

    @Test
    void getPostByAuthor() {
        Post[]actual = forum.getPostByAuthor("Antonina");
        Arrays.sort(actual);
        Post[] expected = {posts[0]};
        assertArrayEquals(actual,expected);

    }

    @Test
    void testGetPostByAuthor() {
        LocalDate ld = now.toLocalDate();
        System.out.println(ld);
        Post[]actual = forum.getPostByAuthor("Antonina",ld.minusDays(4),ld.minusDays(1));
        Arrays.sort(actual);
        Post[]expected = {posts[0]};
        assertArrayEquals(expected,actual);
    }

    @Test
    void size() {
     assertEquals(6,forum.size());
    }
}