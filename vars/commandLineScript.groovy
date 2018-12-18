#!/usr/bin/env groovy
// vars/commandLineScript.groovy

// Description: Demo to test global shared lib functionality
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    sh """
        pwd
        whoami
        uname -a
        uptime
    """
}

return this
