package hello;

public class Greeting {
	private final long myId;
	private final String myContent;

	public Greeting(long id, String content) {
		myId = id;
		myContent = content;
	}

	public String getContent() {
		return myContent;
	}

	public long getId() {
		return myId;
	}
}