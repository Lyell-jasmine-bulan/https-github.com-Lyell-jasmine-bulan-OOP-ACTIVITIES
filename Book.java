public class Book {
        private int Book_Number;
        private String Title;
        private int Price; 
    
    
        public void setBook_Number(int number ){
            this.Book_Number = number;
        }
        public int getBook_Number() {
            return Book_Number;
        }
         
    
        public void setTitle(String title){
            this.Title = title;
        }

        public void setPrice(int Price){
            this.Price = Price;
        }

        
        public String getTitle() {
            return Title;
        }


        public int getPrice(){
            return Price;
        }

}
