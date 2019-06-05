#!/usr/bin/env groovy
// vars/jenkinsUnzipInstall.groovy

// Description: This method is used to install unzip
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    sh "apt-get install unzip"
}