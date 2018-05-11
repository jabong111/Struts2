package hello.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	private String name;
	private String msg;
	
	public void validate() {
		if(name == null || "".equals(name)) {
			addFieldError("validate", "ENTER NAME!!");
		}
	}
	
	public void setName(String name) {	//�Ķ���Ͱ� �޾ƿ���  ex:request.getParameter
		this.name = name;
	}
	
	public String getMsg() {	//������ ���� ex: request.setAttribute();
		return msg;
	}
	
	public String execute() throws Exception{
		msg = "hello "+name;
		return SUCCESS;
	}
	
	
	

}
