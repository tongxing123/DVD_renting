package renting2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.table.TableColumn;
import javax.swing.ButtonGroup;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
public class DVD_renting_perfectfunction {
	public static void main(String[] args) throws IOException{
	Jframe frame=new Jframe();
	frame.setVisible(true);
	}
}
class Jframe extends JFrame implements ActionListener{
	
	ImageIcon background=new ImageIcon("c:\\Temp\\image3.jpg");
	JLabel label=new JLabel(background);
	
	
	JScrollPane scroll=new JScrollPane();
	
	
	
    JMenuBar menubar;
    JMenu menuFile,menuEdit,menuHelp;
    JMenuItem misave,mireturn,mirenew,usehelp;
   
    JTextField account=new JTextField();
    JLabel accountlabel=new JLabel("�˺�");
    JPasswordField password=new JPasswordField();
    JLabel passwordlabel=new JLabel("����");
    JButton btn=new JButton("��¼");
    JLabel pass=new JLabel("Login Interface");
    
	JButton type_in=new JButton("�¹���¼��");
	JButton old_manage=new JButton("�ɣ��𻵹��̴���");
	JButton search=new JButton("����״̬��ѯ");
	JButton user_manage=new JButton("�ͻ�����");
	JButton rent1=new JButton("���");
	JButton return_back=new JButton("�黹");
	JLabel i=new JLabel("DVD����ϵͳ");
     
	JPanel head=new JPanel();//-------------------------------------------������
	
	static JTextField dvdname=new JTextField();
	static JTextField dvdpublisher=new JTextField();
	static JTextField dvdnumber=new JTextField();
	static JTextField dvdquantity=new JTextField();
	static JTextField dvdprice=new JTextField();
	JLabel name_all=new JLabel("DVD¼��");
	JLabel price=new JLabel("DVD�۸�");
	JLabel name=new JLabel("DVD����");
	JLabel quantity=new JLabel("DVD����");
	JLabel publisher=new JLabel("DVD������");
	JLabel number=new JLabel("DVD���");
	JButton enter=new JButton("¼��");
	JButton enter_end_return=new JButton("¼�����");
	JPanel type=new JPanel();//-------------------------------------------------¼�����
	
	
    JLabel renttitle=new JLabel("���"); 
	JTextField username=new JTextField();
	JLabel usernamelabel=new JLabel("�������");
	JTextField userid=new JTextField();
	JLabel useridlabel=new JLabel("������֤��");	
	JTextField dvdname1=new JTextField();
	JLabel dvdnamelabel=new JLabel("DVD����");
	JTextField dvdid=new JTextField();	
	JLabel dvdidlabel=new JLabel("DVD���");
	JTextField rentdate=new JTextField();
	JLabel rentdatelabel=new JLabel("�����");	
	JTextField rentdate2=new JTextField();
	JLabel rentdatelabel2=new JLabel("�����");	
	JTextField rentprice=new JTextField();
	JLabel rentpricelabel=new JLabel("֧�����");	
	JButton rent=new JButton("���");
	JButton rentreturn=new JButton("�������˵�");
	
	JLabel returntitle=new JLabel("�黹"); 
	
	JTextField returnusername=new JTextField();
	JLabel returnusernamelabel=new JLabel("�������");
	JTextField returnuserid=new JTextField();
	JLabel returnuseridlabel=new JLabel("������֤��");	
	JTextField returndvdname1=new JTextField();
	JLabel returndvdnamelabel=new JLabel("DVD����");
	JTextField returndvdid=new JTextField();	
	JLabel returndvdidlabel=new JLabel("DVD���");
	JTextField returnrentdate=new JTextField();
	JLabel returnrentdatelabel=new JLabel("�黹��");	
	JTextField returnrentdate2=new JTextField();
	JLabel returnrentdatelabel2=new JLabel("�黹��");	
	JTextField returnrentprice=new JTextField();
	JLabel returnrentpricelabel=new JLabel("֧�����");	
	JButton returnrent=new JButton("�黹");
	JButton returnrentreturn=new JButton("�������˵�");

	
	JLabel dvdlabel=new JLabel("DVD����");
	JLabel dvdlabel1=new JLabel("����DVD���Ʊ��");
	JTextField dvdsearch=new JTextField();
	JButton searchbutton=new JButton("DVD��������");
	JButton allsearchbutton=new JButton("���DVD");
	JPanel searchdvd=new JPanel();
	JButton allsearchreturn=new JButton("����");
	JButton search_return=new JButton("����");//-----------------------------------------��������
	
	JTextField old_dvd=new JTextField();
	JLabel olddvd_search=new JLabel("�Ͼ�DVD����");
	JButton oldbutton=new JButton("�Ͼ�DVD��ѯ");
	JTextField old_dvd_name_input=new JTextField();
	JTextField old_dvd_publisher_input=new JTextField();
	JTextField old_dvd_quantity_input=new JTextField();
	JTextField old_dvd_number_input=new JTextField();
	JTextField old_reason=new JTextField();
	JLabel reason=new JLabel("�Ͼ�,��ԭ��");
	JLabel oldname=new JLabel("�Ͼ�DVD����");
	JLabel olddvdquantity=new JLabel("�Ͼ�DVD����");
	JLabel olddvdpublisher=new JLabel("�Ͼ�DVD������");
	JLabel olddvdnumber=new JLabel("�Ͼ�DVD���");
	JButton oldbutton_input=new JButton("�𻵹��̼���");
	JLabel old_dvd2=new JLabel("�𻵹��̣��ɹ���״̬��ѯ��¼��");
	ButtonGroup btngroup=new ButtonGroup();
	JRadioButton yesbutton=new  JRadioButton("�ɳ���",true);
	JRadioButton nobutton=new  JRadioButton("���ɳ���");
	
