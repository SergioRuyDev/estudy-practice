package educativeDataStructures.projects;

//Amazon's Top 50 Bestselling Books Dataset
//Task I: Total number of books by an author
//Task II: All the authors in the dataset
//Task III: Names of all the books by an author#
//Task IV: Classify with a user rating
//Task V: Price of all the books by an author

import java.util.ArrayList;

public class BestSellingDataSet {

    public static void main(String[] args) {

//        reader r = new reader();    // A helper class designed to read data

        // Calling func that reads data from data.csv and returns in a 2D matrix
//        String[][] dataset= r.readDataset("data.csv");
//        printData(dataset);         // Calling print function to print a 2D array
    }

    public static void printData(String dataset[][]) {
        for(int i=1; i<dataset.length; i++) {
            System.out.println("Name:"+dataset[i][0]);
            System.out.println("Author:"+dataset[i][1]);
            System.out.println("Rating:"+dataset[i][2]);
            System.out.println("Reviews:"+dataset[i][3]);
            System.out.println("Price:"+dataset[i][4]);
            System.out.println("Year:"+dataset[i][5]);
            System.out.println("Genre:"+dataset[i][6]);

            System.out.println();
        }
    }

//    Task 1 The task was to find the total number of books written by an author. Look at the code below.
    public static int authorBooks(String author, String[][] dataset) {
        // Creating an ArrayList to keep books
        ArrayList<String> book = new ArrayList<String>();

        for(int i =0; i < dataset.length; i++)  // traversing the whole dataset
        {
            /* If the name of the book’s author matches with the given author, and
            the ArrayList doesn't already contain this book, then we add this book to the ArrayList
            */
            if(dataset[i][1].equals(author) && !book.contains(dataset[i][0]))
                book.add(dataset[i][0]);
        }
        return book.size();               // returning the size of array list
    }

//  Task 2 -  The task was to find the names of all the authors present in the dataset. Look at the code below.
    public static ArrayList<String> allAuthors(String[][] dataset)
    {
        // Creating an ArrayList to store the names of the authors
        ArrayList<String> author = new ArrayList<String>();

        for(int i=1; i<dataset.length; i++)    // traversing thw whole dataset
        {
            // If the author is not already present in the ArrayList authors, then we add their name to the ArrayList
            if(author.contains(dataset[i][1]) == false)
                author.add(dataset[i][1]);
        }
        return author;  // returning the authors' list
    }

//    Task 3 - The task was to find the names of all the books written by a particular author.
    public static ArrayList<String> booksByAuthors(String author, String[][] dataset)
    {
        // Creating an ArrayList to store the names of books written by the specified author
        ArrayList<String> books = new ArrayList<String>();

        for(int i=1; i<dataset.length; i++)    // traversing the dataset
        {
            // If the record’s author matches the given author and books doesn't already contain the book, then we add
            // the book to books
            if(author.equals(dataset[i][1]) && !books.contains(dataset[i][0]))
                books.add(dataset[i][0]);
        }
        return books;   // return the books list
    }

//   Task 4 - The task was to find the books along with their author’s names, having a specific user rating on Amazon.
    public static ArrayList<String> booksRating(String[][] dataset, String rating)
    {
        // Creating an ArrayList to store the name of books and their authors
        ArrayList<String> book = new ArrayList<String>();

        for(int i=1; i<dataset.length; i++)
        {
            // If the record’s rating matches the given rating, and book doesn't already contain the book name, then we
            // add the book and its author to the ArrayList
            if(dataset[i][2].equals(rating) && !book.contains(dataset[i][0]+" by "+ dataset[i][1]))
                book.add(dataset[i][0] +" by "+ dataset[i][1]);
        }
        return book;    // return the book list
    }

// Task 5 - The task was to provide the names and prices of all the books written by a specific author in the form of a
// 2D array.
    public static String[][] booksAndPrice(String[][] dataset, String author)
    {
        // Creating two ArrayLists to store name of books and price respectively
        ArrayList<String> book = new ArrayList<String>();
        ArrayList<String> price = new ArrayList<String>();

        for(int i=1; i<dataset.length; i++)
        {
            // If author matches, and book doesn't already contain the book name
            if(dataset[i][1].equals(author) && !book.contains(dataset[i][0]))
            {
                book.add(dataset[i][0]);    // adding book
                price.add(dataset[i][4]);   // adding price
            }
        }

        // Creating 2D array with row equal to book.size
        String[][] result = new String [book.size()][2];
        for(int i = 0; i < result.length; i++)
        {
            result[i][0] = book.get(i);
            result[i][1] = price.get(i);
        }
        return result;                   // returning 2D array
    }
}
