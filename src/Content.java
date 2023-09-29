public class Content {

	private String content;

	public Content(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	public void show(){
		System.out.println("Book's content: " + getContent());
	}
}
