package com.testvideoanalysis.path;
import org.springframework.stereotype.Service;

@Service
public class PathManager {

	private String root 			= "";
	private String src 				= "";
	private String jsonFiles 		= "";
	private String pythonSrc 		= "";
	private String downloadedVideos = "";
	
	PathManager(){
		root 				+= "/home/neel/sts-workspace/Test-Video-Analysis-API/";
		src 				+= "src/";
		jsonFiles 			+= "json-files/";
		pythonSrc			+= "python-src/";
		downloadedVideos 	+= "downloaded-videos/";
		
	}
	
	public String getRoot() {
		return root;
	}
	
	public String getSrc() {
		return root + src;
	}
	
	public String getJsonFiles () {
		return root + jsonFiles;
	}
	
	public String getPythonSrc() {
		return root + pythonSrc;
	}
	
	public String getDownloadedVideos() {
		return root + downloadedVideos;
	}
}
