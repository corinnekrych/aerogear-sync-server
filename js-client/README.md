# Sync JavaScript client tests
This module is only intended to provide test for the sync server

## Prerequisites
[Grunt](http://gruntjs.com/) is used to build this project. Grunt depends on the
[Node Package Manager](https://npmjs.org/) (npn) to install itself and it's plugins. Please follow the instructions
for installing in previous links to install npn and Grunt.

## Building
Install the required plugins before running the build the first time, or after adding dependencies to project.json:

    npm install

## Testing
First, start the sync server:

    grunt shell:server

Next, open the qunit test in a browser:

    open tests/sync/sync.html

