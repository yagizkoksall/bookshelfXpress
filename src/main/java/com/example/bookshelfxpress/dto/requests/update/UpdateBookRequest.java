package com.example.bookshelfxpress.dto.requests.update;

public class UpdateBookRequest {
    private String title;
    private String booksName;
    private double price;
    private int publicationYear;
    private int pageCount;
    private boolean available;

    public String getTitle() {
        return title;
    }


    public String getBooksName() {
        return booksName;
    }


    public double getPrice() {
        return price;
    }



    public int getPublicationYear() {
        return publicationYear;
    }



    public int getPageCount() {
        return pageCount;
    }


    public boolean isAvailable() {
        return available;
    }

}
