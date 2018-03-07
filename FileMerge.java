import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileMerge
{
	public static void main(String dt[])
	{
		FileInputStream fis1=null;
		FileInputStream fis2=null;
		FileInputStream fis3=null;
		FileOutputStream fos=null;
		int count=0;
		try
		{
			fis1=new FileInputStream("part1.txt");//reading file
			fis2=new FileInputStream("part2.txt");//reading file
			fis3=new FileInputStream("part3.txt");//reading file
			fos=new FileOutputStream("merge.txt");//writing file
			int c=0;
			byte[] b=new byte[5];//Buffer
			//can read any file byte by byte,char can be used only for string//Reads 1KB data at a time
			while(((c=fis1.read(b))!=-1)||((c=fis2.read(b))!=-1)||((c=fis3.read(b))!=-1))
			{
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