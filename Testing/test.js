describe("adactin", function () {
    it("login valid credentials", function () {

        browser.get("https://bltestapp.in/");
        browser.manage().window().maximize()
        browser.sleep(3000);

        var elementToMoveTo = element(by.xpath('/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]'));
        browser.actions().mouseMove(elementToMoveTo).perform();
        browser.sleep(3000);
        var log = element(by.xpath('/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]/div[2]/ul/li'))
        log.click();
        browser.sleep(4000);

        

        var username=  element(by.xpath('//input[@formcontrolname="emailid"]'))
        browser.sleep(3000);
        username.sendKeys('289023845');
        var pwd = element(by.css('[formcontrolname="password"]'))
        pwd.sendKeys('naveen@123')
        browser.sleep(3000);
        var sign = element(by.xpath('//button[@class="btn btn-solid btn-block btn-sign"]'))
        sign.click();
        browser.sleep(3000);


        var profile = element(by.xpath('(//a[@class="sidebar-header ng-star-inserted"])[1]'))
        browser.sleep(3000);
        profile.click();
        browser.sleep(3000);

        var quickorder = element(by.xpath('(//a[@class="sidebar-header ng-star-inserted"])[7]'))
        quickorder.click()
        browser.sleep(3000);
        element(by.xpath('//*[@id="purchase-cart"]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[4]/button')).click();
        browser.sleep(3000);
        for(let i=0;i<1;i++){
        var adding = element(by.css('div.plus'));
        adding.click();
        }
       browser.sleep(2000);


        browser.executeScript('window.scrollBy(100,1500);')
        browser.sleep(3000);

        var proceed = element(by.xpath("//button[text()='Procced']"))
        browser.actions().mouseMove(proceed).perform();
        browser.sleep(3000);
        proceed.click();
        browser.actions().mouseMove(proceed).perform();
        browser.sleep(3000);

       var addaddress = element(by.xpath('//*[@id="purchase-cart"]/div/div/div/div/div/div[2]/div/div[1]/div[2]/button'))
       browser.actions().mouseMove(addaddress).perform()
        addaddress.click();
       browser.sleep(3000);
        
        element(by.xpath('//input[@formcontrolname="name"]')).sendKeys("nagarjuna");
        browser.sleep(3000);
        element(by.xpath('//input[@formcontrolname="mobile"]')).sendKeys("3456789123");
        element(by.css('[formcontrolname="email"]')).sendKeys("nagarjuna123@gmail.com");
        browser.sleep(3000);
        element(by.css('[formcontrolname="pincode"]')).sendKeys("518593");
        var cityDropdown = element(by.css('[formcontrolname="city"]'));
        browser.wait(ExpectedConditions.elementToBeClickable(cityDropdown), 5000, 'City dropdown not clickable');
        cityDropdown.click();
        var cityOption = element(by.xpath('//option[@value="S.Nagulavaram"]'));
        browser.wait(ExpectedConditions.visibilityOf(cityOption), 5000, 'City option not visible');
        cityOption.click();
        element(by.css('[formcontrolname="address"]')).sendKeys("verify");
        browser.sleep(6000);
        var submitButton = element(by.xpath('/html/body/ngb-modal-window/div/div/div[2]/app-address-add/div/div/div/form/div[2]/button'));
        browser.actions().mouseMove(submitButton).perform();
        submitButton.click();
        browser.sleep(6000);
       element(by.xpath('//button[@class="swal2-confirm swal2-styled"]')).click();
       browser.sleep(6000);

        browser.executeScript('window.scrollBy(100,1500);')
        browser.sleep(6000);

        var purchage=  element(by.xpath('//input[@id="Purchase Wallet"]'))
        browser.sleep(6000);
        purchage.click();

        var netAmountElement = element(by.xpath("//div[text()='Net Amount :']/following-sibling::div"));
        netAmountElement.getText().then(function(netAmountText) {
        console.log("Net Amount:", netAmountText);
        var textFieldElement = element(by.xpath('(//input[@placeholder="Enter Amount"])[1]'));
        textFieldElement.clear();
        textFieldElement.sendKeys(netAmountText);

        browser.sleep(3000);
        element(by.xpath('//input[@placeholder="Transaction Password"]')).sendKeys("naveen@123");
        browser.sleep(3000);

        browser.executeScript('window.scrollBy(100,500);')

        var placeorder=element(by.xpath('//*[@class="btn btn-solid btn-sm"]'))
        browser.sleep(3000);
        placeorder.click();
        browser.sleep(3000);
        browser.executeScript('window.scrollBy(100,500);')
        browser.sleep(3000);
    });

          });
      });
      
    

    
