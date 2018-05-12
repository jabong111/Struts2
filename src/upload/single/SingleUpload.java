package upload.single;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class SingleUpload extends ActionSupport{
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String uploadPath = "C:\\java\\work\\Struts2\\WebContent\\image\\";
	
	public String upload() throws Exception{
		File destFile = new File(uploadPath+getUploadFileName());
		FileUtils.copyFile(getUpload(), destFile);
		
		return SUCCESS;
	}
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	
	

}
