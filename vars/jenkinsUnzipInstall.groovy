#!/usr/bin/env groovy
// vars/jenkinsUnzipInstall.groovy

// Description: This method is used to install unzip
// Written by: Martin Woods - martin@aid.technology

def call() {
    sh "apt-get install unzip"
}