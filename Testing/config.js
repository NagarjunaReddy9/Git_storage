exports.config = {
    directConnect: true,
    capabilities: {
        'browserName': 'chrome'
    },
    framework: 'jasmine',
    specs: ['test.js'],
    jasmineNodeOpts: {
        defaultTimeoutInterval: 80000
    },
    onPrepare: function() {
        browser.ignoreSynchronization = true;
    }
}
