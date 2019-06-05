#!/usr/bin/env groovy
// vars/jenkinsHelmInstall.groovy

// Description: This funtion installs the Helm version we wish to use across all Jenkinsfile's that need to run Helm   
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call(HELM_VERSION) {

    sh """
        echo ${HELM_VERSION}
        curl -Lo /tmp/helm.tar.gz https://kubernetes-helm.storage.googleapis.com/helm-${HELM_VERSION}-linux-amd64.tar.gz
        tar -zxvf /tmp/helm.tar.gz -C /tmp
        mv /tmp/linux-amd64/helm /usr/local/bin/helm
        chmod +x /usr/local/bin/helm
    """
}