import javax.swing.*;
class Calculation
{

	private StringBuilder strOutput;
	private int i,index;
	private String binaryNum[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
    
	Calculation()
	{
		strOutput=new StringBuilder("");
	}

	int findHexaIndex(char ch)
	{
					if(ch=='A' || ch=='a')
                    {
                        index=10;
                    }
                    else if(ch=='B' || ch=='b')
                    {
                        index=11;
                    }
                    else if(ch=='C' || ch=='c')
                    {
                        index=12;
                    }
                    else if(ch=='D' || ch=='d')
                    {
                        index=13;
                    }
                    else if(ch=='E' || ch=='e')
                    {
                        index=14;
                    }
                    else if(ch=='F' || ch=='f')
                    {
                        index=15;
                    }
                    else if(ch>='g' || ch>='G' && ch<='z' && ch<='Z')
                    {    
                        index=-1;
                    } 
                    else
                    {
                    	index=Integer.parseInt(String.valueOf(ch));
                    }
              return index;
	}

	int findDecIndex(char ch)
	{
					
                    if(ch>='a' || ch>='A' && ch<='z' && ch<='Z')
                    {
                        		index=-1;
                    }
                    else
                    {    
                        index=Integer.parseInt(String.valueOf(ch));
                    } 
              return index;
	}

	int findOctIndex(char ch)
	{
					
                    if(ch>='a' || ch>='A' && ch<='z' && ch<='Z')
                    {
                        		index=-1;
                    }
                    else if(Integer.parseInt(String.valueOf(ch))>7)
                    {    
                        index=-1;
                    } 
                    else
                    {
                    	index=Integer.parseInt(String.valueOf(ch));
                    }
              return index;
	}


	
	String convertDecimalToBinary(String strInput)
	{		
			 strOutput.delete(0,strOutput.length());
			 int quo;
			 
			 while()
        return strOutput.toString();
	}


	String convertHexaToBinary(String strInput)
	{
		strOutput.delete(0,strOutput.length());
			 for(i=0;i<strInput.length();i++)
                {
                       	index=findHexaIndex(strInput.charAt(i));
                       	if(index!=-1)
                       	{
                       		strOutput.append(binaryNum[index]);
                       	}
                       	else{
                       		strOutput.delete(0,strOutput.length());
                       		JOptionPane.showMessageDialog(null,"Not a valid Hexadecimal Number","Invalid input",1);
                       		break;
                       	}

                        
                }//end of for loop
        return strOutput.toString();
	}

	String convertOctalToBinary(String strInput)
	{
		strOutput.delete(0,strOutput.length());
			 for(i=0;i<strInput.length();i++)
                {
                       	index=findOctIndex(strInput.charAt(i));
                       	if(index!=-1)
                       	{
                       		strOutput.append(binaryNum[index].substring(1,4));
                       	}
                       	else{
                       		strOutput.delete(0,strOutput.length());
                       		JOptionPane.showMessageDialog(null,"Not a valid Octal Number","Invalid input",1);
                       		break;
                       	}

                        
                }//end of for loop
        return strOutput.toString();	
	}
}