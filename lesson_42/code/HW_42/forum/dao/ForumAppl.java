package HW_42.forum.dao;
import HW_42.forum.dao.ForumImpl;
import HW_42.forum.dao.Forum;
import HW_42.forum.model.Post;
import auto_application.models.Auto;

import java.util.Scanner;

public class ForumAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to Forum!");
        ForumImpl forum = new ForumImpl(1000);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.printMenu();
            System.out.println();
            System.out.println("Please input your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{//Add post
                    scanner.nextLine();
                    System.out.println("Please input your  post: ");
                    String post = scanner.nextLine();
                    Post post1 = new Post();
                    forum.addPost(post1);
                    break;
                }
                case 2:{//list posts
                    System.out.println("Your post are: ");
                    forum.printPost();
                    break;
                }
                case 3:{//remove posts
                    System.out.println("Please input your  Id number");
                    int id = scanner.nextInt();
                    forum.removePost(id);
                    System.out.println("Post with " + id + "id " + "is removed.");
                    break;

                }
                case 4:{
                    System.out.println("Please input your  Id number");
                    int id = scanner.nextInt();
                    Post foundId = forum.getPostById(id-1);
                    System.out.println( "Post  found "+ foundId);
                    break;
                }
                case 5:{
                    System.out.println("Which author´s posts are you looking for?");
                    String author = scanner.nextLine();
                    Post[] actual = forum.getPostByAuthor(author);
                    System.out.println( "Post  found"+ actual);
                    break;
                }

                case 6:
                    return;
                default:{
                    System.out.println("Wrong input!");
                }
            }//end of switch
        }//end of while

    }//end of main
}// end of ForumAppl
