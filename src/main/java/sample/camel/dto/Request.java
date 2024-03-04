package sample.camel.dto;

public class Request {

    private String date;

    private String name;

    public Request() {
    }

    public Request(String name, String date) {
        this.name = name;
        this.date = date;
    }

	public String getName() {
		return name;
	}

    public String getDate() {
        return date;
    }

	public void setName(String name) {
		this.name = name;
	}

    public void setDate(String date) {
        this.date = date;
    }

   
}