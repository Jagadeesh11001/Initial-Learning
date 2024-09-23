package hello;

public class Methods {

	// accessModifier returnType methodName(parameter){}
	// accessModifiers - Public,Private,Protected & default/package
	
	// methodOverloading start
	public static void main(String[] args) {
		Methods mt = new Methods();
		mt.deleteVideo("kjbsdsb11");
		mt.deleteVideo(123);
		mt.deleteVideo(true);
	}
	private void deleteVideo(String videoId) {
		System.out.println("Deleted Video - " + videoId);
	}
	private void deleteVideo(int videoId) {
		System.out.println("Deleted Video - " + videoId);
	}
	private void deleteVideo(boolean videoId) {
		System.out.println("Deleted Video - " + videoId);
	}
	// methodOverloading end	

	
	public void createVideo() {
		System.out.println("Video Created");
	}
	
	public boolean uploadVideo(){
		System.out.println("Uploading");
		return true;
	}
	
	public String shareVideo() {
		return "Facebook";
	}
}
