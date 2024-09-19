exports.config = {
    directConnect: true,
    capabilities: {
        'browserName': 'chrome'
    },
    framework: 'jasmine',
    specs: ['test1.js'],
    jasmineNodeOpts: {
        defaultTimeoutInterval: 60000
    },
    onPrepare: function() {
        browser.ignoreSynchronization = true;
    }
}
