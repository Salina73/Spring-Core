package com.BeanScope;
public class Book 
{
    private String title;
    private String author;
  
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void getBookDetails(String book)
    {
        System.out.println("**Published "+book+" Details**");
        System.out.println("Book Title        : "+title);
        System.out.println("Book Author       : "+author);
        
    }
}