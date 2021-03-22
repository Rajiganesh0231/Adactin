package dataProvider;

public class FileReaderManager {
	
	public FileReaderManager() {
		
	}

	public static  FileReaderManager getInstance() {
		FileReaderManager hp = new FileReaderManager();
		return hp;
	}
	
	
	public Configfile getCrInstance() throws Exception{
		Configfile con = new Configfile();
		
		return con;
	}
}
