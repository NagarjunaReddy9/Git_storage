


describe("Blulife", function () {
    it("login valid credentials", function () {

       browser.get("https://bltestapp.in/");
        browser.manage().window().maximize()
        browser.sleep(3000);
        var elementToMoveTo = element(by.xpath('/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]'));
        browser.actions().mouseMove(elementToMoveTo).perform();
        browser.sleep(3000);
        var log = element(by.xpath('/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]/div[2]/ul/li'))
        log.click();
        browser.sleep(3000);
        element(by.xpath('//input[@formcontrolname="emailid"]')).sendKeys('638126572')
        browser.sleep(3000);
        var pwd = element(by.css('[formcontrolname="password"]'))
        pwd.sendKeys('Raju@123')
        browser.sleep(3000);
        var sign = element(by.xpath('//button[@class="btn btn-solid btn-block btn-sign"]'))
        sign.click();
        describe("Blulife", function () {
          it("login valid credentials", function () {
      
        browser.sleep(3000);
        element(by.xpath('/html/body/app-root/app-content-layout/div/div/div/div[1]/app-sidebar/div[2]/ul/li[8]/a')).click()
        browser.sleep(3000);
        element(by.xpath('/html/body/app-root/app-content-layout/div/div/div/div[1]/app-sidebar/div[2]/ul/li[8]/ul/li[2]/a')).click()
        browser.sleep(3000);
        element(by.xpath('//button[@type="submit"]')).click();
        browser.sleep(3000);
          })
        element(by.xpath('//input[@formcontrolname="depositamt"]')).sendKeys("10000");
        element(by.xpath('//input[@formcontrolname="referenceno"]')).sendKeys("3456789");
        element(by.xpath('//*[@formcontrolname="transactionsource"]')).click();
        element(by.xpath('//option[@value="SBI"]')).click();
        browser.sleep(3000);
        element(by.css('[type="date"]')).sendKeys("07/03/2024");
        browser.sleep(3000);
        element(by.xpath('//*[@id="Wallet_Request_Form"]/div/div/div/form/div[5]/div/div/button')).click();
        browser.sleep(3000)
       
        const path = require('path');
        
        
        const filePath='C:\\Users\\nm22220\\Pictures\\Screenshots\\Screenshot (3).png'
          const fileInput = element(by.css('input[type="file"]'));
          const absolutePath = path.resolve(__dirname, filePath);
        
          browser.sleep(3000)
         browser.actions().mouseMove(fileInput).perform();
         browser.sleep(3000)
           browser.actions().sendKeys(absolutePath).perform();
           browser.sleep(3000)
        
      
        

      
            });
        });
        
      })