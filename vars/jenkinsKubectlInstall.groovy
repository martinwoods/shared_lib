#!/usr/bin/env groovy
// vars/jenkinsKubectlInstall.groovy

// Description: This funtion installs Kubectl  
// Written by: Martin Woods - martin@aid.technology

def call(KUBECTL_VERSION) {
    // Kubectl Install
    sh """
        curl -Lo /usr/local/bin/kubectl https://storage.googleapis.com/kubernetes-release/release/${KUBECTL_VERSION}/bin/linux/amd64/kubectl
        chmod a+x /usr/local/bin/kubectl
    """
    sh "kubectl version"
}