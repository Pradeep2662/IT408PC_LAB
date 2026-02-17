java.io.FileInputStream;
class L4P4{
	public static void main(String[] args){
		File f=new File("ABC.java");
		readFile(f);
    } 
    public static void readFile(File f){
        try{
            FileInputStream fis=new FileInputStream(f);
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
	
	