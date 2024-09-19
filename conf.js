exports.config={
    directConnect:true,
    capabilities:{
        'browserName':'chrome'
    },
    framework:'jasmine',
    
    specs:['login.js'],
    onPrepare:function(){
        browser.ignoreSynchronization=true;
    }
  }

  