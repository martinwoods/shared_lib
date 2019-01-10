#!/usr/bin/env groovy
// vars/jenkinsWgetInstall.groovy

// Description: This method is used to install wget
// Written by: Martin Woods - martin@aid.technology

def call() {
    sh "apt-get install unzip"
}