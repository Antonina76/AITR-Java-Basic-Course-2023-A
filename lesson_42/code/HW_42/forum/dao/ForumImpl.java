package HW_42.forum.dao;

import HW_42.forum.model.Post;
import practice41.album.model.Photo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;



public class ForumImpl implements Forum {
    static Comparator<Post> postComparator = (p1, p2) -> {
        int res = p1.getPostId()-p2.getPostId();//sort by comparator
        return res;
    };
    final String OUTPUT = "tasks.txt";
    final String INPUT = "tasks.txt";
    private Post[] posts;
    private int size;

    //constructor


    public ForumImpl(int capacity) {
        posts = new Post[capacity];

    }

    @Override
    public boolean addPost(Post post) {
            Post tmp = getPostById(post.getPostId());
            if (post == null || getPostById(post.getPostId()) != null) {
                return false;
            }
            posts = Arrays.copyOf(posts, posts.length + 1);
            posts[posts.length - 1] = post;
            size++;
            return true;
     /*   if (post == null) {
            return false;
        }
        Post postsCopy[]= Arrays.copyOf(posts,size+1);
     //   posts = Arrays.copyOf(posts,posts.length+1);
       int index = Arrays.binarySearch(postsCopy, 0,size,post, postComparator);
        //found a place to put the post and sorting array by comparator
       index = index >= 0 ? index : -index - 1;//processes the index
       System.arraycopy(posts, 0, postsCopy, 0, index);//copy array elements from the index one place to the right
       System.arraycopy(postsCopy,index,postsCopy,index+1,size-index);
        postsCopy[index] = post;//insert post
        size++;
        posts=postsCopy;
        return true;

      */
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i].getPostId()==postId)
                System.arraycopy(posts,i +1,posts,i,size-1-i);
            posts[--size] = null;
                return true;
        }
        return false;
    }


    @Override
    public boolean updatePost(int postId, String content) {
        Post post =getPostById(postId);
        if (post == null){
            return false;
        }
      post.setContent(content);
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        Post pattern = new Post(postId,null,null,null);
        for (int i = 0; i < size; i++) {
            if(pattern.equals(posts[i])){
                return posts[i];
            }

        }
        return null;
    }

    @Override
    public Post[] getPostByAuthor(String author) {

        return findByPredicate (p -> p.getAuthor().equals(author));
    }

    @Override
    public Post[] getPostByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
       Post pattern = new Post(author,dateFrom.atStartOfDay());
       int from = -Arrays.binarySearch(posts,0,size,pattern,postComparator)-1;
       pattern = new Post(author, LocalDateTime.of(dateTo, LocalTime.MAX));
       int to = -Arrays.binarySearch(posts,from,size,pattern,postComparator);
       return Arrays.copyOfRange(posts, from, to);

    }

    @Override
    public int size() {
        return size;
    }
    private Post[] findByPredicate (Predicate<Post> predicate){
        Post[] res = new Post[size];
        int j = 0;//счетчик найденных по условию постов
        for (int i = 0; i < size; i++) {
            if(predicate.test(posts [i])){
                res [j++] = posts[i];
            }
        }
        return Arrays.copyOf(res,j);//копируем только ту часть, где нет null
    }
    public void printPost() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
        System.out.println("You have " + size + " posts. ");

    }
    public void savePosts() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT));
        for (int i = 0; i < size; i++) {
            String post = String.valueOf(posts[i]);//переводим tasks[i] в строку
            bufferedWriter.write(post + "\n");
        }
        bufferedWriter.flush();
    }
}
