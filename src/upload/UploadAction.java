package upload;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UploadAction extends ActionSupport{
	private List<File> uploads = new ArrayList<File>();
	private List<String> uploadsContentType = new ArrayList<String>();
	private List<String> uploadsFileName = new ArrayList<String>();
	private String uploadFilePath = "C:\\java\\work\\Struts2\\WebContent\\images\\";
	
	
	public String upload() throws Exception{
		for(int i=0;i<uploads.size();i++) {
			File destFile = new File(uploadFilePath+getUploadsFileName().get(i));
			FileUtils.copyFile(getUploads().get(i), destFile);
		}
		
		return SUCCESS;
	}
	
	public List<File> getUploads() {
		return uploads;
	}
	public void setUploads(List<File> uploads) {
		this.uploads = uploads;
	}
	public List<String> getUploadsContentType() {
		return uploadsContentType;
	}
	public void setUploadsContentType(List<String> uploadsContenType) {
		this.uploadsContentType = uploadsContenType;
	}
	public List<String> getUploadsFileName() {
		return uploadsFileName;
	}
	public void setUploadsFileName(List<String> uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}
	public String getUploadFilePath() {
		return uploadFilePath;
	}
	public void setUploadFilePath(String uploadFilePath) {
		this.uploadFilePath = uploadFilePath;
	}
	
}