	JButton oldbutton_return=new JButton("����������");//------------------------------�𻵹��̴���
	JPanel old_dvd1=new JPanel();
	
	
	JLabel user_manage1=new JLabel("�ͻ�����");
	JTextField bad_user=new JTextField();
	JLabel bad_user_name=new JLabel("�����ͻ�����");
	JTextField bad_user_id=new JTextField();
	JLabel bad_user_id2=new JLabel("�����ͻ����֤��");
	JButton bad_user_inputbutton=new JButton("���");
	JLabel user_bad1=new JLabel("�����ͻ�������");
	JTextField user=new JTextField();
	JLabel user_search=new JLabel("���������Ϣ��ѯ�����֤�ţ�");
	JButton user_searchbutton=new JButton("��ѯ");
	JButton user_return=new JButton("�������˵�");
	JPanel user_manage2=new JPanel();//-------------------------------�ͻ�����
	

	
	
	public Jframe(){
		this.setLayout(null);
		this.setBounds(0,0,1000,700);
		this.setTitle("DVD����ϵͳ");
	
	   label.setBounds(0,0,1000,700);
		JPanel imagepanel=(JPanel)this.getContentPane();
		imagepanel.setOpaque(false);
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		setVisible(true);
		yesbutton.setBounds(0,650,50,50);
		menubar=new JMenuBar();
	 this.setJMenuBar(menubar);
	  menuFile=new JMenu("����");
	//  menuEdit=new JMenu("");
	  menuHelp=new JMenu("����");
	  
	 menubar.add(menuFile);
	//  menubar.add(menuEdit);
	  menubar.add(menuHelp);
	  
	  menuFile.addSeparator();
	  
	  misave=new JMenuItem("��������");
	 mireturn=new JMenuItem("�黹����");
	//mirenew=new JMenuItem("��������");
	usehelp=new JMenuItem("ʹ�ð���");
	
	  menuFile.add(misave);
	  menuFile.add(mireturn);
	//  menuFile.add(mirenew);
	menuHelp.add(usehelp);//-------------------�˵���
	
	misave.addActionListener(this);
	mireturn.addActionListener(this);
//	mirenew.addActionListener(this);
	usehelp.addActionListener(this);//------------�˵���������
	
		dvdname.setEditable(true);
		dvdpublisher.setEditable(true);
		dvdnumber.setEditable(true);
		dvdquantity.setEditable(true);
		
		
		
		dvdsearch.setEditable(true);
		old_dvd.setEditable(true);
		bad_user.setEditable(true);
		bad_user_id.setEditable(true);
		user.setEditable(true);
	
		account.setBounds(300,260,180,40);
		password.setBounds(300,350,180,40);
		accountlabel.setBounds(500,260,100,40);
		passwordlabel.setBounds(500,350,100,40);
		accountlabel.setFont(new Font("",Font.BOLD,20));
		passwordlabel.setFont(new Font("",Font.BOLD,20));
		btn.setBounds(550,450,100,30);
		btn.setFont(new Font("",Font.BOLD,20));
		pass.setBounds(50,40,400,60);
		pass.setFont(new Font("",Font.BOLD,50));
		btn.addActionListener(this);
		
		 old_manage.setBounds(100,110,150,90);
		 rent1.setBounds(400,200,150,90);
			search.setBounds(100,230,150,90);
			user_manage.setBounds(100,470,150,90);
			return_back.setBounds(600,200,150,90);
		type_in.setBounds(100,350,150,90);
		i.setBounds(230,10,500,100);
		i.setFont(new Font("",Font.BOLD,55));//-------------------�������齨��ť����
		
		this.getContentPane().add(account);
		this.getContentPane().add(accountlabel);
		this.getContentPane().add(password);
		this.getContentPane().add(passwordlabel);
		this.getContentPane().add(pass);
		this.getContentPane().add(btn);
		
		
		btngroup.add(yesbutton);
		btngroup.add(nobutton);
		
		
		return_back.addActionListener(this);
	    type_in.addActionListener(this);
		old_manage.addActionListener(this);
		search.addActionListener(this);
		user_manage.addActionListener(this);
		rent1.addActionListener(this);//------���˵���Ӽ�����
		
	   
		type.add(enter);
		enter.setBounds(350, 400, 100, 50);
		enter_end_return.setBounds(550, 400, 100, 50);
		enter_end_return.addActionListener(this);
		name_all.setBounds(400,10,400,100);
		type.add(dvdname);
		dvdname.setBounds(350,150 , 200, 30);
		type.add(dvdpublisher);
		dvdpublisher.setBounds(350,190,200,30);
		
		type.add(dvdnumber);
		dvdnumber.setBounds(350, 230, 200, 30);
		type.add(dvdquantity);
		dvdquantity.setBounds(350,270,200,30);
		dvdprice.setBounds(350,310,200,30);
		type.add(name);
		name.setBounds(580, 150,150 , 20);
		type.add(quantity);
		quantity.setBounds(580, 270, 100, 20);
		type.add(publisher);
		publisher.setBounds(580, 190,150, 20);
		type.add(number);
		number.setBounds(580, 230, 100, 20);
		price.setBounds(580,310,100,20);
		price.setFont(new Font("",Font.BOLD,22));
		name_all.setFont(new Font("",Font.BOLD,50));
		number.setFont(new Font("",Font.BOLD,22));
		name.setFont(new Font("",Font.BOLD,22));
		publisher.setFont(new Font("",Font.BOLD,22));
		quantity.setFont(new Font("",Font.BOLD,22));
		enter.addActionListener(this);
		type.setLayout(null);
		type.setVisible(true);//----------------¼���¹���
		
		
		searchdvd.add(dvdsearch);
		dvdsearch.setBounds(400, 200, 200, 50);
		searchdvd.add(searchbutton);
		searchbutton.setBounds(430,320,120,30);
		allsearchbutton.setBounds(650,400,120,30);
		allsearchreturn.setBounds(650,550,120,30);
		dvdlabel.setBounds(400,10,400,100);
		dvdlabel.setFont(new Font("",Font.BOLD,50));
		dvdlabel1.setBounds(670,200,200,50);
		dvdlabel1.setFont(new Font("",Font.BOLD,20));
		allsearchbutton.setFont(new Font("",Font.BOLD,15));
		allsearchreturn.setFont(new Font("",Font.BOLD,15));
		search_return.setBounds(800,500,100,50);
		search_return.addActionListener(this);
		allsearchbutton.addActionListener(this);
		allsearchreturn.addActionListener(this);
		searchbutton.addActionListener(this);//--------��������
		
	    old_dvd1.add(old_dvd);
	    old_dvd1.add(old_dvd2);
	    old_dvd1.add(oldbutton);
	    old_dvd.setBounds(30, 200, 180, 30);
	    olddvd_search.setBounds(250,200, 200, 30);
	    olddvd_search.setFont(new Font("",Font.BOLD,20));
	    oldbutton.setBounds(50,350,150,50);
	    old_dvd_name_input.setBounds(450,150 , 200, 30);
	    old_dvd_publisher_input.setBounds(450,190,200,30);
	    old_dvd_number_input.setBounds(450, 230, 200, 30);
	    old_dvd_quantity_input.setBounds(450,270,200,30);
	    old_reason.setBounds(450,310,200,30);
	    oldname.setBounds(680, 150,250 , 20);
		olddvdquantity.setBounds(680, 270,250, 20);	
		olddvdpublisher.setBounds(680, 190,250, 20);
		olddvdnumber.setBounds(680, 230, 250, 20);
		reason.setBounds(680,310,250,20);
		name_all.setFont(new Font("",Font.BOLD,50));
		olddvdnumber.setFont(new Font("",Font.BOLD,22));
		reason.setFont(new Font("",Font.BOLD,22));
		oldname.setFont(new Font("",Font.BOLD,22));
		olddvdpublisher.setFont(new Font("",Font.BOLD,22));
		olddvdquantity.setFont(new Font("",Font.BOLD,22));
		oldbutton_input.setBounds(500,450,150,50);
		oldbutton_return.setBounds(800,500,100,50);
		oldbutton_return.addActionListener(this);
		old_dvd2.setBounds(100, 20, 1000, 50);
		old_dvd2.setFont(new Font("",Font.BOLD,50));
		 oldbutton_input.addActionListener(this);
	    oldbutton.addActionListener(this);//--------------------------------------------------------�ɹ��̴���
	
	    user_manage2.add(user_manage1);
	    user_manage2.add(bad_user);
	    user_manage2.add(bad_user_name);
	    user_manage2.add(bad_user_id);
	    user_manage2.add(bad_user_id2);
	    user_manage2.add(bad_user_inputbutton);
	    user_manage2.add(user_bad1);
	    user_manage2.add(user);
	    user_manage2.add(user_search);
	    user_manage2.add(user_searchbutton);
	    user_manage1.setBounds(200, 20, 1000, 50);
	    user_manage1.setFont(new Font("",Font.BOLD,50));
	    user.setBounds(30,200,180,30);
	    user_search.setBounds(30, 250, 350, 30);
	    user_search.setFont(new Font("",Font.BOLD,12));
	    user_searchbutton.setBounds(50,350,150,50);
	     user_return.setBounds(800,500,100,50);
	    bad_user.setBounds(450,200 , 200, 30);
	    bad_user_name.setBounds(680, 200,250 , 20);
	    bad_user_id2.setBounds(680, 240,250, 20);
	    bad_user_id2.setFont(new Font("",Font.BOLD,20));
	    user_bad1.setFont(new Font("",Font.BOLD,18));
	    user_search.setFont(new Font("",Font.BOLD,20));
	    user_searchbutton.setFont(new Font("",Font.BOLD,20));
	    bad_user_name.setFont(new Font("",Font.BOLD,20));
	    bad_user_id.setBounds(450,240,200,30);
	    user_bad1.setBounds(450,150,500,30);
	    bad_user_inputbutton.setBounds(500,350,150,50);//------------------�ͻ�����
	    user_return.addActionListener(this);
	    bad_user_inputbutton.addActionListener(this);
	    user_searchbutton.addActionListener(this);
	    
	    
	    renttitle.setBounds(450,30,200,60);
	    renttitle.setFont(new Font("",Font.BOLD,55));
	    username.setBounds(100,100,150,30);
		usernamelabel.setBounds(300,100,150,30);
		usernamelabel.setFont(new Font("",Font.BOLD,20));
		userid.setBounds(100,150,150,30);
		useridlabel.setBounds(300,150,150,30);
		useridlabel.setFont(new Font("",Font.BOLD,20));
		dvdname1.setBounds(100,200,150,30);
		dvdnamelabel.setBounds(300,200,150,30);
		dvdnamelabel.setFont(new Font("",Font.BOLD,20));
		dvdid.setBounds(100,250,150,30);
		dvdidlabel.setBounds(300,250,150,30);
		dvdidlabel.setFont(new Font("",Font.BOLD,20));
		rentdate.setBounds(100,300,150,30);
		rentdatelabel.setBounds(300,300,150,30);
		rentdatelabel.setFont(new Font("",Font.BOLD,20));
		rentdate2.setBounds(100,350,150,30);
		rentdatelabel2.setBounds(300,350,150,30);
	    rentdatelabel2.setFont(new Font("",Font.BOLD,20));
	    rentprice.setBounds(100,400,150,30);
	    rentpricelabel.setBounds(300,400,150,30);
	    rentpricelabel.setFont(new Font("",Font.BOLD,20));
		rent.setBounds(180,520,100,30);
		rent.addActionListener(this);
		rentreturn.setBounds(800,500,100,50);
		rentreturn.addActionListener(this);
		
		
		returntitle.setBounds(450,30,200,60);
		returntitle.setFont(new Font("",Font.BOLD,55));
	    returnusername.setBounds(100,100,150,30);
	    returnusernamelabel.setBounds(300,100,150,30);
	    returnusernamelabel.setFont(new Font("",Font.BOLD,20));
	    returnuserid.setBounds(100,150,150,30);
	    returnuseridlabel.setBounds(300,150,150,30);
	    returnuseridlabel.setFont(new Font("",Font.BOLD,20));
	    returndvdname1.setBounds(100,200,150,30);
	    returndvdnamelabel.setBounds(300,200,150,30);
	    returndvdnamelabel.setFont(new Font("",Font.BOLD,20));
	    returndvdid.setBounds(100,250,150,30);
	    returndvdidlabel.setBounds(300,250,150,30);
	    returndvdidlabel.setFont(new Font("",Font.BOLD,20));
	    returnrentdate.setBounds(100,300,150,30);
	    returnrentdatelabel.setBounds(300,300,150,30);
	    returnrentdatelabel.setFont(new Font("",Font.BOLD,20));
	    returnrentdate2.setBounds(100,350,150,30);
	    returnrentdatelabel2.setBounds(300,350,150,30);
	    returnrentdatelabel2.setFont(new Font("",Font.BOLD,20));
	    returnrentprice.setBounds(100,400,150,30);
	    returnrentpricelabel.setBounds(300,400,150,30);
	    returnrentpricelabel.setFont(new Font("",Font.BOLD,20));
	    returnrent.setBounds(180,520,100,30);
	    returnrent.addActionListener(this);
	    returnrentreturn.setBounds(800,500,100,50);
	    returnrentreturn.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btn){
        	  File file=new File("c:\\Temp\\account.txt");
        	  File file2=new File("c:\\Temp\\password.txt");
  			if(!file.exists()||!file2.exists())
  			return;
  				FileReader fr=null;
  		        BufferedReader br=null;
  		      FileReader fr2=null;
		        BufferedReader br2=null;
  		        try{ 
  		        	
  		        	fr=new FileReader(file);
  		        	fr2=new FileReader(file2);
  		        	br=new BufferedReader(fr);
  		        	br2=new BufferedReader(fr2);
  		        	
  		
  		        		 if(account.getText().compareTo(br.readLine())==0&&password.getText().compareTo(br2.readLine())==0){
  		        			this.getContentPane().add(old_manage);
  		      			this.getContentPane().add(i);
  		      			this.getContentPane().add(search);
  		      			this.getContentPane().add(user_manage);
  		      			this.getContentPane().add(rent1);
  		      			this.getContentPane().add(type_in);
  		      			this.getContentPane().add(return_back);
  		      		    //this.setJMenuBar(menubar);
  		      		    this.remove(account);
  		      	        this.remove(accountlabel);
  		                this.remove(password);
  		                this.remove(passwordlabel);
  		                this.remove(pass);
  		                this.remove(btn);
  		              this.repaint();
  					this.getContentPane().validate();
  		        		 }
  		        	  else{
  			        	 JOptionPane.showMessageDialog(null,"��¼ʧ��","��ʾ",JOptionPane.INFORMATION_MESSAGE); 
  			        	
  			         }
  		         
  		        	
  		}catch(Exception ex){
  			ex.printStackTrace();
  		}finally{
  			try{
  				br.close();
  				fr.close();
  			}catch(Exception ex){
  				ex.printStackTrace();
  			}
           	}
        	  
          }	else if(e.getSource()==type_in){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			this.remove(return_back);
		
			this.getContentPane().add(dvdprice);
			this.getContentPane().add(price);
			this.getContentPane().add(dvdnumber);
			this.getContentPane().add(number);
			this.getContentPane().add(dvdname);
			this.getContentPane().add(name);
			this.getContentPane().add(dvdpublisher);
			this.getContentPane().add(publisher);
			this.getContentPane().add(dvdquantity);
			this.getContentPane().add(quantity);
			this.getContentPane().add(enter);
			this.getContentPane().add(enter_end_return);
			this.getContentPane().add(name_all);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==rent1){
			this.remove(type_in);
		this.remove(old_manage);
		this.remove(i);
		this.remove(search);
		this.remove(user_manage);
		this.remove(rent1);
		this.remove(return_back);
		
		this.getContentPane().add(renttitle);
		this.getContentPane().add(username);
		this.getContentPane().add(usernamelabel);
		this.getContentPane().add(userid);
		this.getContentPane().add(useridlabel);
		this.getContentPane().add(dvdname1);
		this.getContentPane().add(dvdnamelabel);
		this.getContentPane().add(dvdid);
		this.getContentPane().add(dvdidlabel);
		this.getContentPane().add(rentdate);
		this.getContentPane().add(rentdatelabel);
		this.getContentPane().add(rentdate2);
		this.getContentPane().add(rentdatelabel2);
		this.getContentPane().add(rentreturn);
		this.getContentPane().add(rent);
		this.getContentPane().add(rentprice);
		this.getContentPane().add(rentpricelabel);
		this.repaint();
		this.getContentPane().validate();
			
		}
		else if(e.getSource()==search){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			this.remove(return_back);
			this.getContentPane().add(dvdsearch);
			this.getContentPane().add(searchbutton);
			this.getContentPane().add(allsearchbutton);
			this.getContentPane().add(dvdlabel);
			this.getContentPane().add(dvdlabel1);
			this.getContentPane().add(search_return);
			
			this.repaint();
			this.getContentPane().validate();
			
		}else if(e.getSource()==return_back){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			this.remove(return_back);
			
			this.getContentPane().add(returntitle);
			this.getContentPane().add(returnusername);
			this.getContentPane().add(returnusernamelabel);
			this.getContentPane().add(returnuserid);
			this.getContentPane().add(returnuseridlabel);
			this.getContentPane().add(returndvdname1);
			this.getContentPane().add(returndvdnamelabel);
			this.getContentPane().add(returndvdid);
			this.getContentPane().add(returndvdidlabel);
			this.getContentPane().add(returnrentdate);
			this.getContentPane().add(returnrentdatelabel);
			this.getContentPane().add(returnrentdate2);
			this.getContentPane().add(returnrentdatelabel2);
			this.getContentPane().add(returnrentreturn);
			this.getContentPane().add(returnrent);
			//this.getContentPane().add(returnrentprice);
		//	this.getContentPane().add(returnrentpricelabel);
			this.repaint();
			this.getContentPane().validate();
				
			
		}
		else if(e.getSource()==old_manage){
			
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			this.remove(return_back);
			this.repaint();
			this.getContentPane().validate();
			this.getContentPane().add(old_dvd_number_input);
			this.getContentPane().add(olddvdnumber);
			this.getContentPane().add(old_dvd_name_input);
			this.getContentPane().add(oldname);
			this.getContentPane().add( old_dvd_publisher_input);
			this.getContentPane().add(olddvdpublisher);
			this.getContentPane().add(old_dvd_quantity_input);
			this.getContentPane().add(olddvdquantity);
			this.getContentPane().add(old_dvd);
			this.getContentPane().add(olddvd_search);
			this.getContentPane().add(oldbutton);
			this.getContentPane().add(oldbutton_input);
			this.getContentPane().add(oldbutton_return);
			this.getContentPane().add(old_dvd2);
			this.getContentPane().add(yesbutton);
			this.getContentPane().add(nobutton);
			this.getContentPane().add(old_reason);
			this.getContentPane().add(reason);
		}else if(e.getSource()==user_manage){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			this.remove(return_back);
			
			this.getContentPane().add(user_manage1);
			this.getContentPane().add(user);
			this.getContentPane().add(user_search);
			this.getContentPane().add(user_searchbutton);
			this.getContentPane().add(bad_user);
			this.getContentPane().add(bad_user_name);
			this.getContentPane().add(bad_user_id2);
			this.getContentPane().add(bad_user_id);
			this.getContentPane().add(user_bad1);
			this.getContentPane().add(bad_user_inputbutton);
			this.getContentPane().add(user_return);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==rentreturn){
			this.remove(renttitle);
			this.remove(username);
			this.remove(usernamelabel);
			this.remove(userid);
			this.remove(useridlabel);
			this.remove(dvdname1);
			this.remove(dvdnamelabel);
			this.remove(dvdid);
			this.remove(dvdidlabel);
			this.remove(rentdate);
			this.remove(rentdatelabel);
			this.remove(rentdate2);
			this.remove(rentdatelabel2);
			this.remove(rentreturn);
			this.remove(rent);
			this.remove(rentprice);
			this.remove(rentpricelabel);
			this.repaint();
			this.getContentPane().validate();
				
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(type_in);
			this.getContentPane().add(return_back);
		}else if(e.getSource()==returnrentreturn){
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(return_back);
			
			this.remove(returntitle);
			this.remove(returnusername);
			this.remove(returnusernamelabel);
			this.remove(returnuserid);
			this.remove(returnuseridlabel);
			this.remove(returndvdname1);
			this.remove(returndvdnamelabel);
			this.remove(returndvdid);
			this.remove(returndvdidlabel);
			this.remove(returnrentdate);
			this.remove(returnrentdatelabel);
			this.remove(returnrentdate2);
			this.remove(returnrentdatelabel2);
			this.remove(returnrentreturn);
			this.remove(returnrent);
			//this.remove(returnrentprice);
			//this.remove(returnrentpricelabel);
			this.repaint();
			this.getContentPane().validate();
				
		}
		else if(e.getSource()==enter_end_return){
			this.remove(dvdnumber);
			this.remove(number);
			this.remove(dvdname);
			this.remove(name);
			this.remove(dvdpublisher);
			this.remove(publisher);
			this.remove(dvdquantity);
			this.remove(quantity);
			this.remove(enter);
			this.remove(enter_end_return);
			this.remove(name_all);
			this.remove(dvdprice);
			this.remove(price);
			
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(return_back);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==user_return){
			this.remove(user_manage1);
			this.remove(user);
			this.remove(user_search);
			this.remove(user_searchbutton);
			this.remove(bad_user);
			this.remove(bad_user_name);
			this.remove(bad_user_id2);
			this.remove(bad_user_id);
			this.remove(user_bad1);
			this.remove(bad_user_inputbutton);
			this.remove(user_return);
			
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(return_back);
			this.repaint();
			this.getContentPane().validate();
			
		}else if(e.getSource()==search_return){
			this.remove(dvdsearch);
			this.remove(searchbutton);
			this.remove(allsearchbutton);
			this.remove(dvdlabel);
			this.remove(dvdlabel1);
			this.remove(search_return);
			//this.remove(allsearchreturn);
			
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(return_back);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==oldbutton_return){
			this.remove(old_dvd_number_input);
			this.remove(olddvdnumber);
			this.remove(old_dvd_name_input);
			this.remove(oldname);
			this.remove( old_dvd_publisher_input);
			this.remove(olddvdpublisher);
			this.remove(old_dvd_quantity_input);
			this.remove(olddvdquantity);
			this.remove(old_dvd);
			this.remove(olddvd_search);
			this.remove(oldbutton);
			this.remove(oldbutton_input);
			this.remove(oldbutton_return);
			this.remove(old_dvd2);
			this.remove(yesbutton);
			this.remove(nobutton);
			this.remove(old_reason);
			this.remove(reason);
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(return_back);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==enter){
			FileOutputStream fos=null;
			try{
				
				fos=new FileOutputStream("c:\\Temp\\reports.txt",true);
		//	String a[]=null;a[0]=dvdname.getText().trim();a[1]=dvdpublisher.getText().trim();a[2]=dvdnumber.getText().trim();a[3]=dvdprice.getText().trim();
						String temp=dvdname.getText()+"|"+dvdpublisher.getText().trim()+"|"+dvdnumber.getText().trim()+"|"+dvdprice.getText().trim()+"|"+dvdquantity.getText().trim()+"|";
				
				
						try{
		       fos.write(temp.getBytes());
		    
		       
				}catch(Exception e1){
					e1.printStackTrace();
				}	
				
		       	}catch(Exception ex){
		       		ex.printStackTrace();
		       	}finally{
		       		try{
		       			fos.close();
		       		}catch(Exception ex){
		       			ex.printStackTrace();
		       		}
		       	}
				JOptionPane.showMessageDialog(null,"¼��ɹ���DVDƬ����"+dvdname.getText().trim()+"    DVD�����磺"+dvdpublisher.getText().trim()+"    DVD��ţ�"+dvdnumber.getText().trim()+"   \n DVD�۸�"+dvdprice.getText()+"     DVD������"+dvdquantity.getText(),"¼��ɹ�",JOptionPane.INFORMATION_MESSAGE);
		    dvdname.setText("");
		    dvdpublisher.setText("");
		    dvdnumber.setText("");
		    dvdquantity.setText("");
		    dvdprice.setText("");
		}else if(e.getSource()==searchbutton){
			File file=new File("c:\\Temp\\reports.txt");//String[] info = null;
			if(!file.exists())
			return;
				FileReader fr=null;
		        BufferedReader br=null;
		        try{ 
		        	int count=0;
		        	int a = 0;
		        	fr=new FileReader(file);
		        	br=new BufferedReader(fr);
		        	String lineStr=null;
		           String error=null;
		         while((lineStr=br.readLine())!=null){
		        	String[] info=lineStr.split("\\|");
		        
		        	 for(int i=0;i<info.length;i++){
		        		 if(dvdsearch.getText().compareTo(info[i])==0) 
		        		 {
		        			 a=i;
		        			
		        		 }else{
		        			 error="δ�ҵ����";
		        		 }
		        	 }
		        		 if(dvdsearch.getText().compareTo(info[a])==0){
		        		 JOptionPane.showMessageDialog(null,"��ѯ�ɹ���DVDƬ����"+info[a]+"    DVD�����磺"+info[a+1]+"    DVD��ţ�"+info[a+2]+"  \n  DVD�۸�"+info[a+3]+"    DVD���������"+info[a+4],"�������",JOptionPane.INFORMATION_MESSAGE);
		        		 }
		        	  else{
			        	 JOptionPane.showMessageDialog(null,error,"�������",JOptionPane.INFORMATION_MESSAGE); 
			        	
			         }
		         }
		        	
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				br.close();
				fr.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
         	}
		}else if(e.getSource()==rent){
			FileOutputStream fos=null;
			File file=new File("c:\\Temp\\reports.txt");
			File file2=new File("c:\\Temp\\blacklist.txt");
			if(!file.exists())
			return;
				FileReader fr=null;
				FileReader fr2=null;
		        BufferedReader br=null;
		        BufferedReader br2=null;
			try{
	        	int a = 0;int count;
	        	fr=new FileReader(file);
	        	fr2=new FileReader(file2);
	        	br=new BufferedReader(fr);
	        	br2=new BufferedReader(fr2);
	        	String lineStr=null;
	        	String lineStr2=null;
	           String error=null;
	           String info2[] = null;
	           int m=0;
	         while((lineStr=br.readLine())!=null){
	        	String[] info=lineStr.split("\\|");
	        while((lineStr2=br2.readLine())!=null){
	        	info2=lineStr2.split("\\|");
	        	for(int i=0;i<info2.length;i++){
	        		 if(userid.getText().compareTo(info2[i])==0) 
	        		 {
	        			m=i;
	        			 
	        		 }
	        }
	        }
	        	
	        	 for(int i=0;i<info.length;i++){
	        		 if(dvdid.getText().compareTo(info[i])==0) 
	        		 {
	        			 a=i;
	        			
	        		 }else{
	        			 error="δ�ҵ�DVD�����ʧ��";
	        		 }
	        	 }
	        	 count=Integer.parseInt(info[a+2]);
	        	 try{ if(userid.getText().compareTo(info2[m])==0){
	        		 JOptionPane.showMessageDialog(null,"�������,��ֹ���","������ͺ�����",JOptionPane.INFORMATION_MESSAGE);	
	        		 fos=new FileOutputStream("c:\\Temp\\rent.txt",true);
	        		 }else if(count==0){
	        			 JOptionPane.showMessageDialog(null,"��治��","������",JOptionPane.INFORMATION_MESSAGE);	
	        			 fos=new FileOutputStream("c:\\Temp\\rent.txt",true);
	        		 }
	        	 else if(dvdid.getText().compareTo(info[a])==0){
	        	 JOptionPane.showMessageDialog(null,"���ɹ���DVDƬ����"+info[a-2]+"    DVD�����磺"+info[a-1]+"    DVD��ţ�"+info[a]+"    ���̼�ֵ��"+info[a+1],"�������",JOptionPane.INFORMATION_MESSAGE);
	        		 fos=new FileOutputStream("c:\\Temp\\rent.txt",true);
						String temp=username.getText()+"|"+userid.getText().trim()+"|"+dvdname1.getText().trim()+"|"+dvdid.getText().trim()+"|"+rentdate.getText().trim()+"|"+rentdate2.getText().trim()+"|"+rentprice.getText().trim()+"|";
						
	      		       fos.write(temp.getBytes());
	      		     JOptionPane.showMessageDialog(null,"��ͣ�"+username.getText()+"������֤�ţ�"+userid.getText().trim()+"DVD���ƣ�"+dvdname1.getText().trim()+"\nDVD��ţ�"+dvdid.getText().trim()+"����·ݣ�"+rentdate.getText().trim()+"����գ�"+rentdate2.getText().trim()+"֧�����"+rentprice.getText().trim(),"���"
	      					,JOptionPane.INFORMATION_MESSAGE);
	      		     int z=Integer.parseInt(info[a+2])-1;
	      		     info[a+2]=Integer.toString(z);
	      		     String again="";
	      		     for(int w=0;w<info.length;w++){
	      		  	 again=again+info[w]+"|";
	      		     }
	      		   fos=new FileOutputStream("c:\\Temp\\reports.txt");
	      		 fos.write(again.getBytes());
	        	 }
	        	  else{
		        	 JOptionPane.showMessageDialog(null,error,"�������",JOptionPane.INFORMATION_MESSAGE); 
		        	 fos=new FileOutputStream("c:\\Temp\\rent.txt",true);
		        	
		         }
	        			
	      		    
	      		       
	      				}catch(Exception e1){
	      					e1.printStackTrace();
	      				}	
	         }
		       	}catch(Exception ex){
		       		ex.printStackTrace();
		       	}finally{
		       		try{
		       			fos.close();
		       		}catch(Exception ex){
		       			ex.printStackTrace();
		       		}
		       	}
				
				username.setText("");
				userid.setText("");
				dvdname1.setText("");
				dvdid.setText("");
				rentdate.setText("");
				rentdate2.setText("");
				rentprice.setText("");
		}else if(e.getSource()==bad_user_inputbutton){
			FileOutputStream fos=null;
			try{
				
				fos=new FileOutputStream("c:\\Temp\\blacklist.txt",true);
		
						String temp=bad_user.getText().trim()+"|"+bad_user_id.getText().trim()+"|";
				
				
						try{
		       fos.write(temp.getBytes());
		    
		       
				}catch(Exception e1){
					e1.printStackTrace();
				}	
				
		       	}catch(Exception ex){
		       		ex.printStackTrace();
		       	}finally{
		       		try{
		       			fos.close();
		       		}catch(Exception ex){
		       			ex.printStackTrace();
		       		}
		       	}
				JOptionPane.showMessageDialog(null,"������ͣ�"+bad_user.getText()+"|����������֤�ţ�"+bad_user_id.getText().trim()+"|","�������"
				,JOptionPane.INFORMATION_MESSAGE);
				bad_user.setText("");
				bad_user_id.setText("");
				
		}else if(e.getSource()==oldbutton_input){
			FileOutputStream fos=null;
			try{
				
				fos=new FileOutputStream("c:\\Temp\\olddvd.txt",true);
		//	String a[]=null;a[0]=dvdname.getText().trim();a[1]=dvdpublisher.getText().trim();a[2]=dvdnumber.getText().trim();a[3]=dvdprice.getText().trim();
						String temp=old_dvd_name_input.getText()+"|"+old_dvd_publisher_input.getText().trim()+"|"+old_dvd_quantity_input.getText().trim()+"|"+old_dvd_number_input.getText().trim()+"|";
				       String[] info=temp.split("\\|");
				      
							
						try{  
							
						    
						    fos.write(temp.getBytes());
						
		    
		       
				}catch(Exception e1){
					e1.printStackTrace();
				}	
				
		       	}catch(Exception ex){
		       		ex.printStackTrace();
		       	}finally{
		       		try{
		       			fos.close();
		       		}catch(Exception ex){
		       			ex.printStackTrace();
		       		}
		       	}
				JOptionPane.showMessageDialog(null,"¼��ɹ���DVDƬ����"+old_dvd_name_input.getText().trim()+"    DVD�����磺"+old_dvd_publisher_input.getText().trim()+"    DVD��ţ�"+old_dvd_number_input.getText().trim()+"     DVD������"+old_dvd_quantity_input.getText(),"¼��ɹ�",JOptionPane.INFORMATION_MESSAGE);
				old_dvd_name_input.setText("");
				old_dvd_publisher_input.setText("");
				old_dvd_quantity_input.setText("");
				old_dvd_number_input.setText("");
		   
		}
		else if(e.getSource()==user_searchbutton){
			File file=new File("c:\\Temp\\rent.txt");
			File file2=new File("c:\\Temp\\blacklist.txt");
			if(!file.exists()||!file2.exists())
			return;
				FileReader fr=null;
				FileReader fr2=null;
		        BufferedReader br=null;
		        BufferedReader br2=null;
		        try{ 
		        	int count=0;
		        	int a = 0;
		        	fr=new FileReader(file);
		        	fr2=new FileReader(file2);
		        	br=new BufferedReader(fr);
		        	br2=new BufferedReader(fr2);
		        	String lineStr=null;
		        	String lineStr2=null;
		           String error=null;
		         while((lineStr=br.readLine())!=null){
		        	String[] info=lineStr.split("\\|");
		        	  while((lineStr2=br2.readLine())!=null){
		        		  String[] info2=lineStr2.split("\\|");
		        		  for(int i=0;i<info2.length;i++){
				        		 if(user.getText().compareTo(info2[i])==0) 
				        		 {
				        			 JOptionPane.showMessageDialog(null,"�ÿͻ�Ϊ�����û�","�������",JOptionPane.INFORMATION_MESSAGE); 
				        		 }
				        	 }
		        	  }
		        	 for(int i=0;i<info.length;i++){
		        		 if(user.getText().compareTo(info[i])==0) 
		        		
		        		 { a=i;break;}
		        		 
		        	 }
		        		 if(user.getText().compareTo(info[a])==0)
		        		 JOptionPane.showMessageDialog(null,"��ѯ�ɹ���������"+info[a-1]+"    ���֤�ţ�"+info[a]+"    ����DVD��"+info[a+1]+"   \n ����DVD��ţ�"+info[a+2]+"    ����·ݣ�"+info[a+3]+"    ����գ�"+info[a+4]+"    ֧����"+info[a+5],"�������",JOptionPane.INFORMATION_MESSAGE);
		        		 
		        	  else 
			        	 JOptionPane.showMessageDialog(null,"�ÿͻ�������DVD","�������",JOptionPane.INFORMATION_MESSAGE); 
			        	
			         
		         }//while((lineStr=br.readLine())==null){
		        	// JOptionPane.showMessageDialog(null,"�ÿͻ�������DVD","�������",JOptionPane.INFORMATION_MESSAGE); break;
		     //    }
		        	
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				br.close();
				fr.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
         	}
		}else if(e.getSource()==oldbutton){
			File file=new File("c:\\Temp\\olddvd.txt");
			if(!file.exists())
			return;
				FileReader fr=null;
		        BufferedReader br=null;
		        try{ 
		        	int count=0;
		        	int a = 0;
		        	fr=new FileReader(file);
		        	br=new BufferedReader(fr);
		        	String lineStr=null;
		           String error=null;
		         while((lineStr=br.readLine())!=null){
		        	String[] info=lineStr.split("\\|");
		        
		        	 for(int i=0;i<info.length;i++){
		        		 if(old_dvd.getText().compareTo(info[i])==0) 
		        		 {
		        			 a=i;
		        			
		        		 }else{
		        			 error="δ�ҵ����";
		        		 }
		        	 }
		        		 if(old_dvd.getText().compareTo(info[a])==0){
		        		 JOptionPane.showMessageDialog(null,"��ѯ�ɹ���DVDƬ����"+info[a]+"    DVD�����磺"+info[a+1]+"  \n  DVD������"+info[a+2]+"    DVD��ţ�"+info[a+3],"�������",JOptionPane.INFORMATION_MESSAGE);
		        		 }
		        	  else{
			        	 JOptionPane.showMessageDialog(null,error,"�������",JOptionPane.INFORMATION_MESSAGE); 
			        	
			         }
		         }
		        	
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				br.close();
				fr.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
         	}

		}else if(e.getSource()==returnrent){
			FileOutputStream fos=null;
			File file=new File("c:\\Temp\\rent.txt");
			File file2=new File("c:\\Temp\\reports.txt");
			if(!file.exists())
			return;
				FileReader fr=null;
				FileReader fr2=null;
		        BufferedReader br=null;
		        BufferedReader br2=null;
		        
		        try{ 
		        	int count=0;
		        	int a = 0;
		        	fr=new FileReader(file);
		        	fr2=new FileReader(file2);
		        	br=new BufferedReader(fr);
		        	br2=new BufferedReader(fr2);
		        	String lineStr=null;
		           String error=null;
		         while((lineStr=br.readLine())!=null){
		        	String[] info=lineStr.split("\\|");
		        
		        	 for(int i=0;i<info.length;i++){
		        		 if(returnuserid.getText().compareTo(info[i])==0) 
		        		 {
		        			 a=i;
		        			
		        		 }else{
		        			 error="δ�ҵ����";
		        		 }
		        	 }
		        		 if(returnuserid.getText().compareTo(info[a])==0){
		        		 JOptionPane.showMessageDialog(null,info[a-1]+"     "+info[a+1]+"    ������ڣ�"+info[a+3]+"��"+info[a+4]+"��   �˻ؽ�"+info[a+5],"�������",JOptionPane.INFORMATION_MESSAGE);
		        		 }
		        	  else{
			        	 JOptionPane.showMessageDialog(null,error,"�������",JOptionPane.INFORMATION_MESSAGE); 
			        	
			         }
		        		 String returnback="";
		        		 for(int i=0;i<a-1;i++){
		        			 returnback=returnback+info[i]+"|";
		        		 }
		        		 for(int i=a+6;i<info.length;i++){
		        			 returnback=returnback+info[i]+"|";
		        		 }fos=new FileOutputStream("c:\\Temp\\rent.txt");
			      		 fos.write(returnback.getBytes());
			      		 
			      		 String renew="";
			      		
			      		while((lineStr=br2.readLine())!=null){
			      		String[] info2=lineStr.split("\\|");
                  for(int i=0;i<info2.length;i++){
                	  if(returndvdid.getText().compareTo(info2[i])==0){
                		  a=i;
                		  break;
                	  }
			      			
			     	}
                  int x=Integer.parseInt(info2[a+2])+1;
                  info2[a+2]=Integer.toString(x);
                  for(int i=0;i<info2.length;i++){
		      			renew=renew+info2[i]+"|";
		      		}fos=new FileOutputStream("c:\\Temp\\reports.txt");
		      		 fos.write(renew.getBytes());
			      		}
			      		
			      		
		         }
		        	
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				br.close();
				fr.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
         	}
			
		}
else if(e.getSource()==allsearchbutton){
	File file=new File("c:\\Temp\\reports.txt");;int m=0;
	if(!file.exists())
	return;
		FileReader fr=null;
        BufferedReader br=null;
        try{ 
        	int count=0;
        	int a = 0;
        	fr=new FileReader(file);
        	br=new BufferedReader(fr);
        	String lineStr=null;
           String error=null;
         while((lineStr=br.readLine())!=null){
        	String[] info=lineStr.split("\\|");
        	Object[][] data =new Object[info.length/5][5];
    for(int i=0;i<info.length/5;i++){
  	  for(int j=0;j<5;j++){
   		  data[i][j]=info[m];
    		  m++;
     }
      }//----------------------------------------------------��Ԫ�ظ�ֵ
      String[] columnNames={"DVD��","������","���","�۸�","�ɽ�����"};
    JTable table=new JTable(data,columnNames);
    table.setRowHeight(30);
    TableColumn column=null;
    int columns=table.getColumnCount();
    for(int i=0;i<columns;i++){
    	column=table.getColumnModel().getColumn(i);
    	column.setPreferredWidth(200);
    //	column.sizeWidthToFit();
    }
  //  JComboBox com = new JComboBox(data);
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    scroll=new JScrollPane(table);
    scroll.setSize(1000,500);
    //JPanel contentpane=new JPanel();
  //  contentpane.add(scroll,BorderLayout.CENTER);
    this.remove(dvdsearch);
	this.remove(searchbutton);
	this.remove(allsearchbutton);
	this.remove(dvdlabel);
	this.remove(dvdlabel1);
	this.remove(search_return);
	this.getContentPane().add(allsearchreturn);
	this.getContentPane().add(scroll);//BorderLayout.CENTER);
    this.repaint();
    this.getContentPane().validate();
     	 }
        	
}catch(Exception ex){
	ex.printStackTrace();
}finally{
	try{
		br.close();
		fr.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	

}
	}else if(e.getSource()==usehelp){
		JOptionPane.showMessageDialog(null,"ÿ���ڽ�DVD���޵���","�������",JOptionPane.INFORMATION_MESSAGE); 
		
	}
	else if(e.getSource()==misave){
		JOptionPane.showMessageDialog(null,"�������������֤�ź����DVD���ÿ���ڽ�DVD�޵��š�","�������",JOptionPane.INFORMATION_MESSAGE); 
	}else if(e.getSource()==mireturn){
		JOptionPane.showMessageDialog(null,"�������������֤�ź͹黹DVD��š�","�黹����",JOptionPane.INFORMATION_MESSAGE); 
	}if(e.getSource()==allsearchreturn){
		this.remove(allsearchreturn);
		this.remove(scroll);
		this.getContentPane().add(dvdsearch);
		this.getContentPane().add(searchbutton);
		this.getContentPane().add(allsearchbutton);
		this.getContentPane().add(dvdlabel);
		this.getContentPane().add(dvdlabel1);
		this.getContentPane().add(search_return);
		this.repaint();
	    this.getContentPane().validate();
		
	}
}
	}
