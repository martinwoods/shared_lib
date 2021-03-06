#!/usr/bin/env groovy
// vars/jenkinsIncubatorInstall.groovy

// Description: This funtion installs the Incubator 
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    // Incubator Install
    sh """
        helm init
        helm repo add incubator https://kubernetes-charts-incubator.storage.googleapis.com/
    """
}