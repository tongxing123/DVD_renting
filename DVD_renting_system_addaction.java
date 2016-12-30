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
import java.awt.Font;
public class DVD_renting_system_addaction{
	public static void main(String[] args) throws IOException{
	Jframe frame=new Jframe();
	frame.setVisible(true);
	}
}
class Jframe extends JFrame implements ActionListener{
	
    JMenuBar menubar;
    JMenu menuFile,menuEdit,menuHelp;
    JMenuItem misave,mireturn,mirenew,usehelp;
   
	JButton type_in=new JButton("新光盘录入");
	JButton old_manage=new JButton("旧，损坏光盘处理");
	JButton search=new JButton("光盘状态查询");
	JButton user_manage=new JButton("客户管理");
	JButton rent1=new JButton("租出");
	JLabel i=new JLabel("DVD租赁系统");
     
	JPanel head=new JPanel();//-------------------------------------------主界面
	
	static JTextField dvdname=new JTextField();
	static JTextField dvdpublisher=new JTextField();
	static JTextField dvdnumber=new JTextField();
	static JTextField dvdquantity=new JTextField();
	static JTextField dvdprice=new JTextField();
	JLabel name_all=new JLabel("DVD录入");
	JLabel price=new JLabel("DVD价格");
	JLabel name=new JLabel("DVD名称");
	JLabel quantity=new JLabel("DVD数量");
	JLabel publisher=new JLabel("DVD出版社");
	JLabel number=new JLabel("DVD编号");
	JButton enter=new JButton("录入");
	JButton enter_end_return=new JButton("录入结束");
	JPanel type=new JPanel();//-------------------------------------------------录入界面
	
	
    JLabel renttitle=new JLabel("租出"); 
	JTextField username=new JTextField();
	JLabel usernamelabel=new JLabel("租客姓名");
	JTextField userid=new JTextField();
	JLabel useridlabel=new JLabel("租客身份证号");	
	JTextField dvdname1=new JTextField();
	JLabel dvdnamelabel=new JLabel("DVD名称");
	JTextField dvdid=new JTextField();	
	JLabel dvdidlabel=new JLabel("DVD编号");
	JTextField rentdate=new JTextField();
	JLabel rentdatelabel=new JLabel("借出月");	
	JTextField rentdate2=new JTextField();
	JLabel rentdatelabel2=new JLabel("借出日");	
	JTextField rentprice=new JTextField();
	JLabel rentpricelabel=new JLabel("支付租金");	
	JButton rent=new JButton("借出");
	JButton rentreturn=new JButton("返回主菜单");

	
	JLabel dvdlabel=new JLabel("DVD搜索");
	JLabel dvdlabel1=new JLabel("输入DVD编号");
	JTextField dvdsearch=new JTextField();
	JButton searchbutton=new JButton("DVD编号搜索");
	JPanel searchdvd=new JPanel();
	JButton search_return=new JButton("返回");//-----------------------------------------搜索界面
	
	JTextField old_dvd=new JTextField();
	JLabel olddvd_search=new JLabel("废旧DVD编号搜索");
	JButton oldbutton=new JButton("废旧DVD编号查询");
	JTextField old_dvd_name_input=new JTextField();
	JTextField old_dvd_publisher_input=new JTextField();
	JTextField old_dvd_quantity_input=new JTextField();
	JTextField old_dvd_number_input=new JTextField();
	JLabel oldname=new JLabel("废旧DVD名称");
	JLabel olddvdquantity=new JLabel("废旧DVD数量");
	JLabel olddvdpublisher=new JLabel("废旧DVD出版社");
	JLabel olddvdnumber=new JLabel("废旧DVD编号");
	JButton oldbutton_input=new JButton("损坏光盘加入");
	JLabel old_dvd2=new JLabel("损坏光盘，旧光盘状态查询和录入");
	JButton oldbutton_return=new JButton("返回主界面");//------------------------------损坏光盘处理
	JPanel old_dvd1=new JPanel();
	
	
	JLabel user_manage1=new JLabel("客户管理");
	JTextField bad_user=new JTextField();
	JLabel bad_user_name=new JLabel("不良客户姓名");
	JTextField bad_user_id=new JTextField();
	JLabel bad_user_id2=new JLabel("不良客户身份证号");
	JButton bad_user_inputbutton=new JButton("添加");
	JLabel user_bad1=new JLabel("添加入客户黑名单");
	JTextField user=new JTextField();
	JLabel user_search=new JLabel("租客租赁信息查询（身份证号）");
	JButton user_searchbutton=new JButton("查询");
	JButton user_return=new JButton("返回主菜单");
	JPanel user_manage2=new JPanel();//-------------------------------客户管理
	

	
	
