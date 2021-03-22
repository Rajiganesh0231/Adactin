package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Newrajipage {

	public Newrajipage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private static int i =0;
	
		@FindBy(how=How.CSS,using="(//*[@title='Women'])[1]") 
		private WebElement Women;
		public WebElement getWomen() {
			return Women;
		}
		
		
		@FindBy(how=How.XPATH,using="(//*[@title='Casual Dresses'])[1]")
		private WebElement casual;
		public WebElement Casualdress() {
			
			return casual;
			
		}
		@FindBy(how=How.XPATH,using="//span[text()='Quick view']")
		private WebElement casuadresoption;
		public WebElement Casualdressop() {
		
		return casuadresoption;
					
				}
		@FindBy(how=How.XPATH,using="(//*[@title='Printed Dress'])[1]")
		private WebElement printdre;
		public WebElement printwodess() {
			return printdre;
		}
		
		
		
		@FindBy(how=How.XPATH,using="//*[@class='fancybox-iframe']")
		private WebElement firstrframe;
		public WebElement framconcept() {
			return firstrframe;
		}
		
		
		@FindBy(how=How.XPATH,using="//*[@class='icon-plus']")
		private WebElement plussym;
		public WebElement plusincrease() {
			return plussym;
		}
		
		//*[@id='add_to_cart']
		@FindBy(how=How.XPATH,using="//*[@id='add_to_cart']")
		private WebElement addcart;
		public WebElement addtocart() {
			return addcart;
		}
		
		@FindBy(how=How.XPATH,using="(//*[@class='btn btn-default button button-medium'])[1]")
		private WebElement proceedcart;
		public WebElement proceedtocart() {
			return proceedcart;
			}
		
		
		@FindBy(how=How.XPATH,using="(//*[@title='Proceed to checkout'])[2]")
		private WebElement proceedtocart;
		public WebElement proceedmaincart() {
			return proceedtocart;
			}	
		
		
		
		
		@FindBy(how=How.XPATH,using="//*[@name='processAddress']")
		private WebElement clickprccd;
		public WebElement proceed() {
			return clickprccd;
			}
		
		
		@FindBy(how=How.XPATH,using="//*[@id='uniform-cgv']")
		private WebElement terms;
		public WebElement terms() {
			return terms;
			}	
		
		
		@FindBy(how=How.XPATH,using="//*[@name='processCarrier']")
		private WebElement clickprccd1;
		public WebElement proceed1() {
			return clickprccd1;
			}
		
				
		@FindBy(how=How.XPATH,using="(//*[@type='submit'])[2]")
		private WebElement ordersubmit;
		public WebElement ordersubmit() {
			return ordersubmit;
		}
		
		
		
		@FindBy(how=How.XPATH,using="//*[@class='bankwire']")
		private WebElement bankwire;
		public WebElement bankwire() {
			return bankwire;
		}		
		
		
		@FindBy(how=How.XPATH,using="//*[@class='logo img-responsive']")
		private WebElement logo;
		public WebElement logo() {
			return logo;
		}
		
		
		@FindBy(how=How.XPATH,using="//*[@class='fancybox-iframe']")
		private WebElement dressframe;
		public WebElement dressframe() {
			return dressframe;
		}
		
		
		
		@FindBy(how=How.XPATH,using="//*[@id='thumbs_list_frame']/li[1]")
		private WebElement firstframe;
		public WebElement firstframe() {
			return firstframe;
		}
		
		
		
	}


