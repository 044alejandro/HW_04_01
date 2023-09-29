public class Book {
	public static void main(String[] args) {
		Title title = new Title("The Midnight Garden");
		Author author = new Author("Emily Thompson");
		Content content = new Content("Lost Treasure");

		title.show();
		author.show();
		content.show();

	}
}
