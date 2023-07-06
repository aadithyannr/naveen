package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaveenRegister {
	WebDriver driver;

	//object repository
	By myacc =By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i");
	By reg= By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");
	By fname=By.name("firstname");
	By lname=By.name("lastname");
	By email=By.name("email");
	By phone=By.name("telephone");
	By pass=By.name("password");
	By cpass=By.name("confirm");
	By check=By.name("agree");
	By cont=By.xpath("//input[@class='btn btn-primary']");
	By continu=By.xpath("//a[@class='btn btn-primary']");
	
	public NaveenRegister(WebDriver driver) {
		this.driver=driver;}
	
	public void register() {
		driver.findElement(myacc).click();
		driver.findElement(reg).click();
	}
	
	public void firstname(String firstname) {
		driver.findElement(fname).click();
		driver.findElement(fname).sendKeys(firstname);
	}
	
	public void lastname(String lastname) {
		driver.findElement(lname).click();
		driver.findElement(lname).sendKeys(lastname);
	}
	
	public void email(String mail) {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(mail);
	}
	
	public void phonenumber(String number) {
		driver.findElement(phone).click();
		driver.findElement(phone).sendKeys(number);
	}
	
	public void password(String passwd) {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys(passwd);
	}
	
	public void confirmpassword(String cpasswd) {
		driver.findElement(cpass).click();
		driver.findElement(cpass).sendKeys(cpasswd);
	}
	
	public void checkbox() {
		driver.findElement(check).click();
		}
	
	public void continu() {
		driver.findElement(cont).click();
		
	}
	
	public void continu2() {
		driver.findElement(continu).click();
		
	}
}
