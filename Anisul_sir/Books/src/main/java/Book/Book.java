
package Book;

import java.util.Scanner;

public class Book {
    
    String title;
    String author;
    double price;
    
    
    Book(){
        
        System.out.println("No parameter constructor");
    }
    Book(String title,String author,double price){
        
        this.title=title;
        this.author=author;
        this.price=price;
          
    }
    void display(){
        
        System.out.println("BOOk TITLE:"+title);
        
        System.out.println("BOOK WRITER:"+author);
        System.out.println("PRICE:"+price);
         
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Book s1=new Book();
        System.out.print("Enter Title:");
        s1.title=input.nextLine();
        System.out.print("Enter writer name:");
        s1.author=input.nextLine();
        System.out.print("Enter price:");
        s1.price=input.nextDouble();
        s1.display();
        
    }
}