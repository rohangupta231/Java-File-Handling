import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileEncryption
{
	public static void main(String dt[])
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try6
		{
			fis=new FileInputStream("normal.txt");//reading file
			fos=new FileOutputStream("encrypted.txt");//writing file
			int c=0;
			while((c=fis.read())!=-1)
			{
				System.out.println(c);
				fos.write((char)(c+3));
			}
		}
		catch(Exception e)
		{
			System.out.print("Exception "+e);
		}
		finally
		{
			try
			{
				fos.close();
			}
			catch(Exception e)
			{
				System.out.print("Finally "+e);
			}			
		}
	}
}