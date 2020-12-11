import javax.swing.*;
class Calculation
{

	private StringBuilder strOutput,strTmp,strRest,chNum;
	private int i,index;
	private boolean isValid;
	private double number,floatPart=0;
	private int intPart=0,rem=0;


	private String binaryNum[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
    
	Calculation()
	{
		strOutput=new StringBuilder("");
		strTmp=new StringBuilder("");
		strRest=new StringBuilder("");
		chNum=new StringBuilder("");
	}

	boolean isValidDecimal(String strInput)
	{
				for(i=0;i<strInput.length();i++)
                {
                    if(strInput.charAt(i)>='a' || strInput.charAt(i)>='A' && strInput.charAt(i)<='z' && strInput.charAt(i)<='Z')
                    {
                       isValid=false; 		
                    }
                    else
                    {    
                       isValid=true;
                    }
                } 
              return isValid;
	}

	int findOctIndex(char ch)
	{
					
                    if(ch>='a' || ch>='A' && ch<='z' && ch<='Z')
                    {
                        		index=-1;
                    }
                    else if(ch=='.')
                    {
                    	index=-2;
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

	int findHexaIndex(char ch)
	{				
					if(ch=='.')
					{
						index=-2;
					}
					else if(ch=='A' || ch=='a')
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
	StringBuilder findHexaNum(int ch)
	{				chNum.delete(0,chNum.length());
					
					if(ch==10)
                    {
                        chNum.append("A");
                    }
                    else if(ch==11)
                    {
                        chNum.append("B");
                    }
                    else if(ch==12)
                    {
                        chNum.append("C");
                    }
                    else if(ch==13)
                    {
                        chNum.append("D");
                    }
                    else if(ch==14)
                    {
                        chNum.append("E");
                    }
                    else if(ch==15)
                    {
                        chNum.append("F");
                    }
                    else
                    {
                    	chNum.append(ch);
                    }
              return chNum;
	}
	boolean isValidBinary(String strInput)
	{

		index=0;
		for(i=0;i<strInput.length();i++)
		{	
					if(strInput.charAt(i)=='.')
					{

						index=i;
						//System.out.println("test....index:"+index);

					}
					else if(strInput.charAt(i)>='a' || strInput.charAt(i)>='A' && strInput.charAt(i)<='z' && strInput.charAt(i)<='Z')
                    {
                        		isValid=false;
                    }
                    else if(Integer.parseInt(String.valueOf(strInput.charAt(i)))>1)
                    {    
                        		isValid=false;
                    } 
                    else
                    {
                    			isValid=true;
                    }
		}

		return isValid;
	}

	boolean isValidHexa(String strInput)
	{
		    for(i=0;i<strInput.length();i++)
		    {
		    						
		    		if(strInput.charAt(i)=='.')
					{
						isValid=true;
						index=i;
					}
					else if(strInput.charAt(i)=='A' || strInput.charAt(i)=='a')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)=='B' || strInput.charAt(i)=='b')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)=='C' || strInput.charAt(i)=='c')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)=='D' || strInput.charAt(i)=='d')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)=='E' || strInput.charAt(i)=='e')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)=='F' || strInput.charAt(i)=='f')
                    {
                        isValid=true;
                    }
                    else if(strInput.charAt(i)>='g' || strInput.charAt(i)>='G' && strInput.charAt(i)<='z' && strInput.charAt(i)<='Z')
                    {    
                        isValid=false;
                    } 
                    else
                    {
                    	isValid=true;
                    }
              
		    }
		    return isValid;
	}
	boolean isValidOctal(String strInput)
	{
		index=0;
		for(i=0;i<strInput.length();i++)
		{
					if(strInput.charAt(i)=='.')
					{
						index=i;
					}
					else if(strInput.charAt(i)>='a' || strInput.charAt(i)>='A' && strInput.charAt(i)<='z' && strInput.charAt(i)<='Z')
                    {
                        		isValid=false;
                    }
                    else if(Integer.parseInt(String.valueOf(strInput.charAt(i)))>7)
                    {    
                        		isValid=false;
                    } 
                    else
                    {
                    			isValid=true;
                    }
		}
		return isValid;
	}




	String convertOctalToHexa(String strInput)
	{
		strOutput.delete(0,strOutput.length());
		strTmp.delete(0,strTmp.length());
			 for(i=0;i<strInput.length();i++)
                {
                	if(isValidOctal(strInput)==true)
                    {
                       	index=findOctIndex(strInput.charAt(i));
                       	if(index==-2)
                       	{
                       		strTmp.append('.');
                       	}
                       	else if(index!=-1)
                       	{
                       		strTmp.append(binaryNum[index].substring(1,4));
                       	}
                       	

                    }
                }//end of for loop

                System.out.println("strTmp:"+strTmp);




        return strOutput.toString();
	}







	String convertDecimalToBinary(String strInput)
	{		
			 strOutput.delete(0,strOutput.length());
			 i=0;
			 if(isValidDecimal(strInput)==true)
			 {
			 	number=Double.valueOf(strInput);
			 	intPart=(int)number;
			 	floatPart=number-intPart;
			 	//process on integer part
			 	if(intPart>0)
			 	{
			 		while(intPart!= 0)
			 		{
			 			rem=intPart%2;
			 			intPart=intPart/2;
			 			strOutput.insert(0, rem);
			 			i++;
			 		}  
			 		//System.out.println("int output: "+strOutput.toString());
			 	}
			 	//process on float part
			 	if(floatPart>0)
			 	{
			 		strOutput.append('.');
			 		while(floatPart<1)
			 		{	
			 			floatPart=floatPart*2;
			 			rem=(int)floatPart;
			 			strOutput.append(rem);
			 		}
			 	}
			 }//end of if(isValidDecimal)
			 else
			 {
			 	JOptionPane.showMessageDialog(null,"Not a valid Decimal Number","Invalid input",1);
			 }
        return strOutput.toString();
	}


	String convertDecimalToOctal(String strInput)
	{
		 strOutput.delete(0,strOutput.length());
			 i=0;
			 if(isValidDecimal(strInput)==true)
			 {
			 	number=Double.valueOf(strInput);
			 	intPart=(int)number;
			 	floatPart=number-intPart;
			 	//process on integer part
			 	if(intPart>0)
			 	{
			 		while(intPart!= 0)
			 		{
			 			rem=intPart%8;
			 			intPart=intPart/8;
			 			strOutput.insert(0, rem);
			 			
			 		}  
			 		//System.out.println("int output: "+strOutput.toString());
			 	}
			 	//process on float part
			 	if(floatPart>0)
			 	{
			 		i=0;
			 		strOutput.append('.');
			 		while(i<3)
			 		{	
			 			i++;
			 			floatPart=floatPart*8;
			 			rem=(int)floatPart;
			 			
			 			floatPart=floatPart-rem;
			 			strOutput.append(rem);
			 		}
			 	}
			 }//end of if(isValidDecimal)
			 else
			 {
			 	JOptionPane.showMessageDialog(null,"Not a valid Decimal Number","Invalid input",1);
			 }
        return strOutput.toString();
	}
	String convertDecimalToHexa(String strInput)
	{
		strOutput.delete(0,strOutput.length());
			 i=0;
			 if(isValidDecimal(strInput)==true)
			 {
			 	number=Double.valueOf(strInput);
			 	intPart=(int)number;
			 	floatPart=number-intPart;
			 	//process on integer part
			 	if(intPart>0)
			 	{
			 		while(intPart!= 0)
			 		{
			 			rem=intPart%16;
			 			intPart=intPart/16;

			 			strOutput.insert(0, findHexaNum(rem));
			 			
			 		}  
			 		//System.out.println("int output: "+strOutput.toString());
			 	}
			 	//process on float part
			 	if(floatPart>0)
			 	{
			 		i=0;
			 		strOutput.append('.');
			 		while(i<2)
			 		{	
			 			i++;
			 			floatPart=floatPart*16;
			 			rem=(int)floatPart;
			 			strOutput.append(findHexaNum(rem));
			 		}
			 	}
			 }//end of if(isValidDecimal)
			 else
			 {
			 	JOptionPane.showMessageDialog(null,"Not a valid Decimal Number","Invalid input",1);
			 }
        return strOutput.toString();
	}
	String convertOctalToBinary(String strInput)
	{
		strOutput.delete(0,strOutput.length());
			 for(i=0;i<strInput.length();i++)
                {
                       	index=findOctIndex(strInput.charAt(i));
                       	if(index==-2)
                       	{
                       		strOutput.append('.');
                       	}
                       	else if(index!=-1)
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
	String convertOctalToDecimal(String strInput)
	{
			strOutput.delete(0,strOutput.length());
			 i=0;
			 rem=0;
			 if(isValidOctal(strInput)==true)
			 {
			 	if(index<=0)
			 	{
			 		index=0;
			 		for(i=strInput.length()-1;i>=0;i--)
			 		{
			 			rem=rem+Character.getNumericValue(strInput.charAt(i))*(int)Math.pow(8,index);
			 			index++;
			 		}
			 		strOutput.append(rem);
			 	}


			 	else if(index>0)
			 	{	
			 		intPart=0;
			 		//for integer part
			 		for(i=index-1;i>=0;i--)
			 		{
			 			rem=rem+Character.getNumericValue(strInput.charAt(i))*(int)Math.pow(8,intPart);
			 			intPart++;
			 		}	
					intPart=1;
			 		number=0;
			 		//for float part
			 		for(i=index+1;i<strInput.length();i++)
			 		{
			 			number=number+Character.getNumericValue(strInput.charAt(i))*1.0/(Math.pow(8,intPart));
			 			intPart++;
			 		}
			 		number=number+rem;
			 		strOutput.append(number);			 		
			 	}
			 }//end of if(isValidDecimal)
			 else
			 {
			 	JOptionPane.showMessageDialog(null,"Not a valid Octal Number","Invalid input",1);
			 }
        return strOutput.toString();
	}
	String convertHexaToBinary(String strInput)
	{
		strOutput.delete(0,strOutput.length());
			 for(i=0;i<strInput.length();i++)
                {
                       	index=findHexaIndex(strInput.charAt(i));
                       	if(index==-2)
                       	{
                       		strOutput.append('.');
                       	}
                       	else if(index!=-1)
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

	String convertBinaryToDecimal(String strInput)
	{
			strOutput.delete(0,strOutput.length());
			 i=0;
			 rem=0;
			 if(isValidBinary(strInput)==true)
			 {
			 	if(index<=0)
			 	{
			 		index=0;
			 		for(i=strInput.length()-1;i>=0;i--)
			 		{
			 			rem=rem+Character.getNumericValue(strInput.charAt(i))*(int)Math.pow(2,index);
			 			index++;
			 		}
			 		strOutput.append(rem);
			 	}
			 	else
			 	{	intPart=0;
			 		//for integer part
			 		for(i=index-1;i>=0;i--)
			 		{
			 			//System.out.println("int part");
			 			rem=rem+Character.getNumericValue(strInput.charAt(i))*(int)Math.pow(2,intPart);
			 			intPart++;
			 		}	
					intPart=1;
			 		number=0;
			 		//for float part
			 		for(i=index+1;i<strInput.length();i++)
			 		{
			 			number=number+Character.getNumericValue(strInput.charAt(i))*1.0/(Math.pow(2,intPart));
			 			intPart++;
			 		}
			 		number=number+rem;
			 		System.out.println("final number:"+number);
			 		strOutput.append(number);			 		
			 	}
			 }//end of if(isValidDecimal)
			 else
			 {
			 	JOptionPane.showMessageDialog(null,"Not a valid Binary Number","Invalid input",1);
			 }
        return strOutput.toString();
	}
	
	String convertBinaryToOctal(String strInput)
	{
		strOutput.delete(0,strOutput.length());
		
		strRest.delete(0,strTmp.length());
		if(isValidBinary(strInput)==true)
		{
			strTmp.delete(0,strTmp.length());
			
			strTmp.append(strInput);

			if(index>0)
			{
				strRest.delete(0,strRest.length());
				strRest.append(strTmp.substring(index+1,strTmp.length()));
				strTmp.delete(index,strTmp.length());
			}
			
			//*********solving integer part*********
				if(strTmp.length()%3==0)
				{
					for(i=0;i<strTmp.length();i=i+3)
					{
						while(index<8)
						{
							if(strTmp.substring(i,i+3).equals(binaryNum[index].substring(1,4)))
							{
								strOutput.append(index);
								break;
							}
								index++;
						}
					}
				}
				else
				{
					i=0;
					index=0;
					//inserting 0's to make bianary to full fill octal properties
					while(strTmp.length()%3!=0)
					{
						strTmp.insert(0,'0');
					}
					
					//find octal num.
					for(i=0;i<strTmp.length();i=i+3)
					{
						while(index<8)
						{
							if(strTmp.substring(i,i+3).equals(binaryNum[index].substring(1,4)))
							{
								strOutput.append(index);
								break;
							}
								index++;
						}
					}
					strTmp.delete(0,strTmp.length());
				}


			//*********solving fraction part*********

				if(strRest.length()!=0)
				{
					//appending "."
					strOutput.append('.'); 

					index=0;
					if(strRest.length()%3==0)
					{
						for(i=0;i<strRest.length();i=i+3)
						{
							while(index<8)
							{
								if(strRest.substring(i,i+3).equals(binaryNum[index].substring(1,4)))
								{
									strOutput.append(index);
									break;
								}
									index++;
							}
						}
					}
					else
					{
						
					//inserting 0's to make bianary to full fill octal properties
						while(strRest.length()%3!=0)
						{
							strRest.append('0');
						}
						//find octal num.
						for(i=0;i<strRest.length();i=i+3)
						{
							index=0;
							while(index<8)
							{
								if(strRest.substring(i,i+3).equals(binaryNum[index].substring(1,4)))
								{
									strOutput.append(index);
								}
									index++;
							}
						}
						strRest.delete(0,strRest.length());
					}
				}
				
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Not a valid Binary Number","Invalid input",1);
		}
		return strOutput.toString();
	}


	String convertBinaryToHexa(String strInput)
	{
		strOutput.delete(0,strOutput.length());
		
		strRest.delete(0,strTmp.length());
		if(isValidBinary(strInput)==true)
		{
			strTmp.delete(0,strTmp.length());
			strTmp.append(strInput);

			if(index>0)
			{
				strRest.delete(0,strRest.length());
				strRest.append(strTmp.substring(index+1,strTmp.length()));
				strTmp.delete(index,strTmp.length());
			}
				index=0;
			//*********solving integer part*********
				if(strTmp.length()%4==0)
				{
					for(i=0;i<strTmp.length();i=i+4)
					{
						while(index<binaryNum.length)
						{
							if(strTmp.substring(i,i+4).equals(binaryNum[index]))
							{

								strOutput.append(findHexaNum(index));
								chNum.delete(0,chNum.length());
								break;
							}
								index++;
						}
					}
				}
				else
				{
					i=0;
					index=0;
					//inserting 0's to make bianary to full fill octal properties
					while(strTmp.length()%4!=0)
					{
						strTmp.insert(0,'0');
					}
					
					//find octal num.
					for(i=0;i<strTmp.length();i=i+4)
					{
						while(index<binaryNum.length)
						{
							if(strTmp.substring(i,i+4).equals(binaryNum[index]))
							{
								strOutput.append(findHexaNum(index));
								chNum.delete(0,chNum.length());
								break;
							}
								index++;
						}
					}
					strTmp.delete(0,strTmp.length());
				}


			//*********solving fraction part*********

				if(strRest.length()!=0)
				{
					//appending "."
					strOutput.append('.'); 

					index=0;
					if(strRest.length()%4==0)
					{
						for(i=0;i<strRest.length();i=i+4)
						{
							while(index<binaryNum.length)
							{
								if(strRest.substring(i,i+4).equals(binaryNum[index]))
								{
									strOutput.append(findHexaNum(index));
									chNum.delete(0,chNum.length());
									break;
								}
									index++;
							}
						}
					}
					else
					{
						
					//inserting 0's to make bianary to full fill octal properties
						while(strRest.length()%4!=0)
						{
							strRest.append('0');
						}
						//find octal num.
						for(i=0;i<strRest.length();i=i+4)
						{
							index=0;
							while(index<binaryNum.length)
							{
								if(strRest.substring(i,i+4).equals(binaryNum[index]))
								{
									strOutput.append(findHexaNum(index));
									chNum.delete(0,chNum.length());
								}
									index++;
							}
						}
						strRest.delete(0,strRest.length());
					}
				}
				
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Not a valid Binary Number","Invalid input",1);
		}
		return strOutput.toString();
	}
}//end of class