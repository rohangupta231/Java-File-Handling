import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileCopyDemo
{
	public static void main(String dt[])
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("abc.txt");//reading file
			fos=new FileOutputStream("xyz.txt");//writing file
			int c=0;
			byte[] b=new byte[10];//Buffer
			//can read any file byte by byte,char can be used only for string//Reads 1KB data at a time
			while((c=fis.read(b))!=-1)
			{
				System.out.println(c);
				fos.write(b,0,c);
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