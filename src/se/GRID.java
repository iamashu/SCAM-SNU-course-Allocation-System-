
package se;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GRID extends JFrame implements ActionListener
{  
JFrame f;
int count2=0,count1=-1;
int [][]array=new int[4][48];
JButton []b=new JButton[48];
static String pk,str ;


////////////////////////////////////////////////////////////////////////////////
GRID()                     //inintializing all days on grid
{
    f=new JFrame();
    creategrid();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

////////////////////////////////////////////////////////////////////////////////
public void creategrid()
        
   {   
   //readarray();   
    for(int i=0,j=1;i<48;i++)
    {       
       if(i==0) b[i] = new JButton("SUBMIT");
       else if(i==1) b[i] = new JButton("MONDAY");
       else if(i==2) b[i] = new JButton("TUESDAY");       
       else if(i==3) b[i] = new JButton("WEDNESDAY");
       else if(i==4) b[i] = new JButton("THURSDAY");
       else if(i==5) b[i] = new JButton("FRIDAY");
       else if(i==6) b[i] = new JButton("SATURDAY");
       else if(i==7) b[i] = new JButton("SUNDAY");
              else if(i==8) b[i] = new JButton("WEEK 1");
              else if(i==16) b[i] = new JButton("WEEK 2");
              else if(i==24) b[i] = new JButton("WEEK 3");
              else if(i==32) b[i] = new JButton("WEEK 4");
              else if(i==40) b[i] = new JButton("WEEK 5");
              else if((i%8==7)||(i%8==6))
              {   b[i] = new JButton((j++)+"");
                  b[i].setBackground(Color.black);    
              }    
              else
              {   b[i] = new JButton((j++)+"");
                  if(array[0][i]==0)
                  b[i].setBackground(Color.white);
                  else if(array[0][i]==1)
                  b[i].setBackground(Color.black);
                  if(array[0][i]==2)
                  b[i].setBackground(Color.green);
                  if(array[0][i]==3)
                  b[i].setBackground(Color.red);
              }

               b[i].addActionListener(this);
   }
    for(int i=0;i<48;i++)
        f.add(b[i]);
    b[0].setBackground(Color.green) ;
  
    f.setLayout(new GridLayout(6,8));//setting grid layout of 6 rows and 8 columns  
    //setDefaultCloseOperation(EXIT_ON_CLOSE);                
    f.setSize(1000,500);  
    f.setVisible(true);  
}  
/////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////
public void actionPerformed(ActionEvent e) //actions on clicking
{
    int index = -1,ctr=0 ;
    for (int i = 0; i < b.length; i++) 
    {
        if (e.getSource() == b[i]) 
           {    
               index = i;
               break;
           }
    }

    if (index == -1) 
    { 
        
    }
    
    else if((index == 0))
    { 
        
        for (int i = 0; i < b.length; i++) 
        {
            if (b[i].getBackground() == Color.GREEN) 
            {    
                ctr++ ;
            }
        }
        int perc = ((ctr*100)/15) ;
        pk = String.valueOf(ctr) ;
        str = String.valueOf(perc) ;
        String k = f7.s1 ;
        try 
        {
            DBConnect.st.executeUpdate("update courses SET ac1 = '"+str+"' where c1 = '"+k+"'") ;
            DBConnect.st.executeUpdate("update courses SET ac1 = '"+str+"' where c2 = '"+k+"'") ;
            DBConnect.st.executeUpdate("update courses SET ac1 = '"+str+"' where c3 = '"+k+"'") ;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(GRID.class.getName()).log(Level.SEVERE, null, ex);
        }
        new f9().setVisible(true) ;
    }
    
    else if((index%8==0)&&(index != 0))
    { 
        //Do Nothing
    }
    
    else if (index>0 && index<7)
    {
        if(count2==1)
        {
            for(int j=(index+8);j<48;j+=8)
               {b[j].setBackground(Color.black);
                array[0][j]=0;}
                count2=0;
            
        }
        else if(count2==0)
        {
            for(int j=(index+8);j<48;j+=8)
            {b[j].setBackground(Color.white);
            array[0][j]=1;}
            count2++;
        }        
    }
    else if((index%8==7)||(index%8==6)) { }

    else 
    {
        count1++;
        if(count1==0)
        {
            b[index].setBackground(Color.black);
            array[0][index]=0;
        }
        else if(count1==1)
        {
            b[index].setBackground(Color.white);
            array[0][index]=1;
        }
        else if(count1==2)
        {   b[index].setBackground(Color.green);
            array[0][index]=2;
        }
        else if(count1==3)
        {   b[index].setBackground(Color.red);
            array[0][index]=3; 
            count1=-1;
        }
        
        
    }  
    
}
////////////////////////////////////////////////////////////////////////////////
public static void main(String[] args) 
{  
    new GRID();  
}  
}  
