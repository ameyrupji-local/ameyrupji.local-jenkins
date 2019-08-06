| [Home](./) ▸ **GitHub Setup** |
|-----|


# GitHub Setup

This page outlines the steps required to setup the GitHub.com connection to Jenkins server

## Prerequisites 

- Jenkins installed (Installation instructions: https://github.com/ameyrupji-local/ameyrupji.local-jenkins)
    - GitHub API Plugin installed (https://wiki.jenkins.io/display/JENKINS/GitHub+API+Plugin)

## System Configuration at time of test

- Jenkins - v2.186
    - GitHub Api Plugin - v3.11.0

## Installation instructions

### Generate GitHub.com personal access token


![github settings public profile](../images/github-settings-public-profile.png)
![github settings apps](../images/github-settings-apps.png)
![github settings generate token](../images/github-settings-generate-token.png)
![github settings generate token-page all](../images/github-settings-generate-token-page-all.png)
![github setting copy generated token](../images/github-setting-copy-generated-token.png)

### Setup GitHub api plugin

![jenkins settings github add server](../images/jenkins-settings-github-add-server.png)
![jenkins settings add github credentials](../images/jenkins-settings-add-github-credentials.png)


## Test 


![jenkins settings test connection](../images/jenkins-settings-test-connection.png)

## Cleanup

- Remove the settings added above from Jenkins.
- Remove the personal access token clicking on the Delete button.

## Useful Links

- https://www.macminivault.com/installing-jenkins-on-macos/
- https://mgrebenets.github.io/mobile%20ci/2015/02/01/jenkins-ci-server-on-osx
- https://wiki.jenkins.io/display/JENKINS/Jenkins+behind+an+NGinX+reverse+proxy