public class BookClass{
    public static void main(String[] args) {
       
        System.out.println("Book:");
        Book b1 =new Book();
        b1.setBook_Number(1); 
        b1.setPrice ((int)(500.00));
        b1.setTitle("Holy Bible");
    
        System.out.println("Book_Number:" + b1.getBook_Number());
        System.out.println("Title:" + b1.getTitle());
        System.out.println("Price:" + b1.getPrice());
    }
}



