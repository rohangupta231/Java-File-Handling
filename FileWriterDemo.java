import java.io.FileWriter;
class FileWriterDemo
{
	public static void main(String dt[])
	{
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter("abc.txt",true);//path in constructor//*true for append mode
			fw.write("Hello World\n");
			fw.write("Java File Handling\n");
			fw.write(97);
			fw.write("65\n");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fw.close();//closing is import so that other process can access the file
			}
			catch(Exception e)
			{
				System.out.println("finally "+e);
			}
		}
	}
}