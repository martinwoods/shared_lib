#!/usr/bin/env groovy
// vars/jenkinsPythonPipInstall.groovy

// Description: This funtion installs the Python PIP version we wish to use within our Jenkinsfile    
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
   // Python - pip install
    sh """
    cd /etc/apt/sources.list.d/ && rm -rf *
    apt-get update
    apt-get -y install python3-pip
    """
}