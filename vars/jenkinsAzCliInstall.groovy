#!/usr/bin/env groovy
// vars/jenkinsAzCliInstall.groovy

// Description: This funtion installs the Azure CLI   
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {

    // AZ Install
    sh """
        apt-get -y install lsb-core
        lsb_release -cs
        apt-get -y install apt-transport-https
        export AZ_REPO=\$(lsb_release -cs) 
        echo \"deb [arch=amd64] https://packages.microsoft.com/repos/azure-cli/ \$AZ_REPO main\" | tee /etc/apt/sources.list.d/azure-cli.list
        curl -L https://packages.microsoft.com/keys/microsoft.asc | apt-key add -
        apt-get update
        apt-get -y install azure-cli
        az --version
    """
}