



public class Main {
    public static void main(String[] args) {

        //Book
        System.out.println("--------------------Test class Book--------------------");
        Book b = new Book("Concepts of Physical Chemistry Through Problems",65,"Dilip Kumar Khamrui");
        System.out.println("Name of book : "+b.getName());
        System.out.println("Author : "+b.getAuthor());
        System.out.println("Price : "+b.getPrice());
        System.out.println("Price after discount 10% : "+b.getDiscount());

        //Movie
        System.out.println("--------------------Test class Movie--------------------");
        Movie m = new Movie("THE GODFATHER",100,"Francis Ford Coppola");
        System.out.println("The name of movie : "+m.getName());
        System.out.println("Director : "+m.getDirector());
        System.out.println("Price : "+m.getPrice());
        System.out.println("Price after discount 20% : "+m.getDiscount());

        //MovablePoint
        System.out.println("--------------------Test class MovablePoint--------------");
        MovablePoint mp = new MovablePoint(2,2,4,4);
        System.out.println("Original "+mp.toString());
        mp.moveDown();
        System.out.println("Move down : "+mp.toString());
        mp.moveUp();
        System.out.println("Move Up : "+mp.toString());
        mp.moveLeft();
        System.out.println("Move Left : "+mp.toString());
        mp.moveRight();
        System.out.println("Move Right : "+mp.toString());






    }
}