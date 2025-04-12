
public class Test5 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "is a prime number");
            }
        }
    }
}
/*
    @Test
    public void testFacebookSignup(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


        WebElement yearOfBirth = driver.findElement(By.id("yearofbirth"));
        yearOfBirth.click();
        yearOfBirth.sendKeys("1960");
        yearOfBirth.sendKeys(Keys.ENTER);

        // 2,2 & 3,3



        Action action = new Action(driver);
        Select select = new Select(yearOfBirth);
        action.scrollDown(yearOfBirth).perform.build();




    }

    public void testWebTable(){
        List<WebElement> columnNames = driver.findElements(By.xpath("//table//thead//tr[1]//th"));
        for(WebElemnt elemnt : columnNames){
            System.out.println(elemnt.getName());
        }

        // 2,2
        WebElement maleCheckBox = driver.findElement(BY.xpath("//table//thead//tr[3]//th[3]"));
        maleCheckBox.isDisplayed();
        maleCheckBox.click();
        Assert.assertEquals("Selected",maleCheckBox.getAttribute("state"));

        // 3,3
        WebElemnt femaleCHeckBox = driver.findElement(By.xapth("//table//thead//tr[4]//th[4]"));
        femaleCHeckBox.isDisplayed();
        Assert.assertEquals("Not selected",femaleCHeckBox.getAttribute("state"));

        //2x2 & 3x3

        // first traverse to the 2,2 th element then click on it, then traverse or locate 3,3 th element
        // verify that is unchecked

        // Second goto 3,3 element and check whether it is checked or unchecked first, then check it if is unchecked
        // then verify 2,2 is unchecked by locating it again

        femaleCHeckBox.click();
        Assert.assertEquals("Selected",femaleCHeckBox.getAttribute("state"));

        Assert.assertEquals("Not selected",maleCheckBox.getAttribute("state"));


        // Try checking both the check boxes and verify if they are able to check at a time or not



        // Try unchecking both of them and verify if they are unchked at a time






    }
}
*/
