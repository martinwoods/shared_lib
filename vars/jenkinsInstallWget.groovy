#!/usr/bin/env groovy
// vars/jenkinsWgetInstall.groovy

// Description: This method is used to install wget
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    sh "apt-get install unzip"
}