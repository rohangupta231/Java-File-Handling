import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileSplit
{
	public static void main(String dt[])
	{
		FileInputStream fis=null;
		FileOutputStream fos1=null;
		FileOutputStream fos2=null;
		FileOutputStream fos3=null;
		int count=0;
		try
		{
			fis=new FileInputStream("abc.txt");//reading file
			fos1=new FileOutputStream("part1.txt");//writing file
			fos2=new FileOutputStream("part2.txt");//writing file
			fos3=new FileOutputStream("part3.txt");//writing file
			int c=0;
			byte[] b=new byte[5];//Buffer
			//can read any file byte by byte,char can be used only for string//Reads 1KB data at a time
			while(((c=fis.read(b))!=-1))
			{
				if(count==0)
				{	
					//System.out.println(c);
					fos1.write(b,0,c);
					count=count+1;
				}	
				else if(count==1)
				{
					fos2.write(b,0,c);
					count=count+1;
				}
				else
				{
					fos3.write(b,0,c);
				}
				
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
				fos1.close();
				fos2.close();
				fos3.close();
			}
			catch(Exception e)
			{
				System.out.print("Finally "+e);
			}			
		}
	}
}