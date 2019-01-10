#!/usr/bin/env groovy
// vars/jenkinsChartMuseum.groovy

// Description: This method is used for setting up charts
// Written by: Martin Woods - martin@aid.technology

def call() {
    sh """
        export CHARTMUSEUM_USER=${CHARTMUSEUM_USER}
        export CHARTMUSEUM_PASS=${CHARTMUSEUM_PASS}
        helm repo add aidtech ${CHARTMUSEUM_URL} --username ${CHARTMUSEUM_USER} --password ${CHARTMUSEUM_PASS}
        helm repo update 
    """
}
