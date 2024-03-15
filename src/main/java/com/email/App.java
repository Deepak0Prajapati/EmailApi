package com.email;

import com.email.email.GemailSender;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GemailSender gemailSender=new GemailSender();
    	String to="deepakprajjapati12@gmail.com";
    	String from="deepakprajapati.bluethink@gmail.com";
    	String subject="sending email using Gmail";
    	String text="this is an example email send using gmail and java";
    	boolean sendEmail = gemailSender.sendEmail(to, from, subject, text);
    	if (sendEmail) {
			System.out.println("email is sent successfully!");
		}else {
			System.out.println("there is a problem in sending mail");
		}
    }
}
