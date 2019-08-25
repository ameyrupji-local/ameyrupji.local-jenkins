#!/usr/bin/env groovy
package com.ameyrupji.jenkins

def call(String someString= "who?") {
    node {
        stage('Checkout') {
            chechout scm

            echo "Repository Url:"
            sh "git config --get remote.origin.url"

            echo "Repository Branch:"
            sh "git rev-parse --abbrev-ref HEAD"

            echo "Downloaded Repository:"
            sh "ls -a"
        }

        stage('Test') {
            echo "Test Pipeline! ${someString}"
        }
    }
}