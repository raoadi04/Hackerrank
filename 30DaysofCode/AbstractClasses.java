class MyBook extends Book// Declare your class here. Do not use the 'public' access modifier.
{
    int price;// Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    public MyBook(String title, String author, int price)// Write your constructor here
    {
        super(title,author);
        this.price = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    public void display()// Write your method here
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
// End class
}  