	public Jframe(){
		this.setLayout(null);
		this.setBounds(0,0,1000,700);
		this.setTitle("DVD租赁系统");
	
		menubar=new JMenuBar();
	  this.setJMenuBar(menubar);
	  menuFile=new JMenu("流程");
	  menuEdit=new JMenu("帮助");
	  menuHelp=new JMenu("反馈");
	  
	 menubar.add(menuFile);
	  menubar.add(menuEdit);
	  menubar.add(menuHelp);
	  
	  menuFile.addSeparator();
	  
	  misave=new JMenuItem("租赁流程");
	 mireturn=new JMenuItem("归还流程");
	mirenew=new JMenuItem("续借流程");
	usehelp=new JMenuItem("使用帮助");
	
	  menuFile.add(misave);
	  menuFile.add(mireturn);
	  menuFile.add(mirenew);
	menuHelp.add(usehelp);//-------------------菜单栏
	
	misave.addActionListener(this);
	mireturn.addActionListener(this);
	mirenew.addActionListener(this);
	usehelp.addActionListener(this);//------------菜单栏监听器
	
		dvdname.setEditable(true);
		dvdpublisher.setEditable(true);
		dvdnumber.setEditable(true);
		dvdquantity.setEditable(true);
		
		
		dvdsearch.setEditable(true);
		old_dvd.setEditable(true);
		bad_user.setEditable(true);
		bad_user_id.setEditable(true);
		user.setEditable(true);
	
		
		 old_manage.setBounds(100,180,150,90);
		 rent1.setBounds(400,270,150,90);
			search.setBounds(100,300,150,90);
			user_manage.setBounds(600,270,150,90);
		type_in.setBounds(100,420,150,90);
		i.setBounds(230,30,500,100);
		i.setFont(new Font("",Font.BOLD,55));//-------------------主界面组建按钮控制
		
		this.getContentPane().add(i);
		this.getContentPane().add(type_in);
		this.getContentPane().add(old_manage);
		this.getContentPane().add(search);
		this.getContentPane().add(rent1);
		this.getContentPane().add(user_manage);
		
	
		
	    type_in.addActionListener(this);
		old_manage.addActionListener(this);
		search.addActionListener(this);
		user_manage.addActionListener(this);
		rent1.addActionListener(this);//------主菜单添加监听器
		
	   
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
		type.setVisible(true);//----------------录入新光盘
		
		
		searchdvd.add(dvdsearch);
		dvdsearch.setBounds(400, 200, 200, 50);
		searchdvd.add(searchbutton);
		searchbutton.setBounds(430,320,120,30);
		dvdlabel.setBounds(400,10,400,100);
		dvdlabel.setFont(new Font("",Font.BOLD,50));
		dvdlabel1.setBounds(670,200,200,50);
		dvdlabel1.setFont(new Font("",Font.BOLD,20));
		search_return.setBounds(800,500,100,50);
		search_return.addActionListener(this);
		searchbutton.addActionListener(this);//--------搜索光盘
		
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
	    oldname.setBounds(680, 150,250 , 20);
		olddvdquantity.setBounds(680, 270,250, 20);	
		olddvdpublisher.setBounds(680, 190,250, 20);
		olddvdnumber.setBounds(680, 230, 250, 20);
		name_all.setFont(new Font("",Font.BOLD,50));
		olddvdnumber.setFont(new Font("",Font.BOLD,22));
		oldname.setFont(new Font("",Font.BOLD,22));
		olddvdpublisher.setFont(new Font("",Font.BOLD,22));
		olddvdquantity.setFont(new Font("",Font.BOLD,22));
		oldbutton_input.setBounds(500,350,150,50);
		oldbutton_return.setBounds(800,500,100,50);
		oldbutton_return.addActionListener(this);
		old_dvd2.setBounds(100, 20, 1000, 50);
		old_dvd2.setFont(new Font("",Font.BOLD,50));
		 oldbutton_input.addActionListener(this);
	    oldbutton.addActionListener(this);//--------------------------------------------------------旧光盘处理
	
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
	    bad_user_inputbutton.setBounds(500,350,150,50);//------------------客户处理
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
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==type_in){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
		
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
			this.getContentPane().add(dvdsearch);
			this.getContentPane().add(searchbutton);
			this.getContentPane().add(dvdlabel);
			this.getContentPane().add(dvdlabel1);
			this.getContentPane().add(search_return);
			
			this.repaint();
			this.getContentPane().validate();
			
		}else if(e.getSource()==old_manage){
			
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
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
			
		}else if(e.getSource()==user_manage){
			this.remove(type_in);
			this.remove(old_manage);
			this.remove(i);
			this.remove(search);
			this.remove(user_manage);
			this.remove(rent1);
			
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
			this.repaint();
			this.getContentPane().validate();
			
		}else if(e.getSource()==search_return){
			this.remove(dvdsearch);
			this.remove(searchbutton);
			this.remove(dvdlabel);
			this.remove(dvdlabel1);
			this.remove(search_return);
			
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.getContentPane().add(rent1);
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
			this.getContentPane().add(type_in);
			this.getContentPane().add(old_manage);
			this.getContentPane().add(rent1);
			this.getContentPane().add(i);
			this.getContentPane().add(search);
			this.getContentPane().add(user_manage);
			this.repaint();
			this.getContentPane().validate();
		}else if(e.getSource()==enter){
			FileOutputStream fos=null;
			try{
				
				fos=new FileOutputStream("c:\\Temp\\reports.txt",true);
		//	String a[]=null;a[0]=dvdname.getText().trim();a[1]=dvdpublisher.getText().trim();a[2]=dvdnumber.getText().trim();a[3]=dvdprice.getText().trim();
						String temp=dvdname.getText()+"|"+dvdpublisher.getText().trim()+"|"+dvdnumber.getText().trim()+"|"+dvdprice.getText().trim()+"|";
				
				
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
				JOptionPane.showMessageDialog(null,"录入成功：DVD片名："+dvdname.getText().trim()+"    DVD出版社："+dvdpublisher.getText().trim()+"    DVD编号："+dvdnumber.getText().trim()+"    DVD价格："+dvdprice.getText()+"     DVD数量："+dvdquantity.getText(),"录入成功",JOptionPane.INFORMATION_MESSAGE);
		    dvdname.setText("");
		    dvdpublisher.setText("");
		    dvdnumber.setText("");
		    dvdquantity.setText("");
		    dvdprice.setText("");
		}else if(e.getSource()==searchbutton){
			File file=new File("c:\\Temp\\reports.txt");String[] info = null;
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
		        	lineStr=br.readLine();
		        	char[] chars=lineStr.toCharArray();
		        	for(int b=0;b<chars.length;b++){
		        		if(chars[b]=='|'){
		        			count++;
		        		}
		        	}
		         while((lineStr=br.readLine())!=null){
		        	 info=lineStr.split("\\|");
		        	
		        		 }
		        		 
		        	 for(int i=0;i<count;i++){
		        		 if(dvdsearch.getText().compareTo(info[i])==0) 
		        		 {
		        			 a=i;
		        			 break;
		        		 }
		        		 }
		        		 if(dvdsearch.getText().compareTo(info[a])==0){
		        		 JOptionPane.showMessageDialog(null,"查询成功：DVD片名："+info[0]+"    DVD出版社："+info[1]+"    DVD编号："+info[2]+"    DVD价格："+info[3],"搜索结果",JOptionPane.INFORMATION_MESSAGE);
		        		 }
		        	  else{
			        	 JOptionPane.showMessageDialog(null,"搜索失败","搜索结果",JOptionPane.INFORMATION_MESSAGE); 
			        	
			         }
		        	 
		        	//if(dvdsearch.getText().compareTo(info[a])==0){
		        //	 JOptionPane.showMessageDialog(null,"查询成功：DVD片名："+info[0]+"    DVD出版社："+info[1]+"    DVD编号："+info[2]+"    DVD价格："+info[3],"搜索结果",JOptionPane.INFORMATION_MESSAGE);
		        //	 }
		        //	 else{
		        //		 JOptionPane.showMessageDialog(null,info[count],"搜索失败",JOptionPane.INFORMATION_MESSAGE); 
		        		
		        //	 }
		         
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
			try{
				
				fos=new FileOutputStream("c:\\Temp\\rent.txt",true);
		//	String a[]=null;a[0]=dvdname.getText().trim();a[1]=dvdpublisher.getText().trim();a[2]=dvdnumber.getText().trim();a[3]=dvdprice.getText().trim();
						String temp=username.getText()+"|"+userid.getText().trim()+"|"+dvdname1.getText().trim()+"|"+dvdid.getText().trim()+"|"+rentdate.getText().trim()+"|"+rentdate2.getText().trim()+"|"+rentprice.getText().trim()+"|";
				
				
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
				JOptionPane.showMessageDialog(null,"租客："+username.getText()+"|租客身份证号："+userid.getText().trim()+"|DVD名称："+dvdname1.getText().trim()+"|DVD编号："+dvdid.getText().trim()+"|租出月份："+rentdate.getText().trim()+"|租出日："+rentdate2.getText().trim()+"|支付租金："+rentprice.getText().trim()+"|","租出"
				,JOptionPane.INFORMATION_MESSAGE);
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
				JOptionPane.showMessageDialog(null,"不良租客："+bad_user.getText()+"|不良租客身份证号："+bad_user_id.getText().trim()+"|","不良租客"
				,JOptionPane.INFORMATION_MESSAGE);
				bad_user.setText("");
				bad_user_id.setText("");
				
		}else if(e.getSource()==oldbutton_input){
			FileOutputStream fos=null;
			try{
				
				fos=new FileOutputStream("c:\\Temp\\olddvd.txt",true);
		//	String a[]=null;a[0]=dvdname.getText().trim();a[1]=dvdpublisher.getText().trim();a[2]=dvdnumber.getText().trim();a[3]=dvdprice.getText().trim();
						String temp=old_dvd_name_input.getText()+"|"+old_dvd_publisher_input.getText().trim()+"|"+old_dvd_quantity_input.getText().trim()+"|"+old_dvd_number_input.getText().trim()+"|";
				
				
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
				JOptionPane.showMessageDialog(null,"录入成功：DVD片名："+old_dvd_name_input.getText().trim()+"    DVD出版社："+old_dvd_publisher_input.getText().trim()+"    DVD编号："+old_dvd_number_input.getText().trim()+"     DVD数量："+old_dvd_quantity_input.getText(),"录入成功",JOptionPane.INFORMATION_MESSAGE);
				old_dvd_name_input.setText("");
				old_dvd_publisher_input.setText("");
				old_dvd_quantity_input.setText("");
				old_dvd_number_input.setText("");
		   
		}
		
	}
}




