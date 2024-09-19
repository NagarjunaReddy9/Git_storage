var pageobject = require('./pages/pageobjects.js');

describe("Login Test Suite", function () {
  it("should log in successfully", function () {
    pageobject.get("https://adactinhotelapp.com/HotelAppBuild2/");
    pageobject.setName("Chandra12345");
    pageobject.setPass("Chandu");
    browser.sleep(3000)
    pageobject.sub();

   // pageobject.verifyResult("Chandra12345", "Chandra");
  
  });
});
