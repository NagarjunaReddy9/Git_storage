let pageobject = function () {
    let txtname = element(by.name("username"));
    let txtpwd = element(by.name("password"));
    let submit = element(by.name("login"));
  
    this.get = function (url) {
      browser.get(url); // Use the parameter 'url' instead of the hardcoded URL
    };
  
    this.setName = function (username) {
      txtname.sendKeys(username);
    };
  
    this.setPass = function (password) {
      txtpwd.sendKeys(password);
    };
  
    this.sub = function () {
      submit.click();
    };
  
    // this.verifyResult = function (expectedUsername, expectedPassword) {
      
    //    const loggedInUsername = element(by.id("username"));
    //    const loggedInPassword = element(by.id("password"));
  
      
    //   expect(loggedInUsername.getText()).toBe(expectedUsername);
    //    expect(loggedInPassword.getText()).toBe(expectedPassword);
    //    console.log("successful")
    // };
  };
  
  module.exports = new pageobject();